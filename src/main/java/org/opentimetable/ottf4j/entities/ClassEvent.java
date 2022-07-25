package org.opentimetable.ottf4j.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ClassEvent {
	@JsonProperty("substitution")
	private Boolean substitution;
	@JsonProperty("examination")
	private Boolean examination;
	@JsonProperty("canceled")
	private Boolean canceled;
	@JsonProperty("name")
	private String name;
	@JsonProperty("abbreviation")
	private String abbreviation;
	@JsonProperty("location")
	private String location;
	@JsonProperty("hosts")
	private List<String> hosts;

	public ClassEvent(Boolean substitution, Boolean examination, Boolean canceled, String name, String abbreviation, String location, List<String> hosts) {
		this.substitution = substitution;
		this.examination = examination;
		this.canceled = canceled;
		this.name = name;
		this.abbreviation = abbreviation;
		this.location = location;
		this.hosts = hosts;
	}

	public ClassEvent() {
	}
}
