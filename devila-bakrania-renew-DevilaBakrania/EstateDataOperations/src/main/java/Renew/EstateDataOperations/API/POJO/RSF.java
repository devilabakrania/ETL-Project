package Renew.EstateDataOperations.API.POJO;

public class RSF {
	private String property_external_id;
	private String property_name;
	private String property_description;
	private String street_address;
	private String listing_external_id;
	private String unit;
	private String size;
	private int beds;
	private int baths;
	private String price;

	public String getProperty_external_id() {
		return property_external_id;
	}

	public void setProperty_external_id(String property_external_id) {
		this.property_external_id = property_external_id;
	}

	public String getProperty_name() {
		return property_name;
	}

	public void setProperty_name(String property_name) {
		this.property_name = property_name;
	}

	public String getProperty_description() {
		return property_description;
	}

	public void setProperty_description(String property_description) {
		this.property_description = property_description;
	}

	public String getStreet_address() {
		return street_address;
	}

	public void setStreet_address(String street_address) {
		this.street_address = street_address;
	}

	public String getListing_external_id() {
		return listing_external_id;
	}

	public void setListing_external_id(String listing_external_id) {
		this.listing_external_id = listing_external_id;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getBeds() {
		return beds;
	}

	public void setBeds(int beds) {
		this.beds = beds;
	}

	public int getBaths() {
		return baths;
	}

	public void setBaths(int baths) {
		this.baths = baths;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getStringObject() {
		return property_external_id + "," + property_name + "," + property_description + "," + street_address + ","
				+ listing_external_id + "," + unit + "," + size + "," + beds + "," + baths + "," + price;
	}

}
