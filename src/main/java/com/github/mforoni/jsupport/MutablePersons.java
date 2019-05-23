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
public final class MutablePersons {
  public static final MutablePerson MARCO_NERI = new MutablePerson("Marco", "Neri",
      new LocalDate(1988, 11, 7), Person.Gender.MALE, "marco.neri@gmail.com");
  public static final MutablePerson MARIO_ROSSI = new MutablePerson("Mario", "Rossi",
      new LocalDate(1982, 1, 1), Person.Gender.MALE, "mario.rossi@gmail.com");
  public static final List<MutablePerson> ARRAY_LIST = Lists.newArrayList(MARCO_NERI, MARIO_ROSSI);
  private static final DataFactory DATA_FACTORY = RandomData.INSTANCE.get();

  private MutablePersons() {
    throw new AssertionError();
  }

  public static List<MutablePerson> newRandomList(final int size) {
    final List<MutablePerson> persons = new ArrayList<>();
    for (int i = 0; i < size; i++) {
      final MutablePerson p = new MutablePerson(DATA_FACTORY.getFirstName(),
          DATA_FACTORY.getLastName(), new LocalDate(DATA_FACTORY.getBirthDate()),
          Gender.random(DATA_FACTORY), DATA_FACTORY.getEmailAddress());
      persons.add(p);
    }
    return persons;
  }
}
