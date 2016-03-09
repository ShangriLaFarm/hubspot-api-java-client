package farm.shangrila.hubspot.api.model;

import java.util.Map;

public class DealsResponse {

	@com.google.api.client.util.Key
	private Long dealId;

	@com.google.api.client.util.Key
	private Map<String, DealsPropertiesResponse> properties;

	public DealsResponse() {
	}

	public Long getDealId() {
		return dealId;
	}

	public void setDealId(Long dealId) {
		this.dealId = dealId;
	}

	public Map<String, DealsPropertiesResponse> getProperties() {
		return properties;
	}

	public void setProperties(Map<String, DealsPropertiesResponse> properties) {
		this.properties = properties;
	}

}
