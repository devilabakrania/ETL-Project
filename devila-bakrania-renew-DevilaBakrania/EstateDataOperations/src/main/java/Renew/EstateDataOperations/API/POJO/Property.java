package Renew.EstateDataOperations.API.POJO;

public class Property {
	private String id;
	private String name;
	private int createdAt;
	private int lastUpdatedAt;
	private int listingCount;
	private String streetAddress;
	private String description;
	private String contactPhone;
	private String contactEmail;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(int createdAt) {
		this.createdAt = createdAt;
	}
	public int getLastUpdatedAt() {
		return lastUpdatedAt;
	}
	public void setLastUpdatedAt(int lastUpdatedAt) {
		this.lastUpdatedAt = lastUpdatedAt;
	}
	public int getListingCount() {
		return listingCount;
	}
	public void setListingCount(int listingCount) {
		this.listingCount = listingCount;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getContactPhone() {
		return contactPhone;
	}
	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}
	public String getContactEmail() {
		return contactEmail;
	}
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}
	
	

}
