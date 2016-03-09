package farm.shangrila.hubspot.api.model;

import java.util.List;

public class ContactPropertyOptionsResponse {

	@com.google.api.client.util.Key
	private String name;

	@com.google.api.client.util.Key
	private String label;

	@com.google.api.client.util.Key
	private String groupName;

	@com.google.api.client.util.Key
	private String fieldType;

	@com.google.api.client.util.Key
	private List<ContactPropertyOption> options;

	public ContactPropertyOptionsResponse() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ContactPropertyOption> getOptions() {
		return options;
	}

	public void setOptions(List<ContactPropertyOption> options) {
		this.options = options;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getFieldType() {
		return fieldType;
	}

	public void setFieldType(String fieldType) {
		this.fieldType = fieldType;
	}
	
}
