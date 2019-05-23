package com.github.mforoni.jsupport;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.LocalDate;
import com.google.common.base.Preconditions;

/**
 * @author Foroni Marco
 */
public class Author extends MutablePerson {
  private final List<Book> books = new ArrayList<>();

  public Author(final String firstName, final String lastName, final LocalDate dateBirth,
      final Gender gender, final String email) {
    super(firstName, lastName, dateBirth, gender, email);
  }

  public List<Book> getBooks() {
    return books;
  }

  public void addBook(final Book book) {
    Preconditions.checkArgument(this.equals(book.getAuthor()));
  }
}
