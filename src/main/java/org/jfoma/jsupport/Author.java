package org.jfoma.jsupport;

import java.util.List;
import org.joda.time.LocalDate;

/**
 * @author Foroni Marco
 */
public class Author extends MutablePerson {

	private final List<Book> books;

	public Author(final String firstName, final String lastName, final LocalDate dateBirth, final Gender gender, final String email,
			final List<Book> books) {
		super(firstName, lastName, dateBirth, gender, email);
		this.books = books;
	}

	public List<Book> getBooks() {
		return books;
	}
}
