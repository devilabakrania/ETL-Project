package Renew.EstateDataOperations.Loader;

import java.io.File;
import java.io.FileWriter;
import java.util.List;

import com.opencsv.CSVWriter;

import Renew.EstateDataOperations.API.POJO.RSF;

public class LoadCSV {
	
	public static CSVWriter openFile(String filePath) throws Exception {
		File file = new File(filePath);
		FileWriter outputfile = new FileWriter(file);
		CSVWriter writer = new CSVWriter(outputfile);
		String[] header = {"property_external_id","property_name","property_description", "street_address", "listing_external_id", "unit", "size", "beds", "baths", "price" };//type the header
		writer.writeNext(header);
		return writer;
	}
	
	public static void writeDataLineByLine(CSVWriter writer,String row) throws Exception {
		String[] data = row.split(",");
		writer.writeNext(data);
	}
	
	public static void closeFile(CSVWriter writer) throws Exception{
		writer.close();
	}
	
	
	public static void loadder(CSVWriter writer, List<RSF> rows) throws Exception {
		for (RSF row : rows) {
			writeDataLineByLine(writer, row.getStringObject());
		}
	}

}
