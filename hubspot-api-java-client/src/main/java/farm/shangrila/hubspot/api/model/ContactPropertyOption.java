package farm.shangrila.hubspot.api.model;

public class ContactPropertyOption {

	@com.google.api.client.util.Key
	private String value;

	@com.google.api.client.util.Key
	private String label;

	@com.google.api.client.util.Key
	private Long displayOrder;
		
	public ContactPropertyOption() {}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Long getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(Long displayOrder) {
		this.displayOrder = displayOrder;
	}
	
}
