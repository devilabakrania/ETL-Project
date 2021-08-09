package Renew.EstateDataOperations.API.extractor;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import Renew.EstateDataOperations.API.POJO.Listings;
import Renew.EstateDataOperations.API.POJO.Operation1;
import Renew.EstateDataOperations.API.POJO.Property;

public class APIToPOJO {
	
	
	public Operation1[] convertorAPI1(String JSONObject) throws Exception{
		ObjectMapper mapper = new ObjectMapper();
		mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		Operation1[] listOfProperties = mapper.readValue(JSONObject, Operation1[].class);
		return listOfProperties;
	}
	
	public Listings[] convertorAPI3Listings(String JSONObject) throws Exception{
		ObjectMapper mapper = new ObjectMapper();
		mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		Listings[] listOfListings = mapper.readValue(JSONObject, Listings[].class);
		return listOfListings;
	}
	
	public Property[] convertorAPI3Property(String JSONObject) throws Exception{
		ObjectMapper mapper = new ObjectMapper();
		mapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		Property[] listOfProperties = mapper.readValue(JSONObject, Property[].class);
		return listOfProperties;
	}
	
}
