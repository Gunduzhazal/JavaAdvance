package class15;

import utils.ConfigReader;
import utils.ExcelReader;

public class FilesDemo {

    public static void main(String[] args) {

        String path = "/Users/otheraccount/Intellijj/SDET_JAVA/.idea/Data/config.properties";

        var properties = ConfigReader.read(path);

        System.out.println(properties.getProperty("browser"));

        String excelPath = "/Users/otheraccount/Intellijj/SDET_JAVA/.idea/Data/Test.xlsx";

        var excelData = ExcelReader.read(excelPath);

        System.out.println(excelData);
    }
}
