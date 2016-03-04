package farm.shangrila.hbspt.api.model;

import java.util.List;

public class ContactPropertyOptionsResponse {

	@com.google.api.client.util.Key
	private String name;
	
	@com.google.api.client.util.Key
	private List<String> options;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getOptions() {
		return options;
	}

	public void setOptions(List<String> options) {
		this.options = options;
	}
	
}
