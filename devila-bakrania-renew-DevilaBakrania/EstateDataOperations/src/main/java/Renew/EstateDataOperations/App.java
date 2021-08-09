package Renew.EstateDataOperations;

import java.util.List;

import com.opencsv.CSVWriter;

import Renew.EstateDataOperations.API.POJO.Listings;
import Renew.EstateDataOperations.API.POJO.Operation1;
import Renew.EstateDataOperations.API.POJO.Property;
import Renew.EstateDataOperations.API.POJO.RSF;
import Renew.EstateDataOperations.API.extractor.APIToPOJO;
import Renew.EstateDataOperations.API.extractor.DataExtractorRSF;
import Renew.EstateDataOperations.API.extractor.ExtractJSON;
import Renew.EstateDataOperations.Loader.DisplayCSV;
import Renew.EstateDataOperations.Loader.LoadCSV;

//Main Entry point of the program
public class App {
	static APIToPOJO pojoConveter;
	static DataExtractorRSF dataExtractor;
	static String URL;
	static String fileName ;
	static String option;
    static boolean debug=true; 
	App() {
		pojoConveter = new APIToPOJO();
		dataExtractor = new DataExtractorRSF();
		fileName="";
		option="";
		URL="";

	}

	public static void main(String[] args) {
		new App();
		option = args[0];
		fileName= args[1];
		List<RSF> list = null;
		try {
			if (option.equalsIgnoreCase("1") || option.equalsIgnoreCase("2")) {
				if (option.equalsIgnoreCase("1")) {
					URL = "https://private-5357ee-operator1.apiary-mock.com/listings";
				} else if (option.equalsIgnoreCase("2")) {
					URL = "https://private-b2fd6d-operator22.apiary-mock.com/listings";
				}
				String JSONObject = ExtractJSON.httpExtractor(URL);
				Operation1[] listOfProperties = pojoConveter.convertorAPI1(JSONObject);
				list = dataExtractor.API1Extractor(listOfProperties);

			} else if (option.equalsIgnoreCase("3")) {
				URL = "https://private-0bf0b9-operator31.apiary-mock.com/rental_listings";
				String JSONObject = ExtractJSON.httpExtractor(URL);
				Listings[] listOfListings = pojoConveter.convertorAPI3Listings(JSONObject);
				URL = "https://private-0bf0b9-operator31.apiary-mock.com/properties";
				JSONObject = ExtractJSON.httpExtractor(URL);
				Property[] listOfProperties = pojoConveter.convertorAPI3Property(JSONObject);
				list = dataExtractor.API3Extractor(listOfListings, listOfProperties);
			}
			// Writing to CSV
			if (list != null) {
				CSVWriter writer = LoadCSV.openFile(fileName);
				LoadCSV.loadder(writer, list);
				LoadCSV.closeFile(writer);
			}
			// Displaying the CSV in console
			DisplayCSV.readCSV(fileName);

		} catch (Exception e) {
			System.out.println("Error Occured in the Application");
			if(debug) e.printStackTrace();
		}
	}

	
}
