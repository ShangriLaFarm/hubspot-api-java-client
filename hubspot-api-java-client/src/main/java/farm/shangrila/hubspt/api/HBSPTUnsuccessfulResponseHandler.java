package farm.shangrila.hubspt.api;

import java.io.IOException;
import java.util.logging.Logger;

import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpUnsuccessfulResponseHandler;
import com.google.api.client.json.JsonFactory;

public class HBSPTUnsuccessfulResponseHandler implements HttpUnsuccessfulResponseHandler {

	private static final Logger log = Logger.getLogger(HBSPTUnsuccessfulResponseHandler.class.getName());

	private JsonFactory jsonFactory;

	public HBSPTUnsuccessfulResponseHandler(JsonFactory jsonFactory) {
		this.jsonFactory = jsonFactory;
	}

	public boolean handleResponse(HttpRequest request, HttpResponse response, boolean supportsRetry)
			throws IOException {

		String responseAsString = response.parseAsString();
		String logmessage = "";
		logmessage += "\n" + request.getUrl() + " generate HBSPTResponseException: request:  " + request.getContent();
		logmessage += "\n" + request.getUrl() + " generate HBSPTResponseException: response: " + responseAsString;

		HBSPTJsonErrorResponse hbsptJsonErrorReponse = null;

		try {
			hbsptJsonErrorReponse = jsonFactory.fromString(responseAsString, HBSPTJsonErrorResponse.class);
		} catch (IOException e) {
			String errorMessage = "IOException during parse of HBSPTJsonErrorResponse: " + e.getMessage();
			log.severe(errorMessage);

			// fill with base infos
			hbsptJsonErrorReponse = new HBSPTJsonErrorResponse();
			hbsptJsonErrorReponse.setMessage(errorMessage);
			hbsptJsonErrorReponse.setStatus(String.valueOf(response.getStatusCode()));
		}
		
		logmessage += "\n" + hbsptJsonErrorReponse;
		log.warning(logmessage);
		throw new HBSPTResponseException(responseAsString, hbsptJsonErrorReponse);
	}
}