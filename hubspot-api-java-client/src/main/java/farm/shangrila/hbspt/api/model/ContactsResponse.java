package farm.shangrila.hbspt.api.model;

import java.util.Map;

public class ContactsResponse {
	
	@com.google.api.client.util.Key
	private Long vid;
	
	@com.google.api.client.util.Key
	private Map<String, ContactsProperties> properties;

	public ContactsResponse() {
		// TODO Auto-generated constructor stub
	}

	public Long getVid() {
		return vid;
	}

	public void setVid(Long vid) {
		this.vid = vid;
	}

	public Map<String, ContactsProperties> getProperties() {
		return properties;
	}

	public void setProperties(Map<String, ContactsProperties> properties) {
		this.properties = properties;
	}
	
	
}
