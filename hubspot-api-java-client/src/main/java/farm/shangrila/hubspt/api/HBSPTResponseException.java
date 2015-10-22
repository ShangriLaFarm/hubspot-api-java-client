package farm.shangrila.hubspt.api;

import java.io.IOException;

public class HBSPTResponseException extends IOException {

	private HBSPTJsonErrorResponse hbsptJsonErrorReponse;

	public HBSPTResponseException(String string, HBSPTJsonErrorResponse hbsptJsonErrorReponse) {
		// TODO Auto-generated constructor stub
		this.hbsptJsonErrorReponse = hbsptJsonErrorReponse;
	}

	public HBSPTResponseException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}

	public HBSPTJsonErrorResponse getHbsptJsonErrorReponse() {
		return hbsptJsonErrorReponse;
	}
}
