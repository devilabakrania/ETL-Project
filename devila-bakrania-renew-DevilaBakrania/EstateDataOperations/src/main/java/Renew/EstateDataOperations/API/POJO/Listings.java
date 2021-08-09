package Renew.EstateDataOperations.API.POJO;

public class Listings {

	    private String id;
	    private String property;
	    private String unit;
	    private int beds;
	    private int baths;
	    private String rental_price;
	    private String square_footage;
	    private String status;
	    
	    
		public String getId() {
			return id;
		}


		public void setId(String id) {
			this.id = id;
		}


		public String getProperty() {
			return property;
		}


		public void setProperty(String property) {
			this.property = property;
		}


		public String getUnit() {
			return unit;
		}


		public void setUnit(String unit) {
			this.unit = unit;
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


		public String getRental_price() {
			return rental_price;
		}


		public void setRental_price(String rental_price) {
			this.rental_price = rental_price;
		}


		public String getSquare_footage() {
			return square_footage;
		}


		public void setSquare_footage(String square_footage) {
			this.square_footage = square_footage;
		}


		public String getStatus() {
			return status;
		}


		public void setStatus(String status) {
			this.status = status;
		}


		@Override
		public String toString() {
			return "Listing [id=" + id + ", property=" + property + ", unit=" + unit + ", beds=" + beds + ", baths="
					+ baths + ", rental_price=" + rental_price + ", square_footage=" + square_footage + ", status="
					+ status + "]";
		}
	    
	    
}
