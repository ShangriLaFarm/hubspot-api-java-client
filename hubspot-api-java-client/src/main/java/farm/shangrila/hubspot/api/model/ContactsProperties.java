package farm.shangrila.hubspot.api.model;

public class ContactsProperties {
	
	@com.google.api.client.util.Key
	protected String property;
	
	@com.google.api.client.util.Key
	protected String value;

	public ContactsProperties() {
	}

	public ContactsProperties(String property, String value) {
		this.property = property;
		this.value = value;
	}

	public String getProperty() {
		return property;
	}

	public void setProperty(String property) {
		this.property = property;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
