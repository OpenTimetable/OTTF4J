package org.opentimetable.ottf4j;

import com.adelean.inject.resources.junit.jupiter.GivenTextResource;
import com.adelean.inject.resources.junit.jupiter.TestWithResources;
import org.junit.jupiter.api.Test;
import org.opentimetable.ottf4j.entities.Timetable;
import org.opentimetable.ottf4j.exceptions.TimetableComposeException;
import org.opentimetable.ottf4j.exceptions.TimetableException;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestWithResources
class OpenTimetableTest {
	@GivenTextResource("example.ottf")
	static String ottfFile;

	static Timetable timetable;

	@Test
	void parseTimetable() throws TimetableException {
		timetable = OpenTimetable.parseTimetable(ottfFile);
	}

	@Test
	void composeTimetable() throws TimetableComposeException {
		String timetableString = OpenTimetable.composeTimetable(timetable);

		assertNotNull(timetableString);
		assertNotEquals("", timetableString);
	}
}
