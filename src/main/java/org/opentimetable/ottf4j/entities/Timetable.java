package org.opentimetable.ottf4j.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.TreeMap;

@Getter
@Setter
public class Timetable {
	@JsonProperty("metadata")
	private Metadata metadata;
	@JsonProperty("cues")
	private Cues cues;
	@JsonProperty("days")
	private TreeMap<String, Day> days;

	public Timetable(Metadata metadata, Cues cues, TreeMap<String, Day> days) {
		this.metadata = metadata;
		this.cues = cues;
		this.days = days;
	}

	public Timetable() {
	}
}
