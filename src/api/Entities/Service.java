package api.Entities;

import java.util.List;

public class Service {

	private String status;
	private List<Incident> incidents;
	private String name;
	private String slug;
	
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<Incident> getIncidents() {
		return incidents;
	}
	public void setIncidents(List<Incident> incidents) {
		this.incidents = incidents;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSlug() {
		return slug;
	}
	public void setSlug(String slug) {
		this.slug = slug;
	}
	
}
