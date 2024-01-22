package net.rotgruengelb.nixienaut.list;

import java.util.ArrayList;


/**
 * This class is just a wrapper for ArrayList to make it easier to<br>
 * add elements to the list in a chain.
 * and then return the list itself.
 * @see QuickArrayList#qAdd(E e)
 */
public class QuickArrayList<E> extends ArrayList<E> {

	/**
	 * This class is just a wrapper for ArrayList to make it easier to<br>
	 * add elements to the list in a chain.
	 * and then return the list itself.
	 * @param e The type of the elements in the list
	 * @return The list itself
	 * @see ArrayList#add(Object)
	 */
	public QuickArrayList<E> qAdd(E e) {
		super.add(e);
		return this;
	}
}
