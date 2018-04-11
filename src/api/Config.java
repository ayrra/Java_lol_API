package api;

public class Config {

	private String APIKey = "";

	public Config(String key) {
		this.APIKey = key;
	}
	
	public String getAPIKey() {
		return APIKey;
	}

	public void setAPIkey(String APIKey) {
		this.APIKey = APIKey;
	}
	
	public String toString() {
		return APIKey;
	}
}
