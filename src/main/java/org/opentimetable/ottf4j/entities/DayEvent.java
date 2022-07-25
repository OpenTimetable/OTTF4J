package org.opentimetable.ottf4j.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class DayEvent {
	@JsonProperty("title")
	private String title;
	@JsonProperty("location")
	private String location;
	@JsonProperty("hosts")
	private List<String> hosts;

	public DayEvent(String title, String location, List<String> hosts) {
		this.title = title;
		this.location = location;
		this.hosts = hosts;
	}

	public DayEvent() {
	}
}
