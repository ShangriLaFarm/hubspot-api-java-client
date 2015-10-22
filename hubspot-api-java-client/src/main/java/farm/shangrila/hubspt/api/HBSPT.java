package farm.shangrila.hubspt.api;

import com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient;
import com.google.api.client.util.Preconditions;

public class HBSPT extends AbstractGoogleJsonClient {

	public static final String DEFAULT_ROOT_URL = "https://api.hubapi.com";
	public static final String DEFAULT_SERVICE_PATH = "";
	public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

	public HBSPT(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
			com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
		this(new Builder(transport, jsonFactory, httpRequestInitializer));
	}

	HBSPT(Builder builder) {
		super(builder);
	}

	public Owners owners() {
		return new Owners();
	}

	public class Owners {

		public Get get() throws java.io.IOException {
			Get result = new Get();
			initialize(result);
			return result;
		}

		public class Get extends HBSPTRequest<farm.shangrila.hbspt.api.model.Owners[]> {

			private static final String REST_PATH = "owners/v2/owners/";

			protected Get() {
				super(HBSPT.this, "GET", REST_PATH, null, farm.shangrila.hbspt.api.model.Owners[].class);
			}

			@com.google.api.client.util.Key
			private java.lang.String email;

			public java.lang.String getEmail() {
				return email;
			}

			public Get setEmail(java.lang.String email) {
				this.email = email;
				return this;
			}
		}

	}

	public Calendars calendars() {
		return new Calendars();
	}

	public class Calendars {

		public Insert insert(farm.shangrila.hbspt.api.model.Calendars content) throws java.io.IOException {
			Insert result = new Insert(content);
			initialize(result);
			return result;
		}

		public class Insert extends HBSPTRequest<farm.shangrila.hbspt.api.model.Calendars> {

			private static final String REST_PATH = "calendar/v1/events/task";

			protected Insert(farm.shangrila.hbspt.api.model.Calendars content) {
				super(HBSPT.this, "POST", REST_PATH, content, farm.shangrila.hbspt.api.model.Calendars.class);
			}

		}
	}

	public Contacts contacts() {
		return new Contacts();
	}

	public class Contacts {

		public Update update(String contactId, farm.shangrila.hbspt.api.model.Contacts content) throws java.io.IOException {
			Update result = new Update(contactId, content);
			initialize(result);
			return result;
		}

		public class Update extends HBSPTRequest<farm.shangrila.hbspt.api.model.VoidResponse> {

			@com.google.api.client.util.Key
			private java.lang.String contactId;

			private static final String REST_PATH = "contacts/v1/contact/vid/{contactId}/profile";

			protected Update(String contactId, farm.shangrila.hbspt.api.model.Contacts content) {
				super(HBSPT.this, "POST", REST_PATH, content, farm.shangrila.hbspt.api.model.VoidResponse.class);
				this.contactId = ((String) Preconditions.checkNotNull(contactId,
						"Required parameter contactId must be specified."));
			}

		}

		public Insert insert(farm.shangrila.hbspt.api.model.Contacts content) throws java.io.IOException {
			Insert result = new Insert(content);
			initialize(result);
			return result;
		}

		public class Insert extends HBSPTRequest<farm.shangrila.hbspt.api.model.ContactsResponse> {

			private static final String REST_PATH = "contacts/v1/contact";

			protected Insert(farm.shangrila.hbspt.api.model.Contacts content) {
				super(HBSPT.this, "POST", REST_PATH, content, farm.shangrila.hbspt.api.model.ContactsResponse.class);
			}

		}

		public Get get(String contactId) throws java.io.IOException {
			Get result = new Get(contactId);
			initialize(result);
			return result;
		}

		public class Get extends HBSPTRequest<farm.shangrila.hbspt.api.model.ContactsResponse> {

			private static final String REST_PATH = "contacts/v1/contact/vid/{contactId}/profile";

			@com.google.api.client.util.Key
			private java.lang.String contactId;

			protected Get(String contactId) {
				super(HBSPT.this, "GET", REST_PATH, null, farm.shangrila.hbspt.api.model.ContactsResponse.class);
				this.contactId = ((String) Preconditions.checkNotNull(contactId,
						"Required parameter dealId must be specified."));
			}

		}
	}

	public Deals deals() {
		return new Deals();
	}

	public class Deals {

		public Update update(String dealId, farm.shangrila.hbspt.api.model.DealsUpdate content) throws java.io.IOException {
			Update result = new Update(dealId, content);
			initialize(result);
			return result;
		}

		public class Update extends HBSPTRequest<farm.shangrila.hbspt.api.model.DealsResponse> {

			@com.google.api.client.util.Key
			private java.lang.String dealId;

			private static final String REST_PATH = "deals/v1/deal/{dealId}";

			protected Update(String dealId, farm.shangrila.hbspt.api.model.DealsUpdate content) {
				super(HBSPT.this, "PUT", REST_PATH, content, farm.shangrila.hbspt.api.model.DealsResponse.class);
				this.dealId = ((String) Preconditions.checkNotNull(dealId,
						"Required parameter contactId must be specified."));
			}

		}

		public Insert insert(farm.shangrila.hbspt.api.model.Deals content) throws java.io.IOException {
			Insert result = new Insert(content);
			initialize(result);
			return result;
		}

		public class Insert extends HBSPTRequest<farm.shangrila.hbspt.api.model.DealsResponse> {

			private static final String REST_PATH = "deals/v1/deal";

			protected Insert(farm.shangrila.hbspt.api.model.Deals content) {
				super(HBSPT.this, "POST", REST_PATH, content, farm.shangrila.hbspt.api.model.DealsResponse.class);
			}

		}

		public Get get(String dealId) throws java.io.IOException {
			Get result = new Get(dealId);
			initialize(result);
			return result;
		}

		public class Get extends HBSPTRequest<farm.shangrila.hbspt.api.model.DealsResponse> {

			private static final String REST_PATH = "deals/v1/deal/{dealId}";

			@com.google.api.client.util.Key
			private java.lang.String dealId;

			protected Get(String dealId) {
				super(HBSPT.this, "GET", REST_PATH, null, farm.shangrila.hbspt.api.model.DealsResponse.class);
				this.dealId = ((String) Preconditions.checkNotNull(dealId,
						"Required parameter dealId must be specified."));
			}

		}
	}

	public static final class Builder
			extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {
		public Builder(com.google.api.client.http.HttpTransport transport,
				com.google.api.client.json.JsonFactory jsonFactory,
				com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
			super(transport, jsonFactory, DEFAULT_ROOT_URL, DEFAULT_SERVICE_PATH, httpRequestInitializer, false);
		}

		@Override
		public HBSPT build() {
			return new HBSPT(this);
		}
	}
}