package Renew.EstateDataOperations.API.extractor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Renew.EstateDataOperations.API.POJO.Listings;
import Renew.EstateDataOperations.API.POJO.Operation1;
import Renew.EstateDataOperations.API.POJO.Property;
import Renew.EstateDataOperations.API.POJO.RSF;

public class DataExtractorRSF {
	
	public List<RSF> API1Extractor(Operation1[] listOfProperties) {
		List<RSF> RSFList=new ArrayList<>();
		for(int i = 0; i < listOfProperties.length; i++) {
			RSF row = new RSF();
			if(listOfProperties[i].getProperty() != null) {
				Property property = listOfProperties[i].getProperty();
				row.setProperty_external_id(property.getId());
				row.setProperty_name(property.getName());
				row.setProperty_description(property.getDescription());
				row.setStreet_address(property.getStreetAddress());
			}
			if(listOfProperties[i].getListing() != null) {
				
				Listings listing = listOfProperties[i].getListing();
				row.setListing_external_id(listing.getId());
				row.setUnit(listing.getUnit());
				row.setSize(listing.getSquare_footage());
				row.setBeds(listing.getBeds());
				row.setBaths(listing.getBaths());
				row.setPrice(listing.getRental_price());
				
			}
			RSFList.add(row);
		}
		
		return RSFList;
		
	}
	
	
	public List<RSF> API3Extractor(Listings[] listing,Property[] property) {
		List<RSF> RSFList=new ArrayList<>();

		HashMap<String,Property> map=arrayToMap(property);
		for(int i=0;i<listing.length;i++) {
			RSF row = new RSF();
			row.setListing_external_id(listing[i].getId());
			row.setUnit(listing[i].getUnit());
			row.setSize(listing[i].getSquare_footage());
			row.setBeds(listing[i].getBeds());
			row.setBaths(listing[i].getBaths());
			row.setPrice(listing[i].getRental_price());
			
			String propertyid = listing[i].getProperty();
			if(map.containsKey(propertyid)) {
				Property unit = map.get(propertyid);
				row.setProperty_external_id(unit.getId());
				row.setProperty_name(unit.getName());
				row.setProperty_description(unit.getDescription());
				row.setStreet_address(unit.getStreetAddress());
			}
			RSFList.add(row);

		}
		return RSFList;		
	}
	
	public HashMap<String,Property> arrayToMap(Property[] property){
		HashMap<String,Property> map=new HashMap<>();
		for(int i=0;i<property.length;i++) {
			map.put(property[i].getId(), property[i]);
		}
		
		return map;
	}
	
}
