package org.opentimetable.ottf4j.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Event {
	@JsonProperty("from")
	private String from;
	@JsonProperty("to")
	private String to;
	@JsonProperty("title")
	private String title;
	@JsonProperty("location")
	private String location;
	@JsonProperty("hosts")
	private List<String> hosts;

	public Event(String from, String to, String title, String location, List<String> hosts) {
		this.from = from;
		this.to = to;
		this.title = title;
		this.location = location;
		this.hosts = hosts;
	}

	public Event() {
	}
}
