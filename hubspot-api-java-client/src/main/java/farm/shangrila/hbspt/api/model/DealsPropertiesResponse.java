package farm.shangrila.hbspt.api.model;

import java.util.List;

public class DealsPropertiesResponse extends DealsProperties {

	@com.google.api.client.util.Key
	private String value;
	
	@com.google.api.client.util.Key
	private Long timestamp;
	
	@com.google.api.client.util.Key
	private List<DealsPropertiesResponseVersions> versions;
	

	public DealsPropertiesResponse() {
	}


	public String getValue() {
		return value;
	}


	public void setValue(String value) {
		this.value = value;
	}


	public Long getTimestamp() {
		return timestamp;
	}


	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}


	public List<DealsPropertiesResponseVersions> getVersions() {
		return versions;
	}


	public void setVersions(List<DealsPropertiesResponseVersions> versions) {
		this.versions = versions;
	}
}
