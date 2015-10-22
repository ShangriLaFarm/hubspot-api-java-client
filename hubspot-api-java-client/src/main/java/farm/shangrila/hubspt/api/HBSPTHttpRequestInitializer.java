package farm.shangrila.hubspt.api;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.util.Preconditions;

public class HBSPTHttpRequestInitializer implements HttpRequestInitializer, HttpExecuteInterceptor {

	private final Map<String, Object> params = new HashMap<String, Object>();
	private JsonFactory jsonFactory;

	public HBSPTHttpRequestInitializer(Map<String, Object> params, JsonFactory jsonFactory) {
		Preconditions.checkNotNull(params);
		Preconditions.checkState(params.size() > 0);
		params.putAll(params);
		this.jsonFactory = jsonFactory;
	}

	public HBSPTHttpRequestInitializer(String name, String value, JsonFactory jsonFactory) {
		Preconditions.checkNotNull(name);
		Preconditions.checkNotNull(value);
		params.put(name, value);
		this.jsonFactory = jsonFactory;
	}

	public void initialize(HttpRequest request) throws IOException {
		request.setInterceptor(this);
		request.setUnsuccessfulResponseHandler(new HBSPTUnsuccessfulResponseHandler(jsonFactory));
	}

	public void intercept(HttpRequest request) throws IOException {
		request.getUrl().putAll(params);
	}
}