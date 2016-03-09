package farm.shangrila.hubspot.api.model;

import java.util.List;

public class Contacts {
	
	@com.google.api.client.util.Key
	private List<ContactsProperties> properties;

	public Contacts() {
		// TODO Auto-generated constructor stub
	}

	public List<ContactsProperties> getProperties() {
		return properties;
	}

	public void setProperties(List<ContactsProperties> properties) {
		this.properties = properties;
	}
}
