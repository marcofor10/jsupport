package com.github.mforoni.jsupport;

import static com.github.mforoni.jsupport.Authors.ANNIE_DILLARD;
import java.util.ArrayList;
import java.util.List;
import org.fluttercode.datafactory.impl.DataFactory;
import org.joda.time.LocalDate;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;

/**
 * @author Foroni Marco
 */
public final class Books {
  public static final Book TICKETS_FOR_A_PRAYER_WHEEL =
      new Book("0-8195-6536-9", "Tickets for a Prayer Wheel", 1974, ANNIE_DILLARD);
  public static final Book PILGRIM_AT_TIKER_CREEK =
      new Book("0-06-095302-0", "Pilgrim at Tinker Creek ", 1974, ANNIE_DILLARD);
  public static final Book HOLY_THE_FIRM =
      new Book("0-06-091543-9", "Holy The Firm", 1977, ANNIE_DILLARD);
  public static final Book LIVING_BY_FICTION =
      new Book("0-06-091544-7", "Living By Fiction ", 1982, ANNIE_DILLARD);
  public static final Book TEACHING_A_STONE_TO_TALK =
      new Book("0-06-091541-2", "Teaching a Stone To Talk", 1982, ANNIE_DILLARD);
  public static final Book ENCOUNTERS_WITH_CHINESE_WRITERS =
      new Book("0-8195-6156-8", "Encounters with Chinese Writers", 1984, ANNIE_DILLARD);
  public static final Book AN_AMERICAN_CHILDHOOD =
      new Book("0-06-091518-8", "An American Childhood", 1987, ANNIE_DILLARD);
  public static final Book THE_WRITING_LIFE =
      new Book("0-06-091988-4", "The Writing Life", 1989, ANNIE_DILLARD);
  public static final Book THE_LIVING =
      new Book("0-06-092411-X", "The Living", 1992, ANNIE_DILLARD);
  public static final Book MORNINGS_LIKE =
      new Book("0-06-092725-9", "Mornings Like This: Found Poems", 1995, ANNIE_DILLARD);
  public static final Book FOR_THE_TIME_BEING =
      new Book("0-375-40380-9", "For the Time Being", 1999, ANNIE_DILLARD);
  public static final Book THE_MAYTRESS =
      new Book("0-06-123953-4", "The Maytrees", 2007, ANNIE_DILLARD);
  public static final Book THE_ABUNDANCE =
      new Book("0-06-243297-4", "The Abundance: Narrative Essays Old & New", 2016, ANNIE_DILLARD);
  public static final List<Book> ANNIE_DILLARD_BOOKS = Lists.newArrayList(
      TICKETS_FOR_A_PRAYER_WHEEL, PILGRIM_AT_TIKER_CREEK, HOLY_THE_FIRM, LIVING_BY_FICTION,
      TEACHING_A_STONE_TO_TALK, ENCOUNTERS_WITH_CHINESE_WRITERS, AN_AMERICAN_CHILDHOOD,
      THE_WRITING_LIFE, THE_LIVING, MORNINGS_LIKE, FOR_THE_TIME_BEING, THE_MAYTRESS, THE_ABUNDANCE);
  private static final DataFactory DATA_FACTORY = RandomData.INSTANCE.get();

  private Books() {
    throw new AssertionError();
  }

  public static List<Book> newRandomList(final int size, final List<Author> authors) {
    Preconditions.checkArgument(authors.size() > 0);
    final List<Book> books = new ArrayList<>();
    for (int i = 0; i < size; i++) {
      final Author a = authors.get(DATA_FACTORY.getNumberBetween(0, authors.size() - 1));
      final Book b = new Book(DATA_FACTORY.getRandomWord(10), DATA_FACTORY.getRandomText(5, 60),
          DATA_FACTORY.getNumberBetween(1900, new LocalDate().getYear()), a);
      books.add(b);
    }
    return books;
  }
}
