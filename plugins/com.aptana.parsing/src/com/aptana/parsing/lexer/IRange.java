package com.aptana.parsing.lexer;

public interface IRange
{

	/**
	 * Gets the starting offset for this range.
	 * 
	 * @return the starting offset for this range
	 */
	int getStartingOffset();

	/**
	 * Gets the ending offset for this range.
	 * 
	 * @return the ending offset for this range
	 */
	int getEndingOffset();

	/**
	 * Gets the total length between the starting offset and the ending offset in this range.
	 * 
	 * @return the length of this range
	 */
	int getLength();
}
