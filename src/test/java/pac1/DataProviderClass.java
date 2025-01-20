package pac1;

import com.opencsv.exceptions.CsvValidationException;
import org.testng.annotations.DataProvider;

import java.io.IOException;

public class DataProviderClass {

    @DataProvider(name = "csvDataProvider")
    public Object[][] csvData() throws IOException, CsvValidationException {
        String filePath = "src/test/resources/testdata.csv"; // Adjust the path as needed
        return CSVUtils.readCSV(filePath);
    }
}
