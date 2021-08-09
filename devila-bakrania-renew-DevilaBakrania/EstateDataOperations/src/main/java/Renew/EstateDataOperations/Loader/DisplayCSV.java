package Renew.EstateDataOperations.Loader;

import java.io.FileReader;

import com.opencsv.CSVReader;

public class DisplayCSV {

	public static void readCSV(String file) throws Exception {

		FileReader filereader = new FileReader(file);

		CSVReader csvReader = new CSVReader(filereader);
		String[] nextRecord;

		while ((nextRecord = csvReader.readNext()) != null) {
			for (String cell : nextRecord) {
				System.out.print(cell + "\t");
			}
			System.out.println();
		}
		csvReader.close();
	}

}
