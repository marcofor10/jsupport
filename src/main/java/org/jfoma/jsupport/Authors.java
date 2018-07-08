package org.jfoma.jsupport;

import org.jfoma.jsupport.Person.Gender;
import org.joda.time.LocalDate;

/**
 * @author Foroni Marco
 */
public final class Authors {

	public static final Author ANNIE_DILLARD = new Author("Annie", "Dillard", new LocalDate(1945, 4, 30), Gender.FEMALE, null,
			Books.ANNIE_DILLARD_BOOKS);

	private Authors() {
		throw new AssertionError();
	}
}