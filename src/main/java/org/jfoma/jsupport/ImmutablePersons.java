package org.jfoma.jsupport;

import java.util.List;
import org.jfoma.jsupport.Person.Gender;
import org.joda.time.LocalDate;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

/**
 * @author Foroni Marco
 */
public final class ImmutablePersons {

	public static final ImmutablePerson MARCO_NERI = new ImmutablePerson("Marco", "Neri", new LocalDate(1988, 11, 7), Gender.MALE,
			"marco.neri@gmail.com");
	public static final ImmutablePerson MARIO_ROSSI = new ImmutablePerson("Mario", "Rossi", new LocalDate(1982, 1, 1), Gender.MALE,
			"mario.rossi@gmail.com");
	public static final ImmutableList<ImmutablePerson> IMMUTABLE_LIST = ImmutableList.of(MARCO_NERI, MARIO_ROSSI);
	public static final List<ImmutablePerson> ARRAY_LIST = Lists.newArrayList(MARCO_NERI, MARIO_ROSSI);

	private ImmutablePersons() {
		throw new AssertionError();
	}
}
