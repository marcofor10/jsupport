package org.jfoma.jsupport.beans;

import java.io.Serializable;
import java.util.List;
import com.google.common.base.MoreObjects;

public class PersonBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9022709873867929219L;
	/** Properties **/
	private boolean deceased = false;
	private List<String> list;
	/** Property <code>name</code> (note capitalization) readable/writable. */
	private String name = null;

	/** No-arg constructor (takes no arguments). */
	public PersonBean() {}

	public List<String> getList() {
		return list;
	}

	public void setList(final List<String> list) {
		this.list = list;
	}

	/**
	 * Getter for property <code>name</code>
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter for property <code>name</code>.
	 *
	 * @param value
	 */
	public void setName(final String value) {
		this.name = value;
	}

	/**
	 * Getter for property "deceased" Different syntax for a boolean field (is v.s. get)
	 */
	public boolean isDeceased() {
		return deceased;
	}

	/**
	 * Setter for property <code>deceased</code>.
	 * 
	 * @param value
	 */
	public void setDeceased(final boolean value) {
		deceased = value;
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).add("deceased", deceased).add("list", list).add("name", name).toString();
	}
}
