package org.opentimetable.ottf4j;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.opentimetable.ottf4j.entities.Metadata;
import org.opentimetable.ottf4j.entities.Timetable;
import org.opentimetable.ottf4j.exceptions.TimetableComposeException;
import org.opentimetable.ottf4j.exceptions.TimetableException;
import org.opentimetable.ottf4j.exceptions.TimetableParseException;
import org.opentimetable.ottf4j.exceptions.TimetableVersionException;
import org.opentimetable.ottf4j.util.Parser;

/**
 * @author chocoearly44
 * @since 1.0
 */
public class OpenTimetable {
	private static final ObjectMapper om;

	static {
		om = new ObjectMapper();
		om.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	}

	/**
	 * Method is used to parse timetable
	 *
	 * @param timetable Raw timetable string
	 * @return Parsed timetable object
	 * @throws TimetableVersionException Timetable has unknown version
	 * @throws TimetableParseException   There was an error parsing the timetable
	 */
	public static Timetable parseTimetable(String timetable) throws TimetableException {
		try {
			String version = om.readTree(timetable)
					.findValue("metadata")
					.findValue("version")
					.asText();

			if(!version.equals("1.0")) {
				throw new TimetableVersionException();
			}

			return Parser.parseTimetable(timetable);
		} catch(JsonProcessingException e) {
			throw new TimetableParseException(e.getMessage());
		}
	}

	/**
	 * Method is used to create OTTF string from a Timetable object
	 *
	 * @param timetable Timetable object
	 * @return OTTF compliant timetable String
	 * @throws TimetableComposeException There was an error composing the String
	 */
	public static String composeTimetable(Timetable timetable) throws TimetableComposeException {
		try {
			return Parser.composeTimetable(timetable);
		} catch(TimetableComposeException e) {
			throw new TimetableComposeException(e.getMessage());
		}
	}
}
