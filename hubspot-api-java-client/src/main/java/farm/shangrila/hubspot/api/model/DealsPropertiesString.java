package farm.shangrila.hubspot.api.model;

public class DealsPropertiesString extends DealsProperties {
	
	@com.google.api.client.util.Key
	private String value;

	public DealsPropertiesString() {
		// TODO Auto-generated constructor stub
	}

	public DealsPropertiesString(String name, String value) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
