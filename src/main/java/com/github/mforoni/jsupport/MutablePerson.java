package com.github.mforoni.jsupport;

import org.joda.time.LocalDate;

/**
 * @author Foroni Marco
 */
public class MutablePerson extends Person {

	public MutablePerson() {
		super(null, null, null, null, null);
	}

	public MutablePerson(final String firstName, final String lastName, final LocalDate dateBirth, final Gender gender, final String email) {
		super(firstName, lastName, dateBirth, gender, email);
	}

	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	public void setDateBirth(final LocalDate dateBirth) {
		this.dateBirth = dateBirth;
	}

	public void setGender(final Gender gender) {
		this.gender = gender;
	}

	public void setEmail(final String email) {
		this.email = email;
	}
}
