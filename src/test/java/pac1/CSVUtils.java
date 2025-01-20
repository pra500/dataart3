package pac1;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVUtils {

    public static Object[][] readCSV(String filePath) throws IOException, CsvValidationException {
        List<Object[]> data = new ArrayList<>();
        try (CSVReader csvReader = new CSVReader(new FileReader(filePath))) {
            String[] row;
            csvReader.readNext(); // Skip the header row
            while ((row = csvReader.readNext()) != null) {
                data.add(row);
            }
        }
        return data.toArray(new Object[0][]);
    }
}
