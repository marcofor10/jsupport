package org.jfoma.jsupport;

import java.util.List;
import org.jfoma.jsupport.Person.Gender;
import org.joda.time.LocalDate;
import com.google.common.collect.Lists;

/**
 * @author Foroni Marco
 */
public final class MutablePersons {

	public static final MutablePerson MARCO_NERI = new MutablePerson("Marco", "Neri", new LocalDate(1988, 11, 7), Gender.MALE,
			"marco.neri@gmail.com");
	public static final MutablePerson MARIO_ROSSI = new MutablePerson("Mario", "Rossi", new LocalDate(1982, 1, 1), Gender.MALE,
			"mario.rossi@gmail.com");
	public static final List<MutablePerson> ARRAY_LIST = Lists.newArrayList(MARCO_NERI, MARIO_ROSSI);

	private MutablePersons() {
		throw new AssertionError();
	}
}
