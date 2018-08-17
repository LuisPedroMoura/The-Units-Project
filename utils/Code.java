/***************************************************************************************
*	Title: PotatoesProject - Code Class Source Code
*	Code version: 2.0
*	Author: Luis Moura (https://github.com/LuisPedroMoura)
*	Acknowledgments for version 1.0: Maria Joao Lavoura (https://github.com/mariajoaolavoura),
*	for the help in brainstorming the concepts needed to create the first working version
*	of this Class.
*	Date: July-2018
*	Availability: https://github.com/LuisPedroMoura/PotatoesProject
*
***************************************************************************************/

package unitsGrammar.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * <b>Code</b><p>
 * 
 * @author Luis Moura (https://github.com/LuisPedroMoura)
 * @version 2.0 - July 2018
 */
public class Code {
	
	private List<Integer> numCodes = new ArrayList<>();;		// numerator codes
	private List<Integer> denCodes = new ArrayList<>();;		// denominator codes
	
	/**
	 * Constructor of empty Code, to use in Units operations
	 */
	public Code () {}
	
	/**
	 * Constructor for Code of basic Types
	 * @param primeNumber
	 */
	public Code (Integer number) {
		numCodes.add(number);
	}
	
	/**
	 * Copy Constructor
	 * @param code
	 * @throws NullPointerException if <b>code<b> is null.
	 */
	public Code (Code code) {
		this.numCodes = new ArrayList<>();
		for (int numCode : code.getNumCodes()) {
			this.numCodes.add(numCode);
		}
		this.denCodes = new ArrayList<>();
		for (int denCode : code.getDenCodes()) {
			this.denCodes.add(denCode);
		}
	}
	
	/**
	 * @return numCodes
	 */
	public List<Integer> getNumCodes() {
		return numCodes;
	}
	
	/**
	 * @return denCodes
	 */
	public List<Integer> getDenCodes() {
		return denCodes;
	}
	
	/**
	 * @param a
	 * @param b
	 * @return a new Code resulting of the multiplication of the two Codes
	 */
	public static Code multiply(Code a, Code b) {
		Code newCode = new Code();
		newCode.multiplyCode(a);
		newCode.multiplyCode(b);		
		return newCode;
	}
	private void multiplyCode(Code code) {
		for (int numCode : code.getNumCodes()) {
			this.numCodes.add(numCode);
		}
		for (int denCode : code.getDenCodes()) {
			this.denCodes.add(denCode);
		}
	}
	
	/** 
	 * @param a
	 * @param b
	 * @return a new Code resulting of the division of the two Codes
	 */
	public static Code divide(Code a, Code b) {
		Code newCode = new Code();
		newCode.multiplyCode(a);
		newCode.divideCode(b);		
		return newCode;
	}
	private void divideCode(Code code) {
		for (int numCode : code.getNumCodes()) {
			this.denCodes.add(numCode);
		}
		for (int denCode : code.getDenCodes()) {
			this.numCodes.add(denCode);
		}
	}
	
	/**
	 * @param a
	 * @param exponent
	 * @return a new Code resulting of the power of the Code
	 */
	public static Code power(Code a, int exponent) {
		Code newCode = new Code();
		for (int i = 0; i < exponent; i++) {
			newCode.multiplyCode(a);
		}
		return newCode;
	}
	
	/**
	 * simplifies Code by removing duplicate codes in numCodes and denCodes
	 */
	public void simplifyCode() {
		for (Integer numCode : numCodes) {
			if (denCodes.contains(numCode)) {
				numCodes.remove(numCode);
				denCodes.remove(numCode);
			}
		}
	}
	
	/**
	 * To simplify a Code using conversion from the give Graph of Units some conversions might be necessary, ie:
	 * m^2/yd -> m^2/m, to obtain m.
	 * @param typesGraph
	 * @return 	the conversion factor obtained from the Code simplification.
	 * 			So when Unit containing this Code is used in with an associated quantity,
	 * 			this conversion factor must be applied to the quantity value.
	 */
	public double simplifyCodeWithConvertions(Graph typesGraph) {
		Double factor = 1.0;
		Double conversionFactor = 1.0;
		while (conversionFactor != null) {
			factor *= conversionFactor;
			conversionFactor = simplifyCodeWithConvertionsPrivate(typesGraph);
		}
		return factor;
	}
	// TODO not very efficient (think of what structure to use)
	private Double simplifyCodeWithConvertionsPrivate(Graph typesGraph) {
		Map<Integer, Unit> basicTypesCodesTable = Unit.getBasicUnitsCodesTable();
		for (int numCode : this.numCodes) {
			Unit numType = basicTypesCodesTable.get(numCode);
			for (int denCode : this.denCodes) {
				Unit denType = basicTypesCodesTable.get(denCode);
				double conversionFactor = typesGraph.getEdge(numType, denType);
				if (conversionFactor != Double.POSITIVE_INFINITY){
					numCodes.remove(numCode);
					denCodes.remove(denCode);
					return conversionFactor;
				}
			}
		}
		return null;
	}
	
	
	
	@Override
	public String toString() {
		
		// For Debug Purposes Only
		StringBuilder builder = new StringBuilder();
		builder.append("Code [");
		if (numCodes != null) {
			builder.append(numCodes);
			builder.append(" / ");
		}
		if (denCodes != null) {
			builder.append(denCodes);
		}
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((denCodes == null) ? 0 : denCodes.hashCode());
		result = prime * result + ((numCodes == null) ? 0 : numCodes.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Code other = (Code) obj;
		if (denCodes == null) {
			if (other.denCodes != null)
				return false;
		} else if (!denCodes.equals(other.denCodes))
			return false;
		if (numCodes == null) {
			if (other.numCodes != null)
				return false;
		} else if (!numCodes.equals(other.numCodes))
			return false;
		return true;
	}
	
}
