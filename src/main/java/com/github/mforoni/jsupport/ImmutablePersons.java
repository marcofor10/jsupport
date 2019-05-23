package com.github.mforoni.jsupport;

import java.util.ArrayList;
import java.util.List;
import org.fluttercode.datafactory.impl.DataFactory;
import org.joda.time.LocalDate;
import com.github.mforoni.jsupport.Person.Gender;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

/**
 * @author Foroni Marco
 */
public final class ImmutablePersons {
  public static final ImmutablePerson MARCO_NERI = new ImmutablePerson("Marco", "Neri",
      new LocalDate(1988, 11, 7), Gender.MALE, "marco.neri@gmail.com");
  public static final ImmutablePerson MARIO_ROSSI = new ImmutablePerson("Mario", "Rossi",
      new LocalDate(1982, 1, 1), Gender.MALE, "mario.rossi@gmail.com");
  public static final ImmutableList<ImmutablePerson> IMMUTABLE_LIST =
      ImmutableList.of(MARCO_NERI, MARIO_ROSSI);
  public static final List<ImmutablePerson> ARRAY_LIST =
      Lists.newArrayList(MARCO_NERI, MARIO_ROSSI);
  private static final DataFactory DATA_FACTORY = RandomData.INSTANCE.get();

  private ImmutablePersons() {
    throw new AssertionError();
  }

  public static List<ImmutablePerson> newRandomList(final int size) {
    final List<ImmutablePerson> persons = new ArrayList<>();
    for (int i = 0; i < size; i++) {
      final ImmutablePerson p = new ImmutablePerson(DATA_FACTORY.getFirstName(),
          DATA_FACTORY.getLastName(), new LocalDate(DATA_FACTORY.getBirthDate()),
          Gender.random(DATA_FACTORY), DATA_FACTORY.getEmailAddress());
      persons.add(p);
    }
    return persons;
  }
}
