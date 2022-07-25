package org.opentimetable.ottf4j.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.TreeMap;

@Getter
@Setter
public class Cues {
	@JsonProperty("periods")
	private TreeMap<String, Span> periods;
	@JsonProperty("recesses")
	private List<Span> recesses;

	public Cues(TreeMap<String, Span> periods, List<Span> recesses) {
		this.periods = periods;
		this.recesses = recesses;
	}

	public Cues() {
	}
}
