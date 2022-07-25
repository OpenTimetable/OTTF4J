package org.opentimetable.ottf4j.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Metadata {
	@JsonProperty("version")
	private String version;
	@JsonProperty("timezone")
	private String timezone;
	@JsonProperty("author")
	private String author;
	@JsonProperty("timestamp")
	private Long timestamp;

	public Metadata(String version, String timezone, String author, Long timestamp) {
		this.version = version;
		this.timezone = timezone;
		this.author = author;
		this.timestamp = timestamp;
	}

	public Metadata(String version, String timezone, Long timestamp) {
		this.version = version;
		this.timezone = timezone;
		this.timestamp = timestamp;
	}

	public Metadata() {
	}
}
