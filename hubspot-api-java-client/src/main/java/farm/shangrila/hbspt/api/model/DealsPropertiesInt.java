package farm.shangrila.hbspt.api.model;

public class DealsPropertiesInt extends DealsProperties {

	@com.google.api.client.util.Key
	private Integer value;

	public DealsPropertiesInt() {
		// TODO Auto-generated constructor stub
	}

	public DealsPropertiesInt(String name, Integer value) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.value = value;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}
}
