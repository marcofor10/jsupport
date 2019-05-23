package com.github.mforoni.jsupport;

import java.util.ArrayList;
import java.util.List;
import org.fluttercode.datafactory.impl.DataFactory;
import org.joda.time.LocalDate;
import com.github.mforoni.jsupport.Person.Gender;

public final class Employees {
  private static final DataFactory DATA_FACTORY = RandomData.INSTANCE.get();

  private Employees() {
    throw new AssertionError();
  }

  public static List<Employee> newRandomList(final int size) {
    final List<Employee> employees = new ArrayList<>();
    for (int i = 0; i < size; i++) {
      final Employee e = new Employee(DATA_FACTORY.getFirstName(), DATA_FACTORY.getLastName(),
          new LocalDate(DATA_FACTORY.getBirthDate()), Gender.random(DATA_FACTORY),
          DATA_FACTORY.getEmailAddress(), DATA_FACTORY.getNumberBetween(1_000, 5_000));
      employees.add(e);
    }
    return employees;
  }
}
