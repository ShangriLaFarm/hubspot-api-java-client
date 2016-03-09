package farm.shangrila.hubspot.api;

public class HBSPTJsonErrorResponse {
	public HBSPTJsonErrorResponse() {
	}

	@com.google.api.client.util.Key
	String status;
	
	@com.google.api.client.util.Key
	String message;
	
	@com.google.api.client.util.Key
	String correlationId;
	
	@com.google.api.client.util.Key
	HBSPTJsonErrorResponseValidationResult[] validationResults;
	
	@com.google.api.client.util.Key
	String requestId;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCorrelationId() {
		return correlationId;
	}

	public void setCorrelationId(String correlationId) {
		this.correlationId = correlationId;
	}

	public HBSPTJsonErrorResponseValidationResult[] getValidationResults() {
		return validationResults;
	}

	public void setValidationResults(HBSPTJsonErrorResponseValidationResult[] validationResults) {
		this.validationResults = validationResults;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
