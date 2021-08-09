package Renew.EstateDataOperations.API.POJO;

public class Listing {
	private String id;
	private String unit;
	private int numBeds;
	private int numBaths;
	private int price;
	private int sqft;
	private String status;
	private int createdAt;
	private int lastUpdatedAt;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public int getNumBeds() {
		return numBeds;
	}
	public void setNumBeds(int numBeds) {
		this.numBeds = numBeds;
	}
	public int getNumBaths() {
		return numBaths;
	}
	public void setNumBaths(int numBaths) {
		this.numBaths = numBaths;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSqft() {
		return sqft;
	}
	public void setSqft(int sqft) {
		this.sqft = sqft;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
	
	

}
