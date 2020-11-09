package utils;

/**
 * Generic class that holds two Objects.
 * @implNote this class could have easily been imported, but was done as an academic exercise.
 *
 * @param <T> the type for the first parameter.
 * @param <V> the type for the second parameter.
 */
public class Pair<T, V> {

	/**
	 * The first element of the pair.
	 */
	private T first;
	/**
	 * The second element of the pair
	 */
	private V second;
	
	public Pair(T first, V second) {
		this.first= first;
		this.second = second;
	}

	/**
	 * @return the first
	 */
	protected T getFirst() {
		return first;
	}

	/**
	 * @return the second
	 */
	protected V getSecond() {
		return second;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Pair [first=" + first + ", second=" + second + "]";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((first == null) ? 0 : first.hashCode());
		result = prime * result + ((second == null) ? 0 : second.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pair<?, ?> other = (Pair<?, ?>) obj;
		if (first == null) {
			if (other.first != null)
				return false;
		} else if (!first.equals(other.first))
			return false;
		if (second == null) {
			if (other.second != null)
				return false;
		} else if (!second.equals(other.second))
			return false;
		return true;
	}


	
	
	
}
