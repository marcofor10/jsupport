package com.github.mforoni.jsupport;

import javax.annotation.Nullable;
import org.fluttercode.datafactory.impl.DataFactory;
import org.joda.time.LocalDate;
import com.google.common.base.Function;

/**
 * @author Foroni Marco
 */
public class Person {
  public enum Gender {
    MALE, FEMALE;
    public static Gender random(final DataFactory dataFactory) {
      return dataFactory.chance(50) ? Gender.MALE : Gender.FEMALE;
    }
  }

  public static final Function<Person, String> GET_LASTNAME = new Function<Person, String>() {
    @Override
    public String apply(@Nullable final Person p) {
      return p == null ? null : p.getLastName();
    }
  };
  protected String firstName;
  protected String lastName;
  protected LocalDate dateBirth;
  protected Gender gender;
  protected String email;

  Person(final String firstName, final String lastName, final LocalDate dateBirth,
      final Gender gender, final String email) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.dateBirth = dateBirth;
    this.gender = gender;
    this.email = email;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public LocalDate getDateBirth() {
    return dateBirth;
  }

  public Gender getGender() {
    return gender;
  }

  public String getEmail() {
    return email;
  }

  @Override
  public String toString() {
    return firstName + " " + lastName;
  }
}
