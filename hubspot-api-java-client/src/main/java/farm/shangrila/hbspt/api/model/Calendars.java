package farm.shangrila.hbspt.api.model;

public class Calendars {

	@com.google.api.client.util.Key
	private Long eventDate = 1425760557000l;

	@com.google.api.client.util.Key
	private String category = "CUSTOM";

	@com.google.api.client.util.Key
	private String state = "TODO";

	@com.google.api.client.util.Key
	private String name = "sdbnvgkisdfbhgiksghfkis";

	@com.google.api.client.util.Key
	private Long ownerId = 4789729l;

	public Calendars() {
		// TODO Auto-generated constructor stub
	}

	public Long getEventDate() {
		return eventDate;
	}

	public void setEventDate(Long eventDate) {
		this.eventDate = eventDate;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
	}

}
