package org.jfoma.jsupport;

/**
 * @author Foroni Marco
 */
public class Book {

	private final String isbn;
	private final String title;
	private final int year;
	private final Author author;

	public Book(final String isbn, final String title, final int year, final Author author) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.year = year;
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getTitle() {
		return title;
	}

	public int getYear() {
		return year;
	}

	public Author getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", year=" + year + ", author=" + author + "]";
	}
}
