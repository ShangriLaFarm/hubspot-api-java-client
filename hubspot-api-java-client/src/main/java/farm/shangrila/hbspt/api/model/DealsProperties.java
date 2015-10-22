package farm.shangrila.hbspt.api.model;

public abstract class DealsProperties {
	
	@com.google.api.client.util.Key
	protected String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
