package com.github.mforoni.jsupport;

import org.joda.time.LocalDate;

public class Employee extends MutablePerson {
  private int salary;

  public Employee() {
    super();
  }

  public Employee(final String firstName, final String lastName, final LocalDate dateBirth,
      final Gender gender, final String email, final int salary) {
    super(firstName, lastName, dateBirth, gender, email);
    this.salary = salary;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(final int salary) {
    this.salary = salary;
  }
}
