package com.github.mforoni.jsupport;

import java.util.ArrayList;
import java.util.List;
import org.fluttercode.datafactory.impl.DataFactory;
import org.joda.time.LocalDate;
import com.github.mforoni.jsupport.Person.Gender;
import com.google.common.collect.Lists;

/**
 * @author Foroni Marco
 */
public final class Authors {
  public static final Author ANNIE_DILLARD =
      new Author("Annie", "Dillard", new LocalDate(1945, 4, 30), Gender.FEMALE, null);
  public static final Author GEORGE_MARTIN =
      new Author(" George Raymond", "Martin", new LocalDate(1958, 9, 20), Gender.MALE, null);
  static {
    for (final Book b : Books.ANNIE_DILLARD_BOOKS) {
      ANNIE_DILLARD.addBook(b);
    }
  }
  public static final List<Author> ARRAY_LIST = Lists.newArrayList(ANNIE_DILLARD, GEORGE_MARTIN);
  private static final DataFactory DATA_FACTORY = RandomData.INSTANCE.get();

  private Authors() {
    throw new AssertionError();
  }

  public static List<Author> newRandomList(final int size, final int books) {
    final List<Author> authors = new ArrayList<>();
    for (int i = 0; i < size; i++) {
      final Author p = new Author(DATA_FACTORY.getFirstName(), DATA_FACTORY.getLastName(),
          new LocalDate(DATA_FACTORY.getBirthDate()), Gender.random(DATA_FACTORY),
          DATA_FACTORY.getEmailAddress());
      authors.add(p);
    }
    for (final Book b : Books.newRandomList(books, authors)) {
      final Author a = b.getAuthor();
      a.addBook(b);
    }
    return authors;
  }
}
