package farm.shangrila.hubspot.api.model;

import java.util.List;

public class Deals {
	
	@com.google.api.client.util.Key
	private DealsAssociation associations;
	
	@com.google.api.client.util.Key
	private Long portaId;
	
	@com.google.api.client.util.Key
	private List<DealsProperties> properties;

	public Deals() {
		// TODO Auto-generated constructor stub
	}

	public DealsAssociation getAssociations() {
		return associations;
	}

	public void setAssociations(DealsAssociation associations) {
		this.associations = associations;
	}

	public Long getPortaId() {
		return portaId;
	}

	public void setPortaId(Long portaId) {
		this.portaId = portaId;
	}

	public List<DealsProperties> getProperties() {
		return properties;
	}

	public void setProperties(List<DealsProperties> properties) {
		this.properties = properties;
	}
}
