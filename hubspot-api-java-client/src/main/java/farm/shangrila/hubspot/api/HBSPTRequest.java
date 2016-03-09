package farm.shangrila.hubspot.api;

import com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient;

public class HBSPTRequest<T> extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClientRequest<T> {

	public HBSPTRequest(AbstractGoogleJsonClient client, String method, String uriTemplate, Object content,
			Class<T> responseClass) {
		super(client, method, uriTemplate, content, responseClass);
	}
}