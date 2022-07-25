package org.opentimetable.ottf4j.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.opentimetable.ottf4j.entities.Timetable;
import org.opentimetable.ottf4j.exceptions.TimetableComposeException;
import org.opentimetable.ottf4j.exceptions.TimetableParseException;

public class Parser {
	private static final ObjectMapper om;

	static {
		om = new ObjectMapper();
		om.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	}

	public static Timetable parseTimetable(String rawTimetable) throws TimetableParseException {
		try {
			return om.readValue(rawTimetable, Timetable.class);
		} catch(JsonProcessingException e) {
			throw new TimetableParseException(e.getMessage());
		}
	}

	public static String composeTimetable(Timetable timetable) throws TimetableComposeException {
		try {
			return om.writeValueAsString(timetable);
		} catch(JsonProcessingException e) {
			throw new TimetableComposeException(e.getMessage());
		}
	}
}
