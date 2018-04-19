package api.Entities;

import java.util.Map;

public class StaticChampionList {

	private Map<String, String> keys;
	private Map<String, StaticChampion> data;
	private String version;
	private String type;
	private String format;
	
	
	public Map<String, String> getKeys() {
		return keys;
	}
	public void setKeys(Map<String, String> keys) {
		this.keys = keys;
	}
	public Map<String, StaticChampion> getData() {
		return data;
	}
	public void setData(Map<String, StaticChampion> data) {
		this.data = data;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	
}
