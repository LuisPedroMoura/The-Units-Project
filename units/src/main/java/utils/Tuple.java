/*
* Title: The Units Project
* Availability: https://github.com/LuisPedroMoura/The_Units_Project
*/

package utils;

import units.units.Unit;

/**
 * Class that stores the results of mathematical operations that always involve
 * a Unit and a multiplying factor.
 *
 * @author Luis Moura (https://github.com/LuisPedroMoura)
 * @since 1.0.0
 */
public class Tuple extends Pair<Unit, Double> {

	/**
	 * Tuple Object Constructor.
	 *
	 * @param unit	 the Unit to store.
	 * @param factor the multiplying factor.
	 */
	public Tuple(final Unit unit, final Double factor) {
		super(unit, factor);
	}


	/**
	 * The getter for the first element.
	 *
	 * @return the first element.
	 */
	public Unit getUnit() {
		return getFirst();
	}

	/**
	 * The getter for the second element.
	 *
	 * @return the second element.
	 */
	public Double getFactor() {
		return getSecond();
	}

	@Override
	public String toString() {
		return "Tuple [first=" + getFirst() + ", second=" + getSecond() + "]";
	}
}
