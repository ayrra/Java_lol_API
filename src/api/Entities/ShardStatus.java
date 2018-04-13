package api.Entities;

import java.util.List;

public class ShardStatus {

	private String name;
	private String region_tag;
	private String hostname;
	private List<Service> services;
	private String slug;
	private List<String> locales;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegion_tag() {
		return region_tag;
	}
	public void setRegion_tag(String region_tag) {
		this.region_tag = region_tag;
	}
	public String getHostname() {
		return hostname;
	}
	public void setHostname(String hostname) {
		this.hostname = hostname;
	}
	public List<Service> getServices() {
		return services;
	}
	public void setServices(List<Service> services) {
		this.services = services;
	}
	public String getSlug() {
		return slug;
	}
	public void setSlug(String slug) {
		this.slug = slug;
	}
	public List<String> getLocales() {
		return locales;
	}
	public void setLocales(List<String> locales) {
		this.locales = locales;
	}
	
}
