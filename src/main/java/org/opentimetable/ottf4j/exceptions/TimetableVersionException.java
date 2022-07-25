package org.opentimetable.ottf4j.exceptions;

public class TimetableVersionException extends TimetableException {
	public TimetableVersionException() {
		super("This library only supports OTTF up to version 1.0");
	}
}