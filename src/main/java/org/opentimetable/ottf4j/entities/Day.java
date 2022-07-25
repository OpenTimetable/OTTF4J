package org.opentimetable.ottf4j.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.TreeMap;

@Getter
@Setter
public class Day {
	@JsonProperty("classes")
	private TreeMap<String, List<ClassEvent>> classes;
	@JsonProperty("events")
	private List<Event> events;
	@JsonProperty("dayevents")
	private List<DayEvent> dayevents;

	public Day(TreeMap<String, List<ClassEvent>> classes, List<Event> events, List<DayEvent> dayevents) {
		this.classes = classes;
		this.events = events;
		this.dayevents = dayevents;
	}

	public Day() {
	}
}
