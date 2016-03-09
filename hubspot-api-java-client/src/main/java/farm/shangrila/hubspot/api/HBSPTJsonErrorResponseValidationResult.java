package farm.shangrila.hubspot.api;

public class HBSPTJsonErrorResponseValidationResult {
	public HBSPTJsonErrorResponseValidationResult() {
		// TODO Auto-generated constructor stub
	}

	@com.google.api.client.util.Key
	boolean isValid;

	@com.google.api.client.util.Key
	String message;

	@com.google.api.client.util.Key
	String error;

	@com.google.api.client.util.Key
	String name;

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
