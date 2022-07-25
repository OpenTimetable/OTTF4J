package org.opentimetable.ottf4j.exceptions;

public class TimetableComposeException extends TimetableException {
	public TimetableComposeException(String message) {
		super("Failed to compose timetable: " + message);
	}
}