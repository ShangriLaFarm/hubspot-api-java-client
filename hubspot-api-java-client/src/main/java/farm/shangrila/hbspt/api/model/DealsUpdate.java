package farm.shangrila.hbspt.api.model;

import java.util.List;

public class DealsUpdate {

	@com.google.api.client.util.Key
	private List<DealsProperties> properties;

	public DealsUpdate() {
	}

	public List<DealsProperties> getProperties() {
		return properties;
	}

	public void setProperties(List<DealsProperties> properties) {
		this.properties = properties;
	}
}
