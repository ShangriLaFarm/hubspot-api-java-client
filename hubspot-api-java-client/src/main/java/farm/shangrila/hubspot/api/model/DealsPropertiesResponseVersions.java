package farm.shangrila.hubspot.api.model;

public class DealsPropertiesResponseVersions {

	@com.google.api.client.util.Key
	private String name;

	@com.google.api.client.util.Key
	private String value;

	@com.google.api.client.util.Key
	private Long timestamp;

	public DealsPropertiesResponseVersions() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

}
