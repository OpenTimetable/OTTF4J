package org.opentimetable.ottf4j.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Span {
	@JsonProperty("from")
	private String from;
	@JsonProperty("to")
	private String to;

	public Span(String from, String to) {
		this.from = from;
		this.to = to;
	}

	public Span() {
	}
}
