package com.github.mforoni.jsupport;

import javax.annotation.concurrent.Immutable;
import org.joda.time.LocalDate;

/**
 * @author Foroni Marco
 */
@Immutable
public final class ImmutablePerson extends Person {

	public ImmutablePerson(final String firstName, final String lastName, final LocalDate dateBirth, final Gender gender, final String email) {
		super(firstName, lastName, dateBirth, gender, email);
	}
}
