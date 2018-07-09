package com.github.mforoni.jsupport;

import java.util.List;

import org.joda.time.LocalDate;
import com.google.common.collect.Lists;

/**
 * @author Foroni Marco
 */
public final class Authors {

	public static final Author ANNIE_DILLARD = new Author("Annie", "Dillard", new LocalDate(1945, 4, 30), Person.Gender.FEMALE, null,
			Books.ANNIE_DILLARD_BOOKS);
	public static final List<Author> ARRAY_LIST = Lists.newArrayList(ANNIE_DILLARD);

	private Authors() {
		throw new AssertionError();
	}
}