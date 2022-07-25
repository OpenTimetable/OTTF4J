package org.opentimetable.ottf4j.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OTTFVersion {
	@JsonProperty("version")
	private String version;

	public OTTFVersion(String version) {
		this.version = version;
	}

	public OTTFVersion() {
	}
}