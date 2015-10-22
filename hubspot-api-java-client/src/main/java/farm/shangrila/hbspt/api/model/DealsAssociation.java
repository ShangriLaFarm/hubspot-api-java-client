package farm.shangrila.hbspt.api.model;

import java.util.List;

public class DealsAssociation {
	
	@com.google.api.client.util.Key
	private List<Long> associatedCompanyIds;
	
	@com.google.api.client.util.Key
	private List<Long> associatedVids;

	public DealsAssociation() {
		// TODO Auto-generated constructor stub
	}

	public List<Long> getAssociatedCompanyIds() {
		return associatedCompanyIds;
	}

	public void setAssociatedCompanyIds(List<Long> associatedCompanyIds) {
		this.associatedCompanyIds = associatedCompanyIds;
	}

	public List<Long> getAssociatedVids() {
		return associatedVids;
	}

	public void setAssociatedVids(List<Long> associatedVids) {
		this.associatedVids = associatedVids;
	}

}
/*
 * { "associations": { "associatedCompanyIds": [ 8954037 ], "associatedVids": [
 * 27136 ] },
 * 
 */