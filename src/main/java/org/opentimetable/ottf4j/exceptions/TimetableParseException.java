package org.opentimetable.ottf4j.exceptions;

public class TimetableParseException extends TimetableException {
	public TimetableParseException(String message) {
		super("Failed to parse timetable: " + message);
	}
}