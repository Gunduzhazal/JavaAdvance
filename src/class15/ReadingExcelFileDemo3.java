package class15;

import utils.ExcelReader;

import java.io.IOException;

public class ReadingExcelFileDemo3 {

    public static void main(String[] args) throws IOException {

        String path = "/Users/otheraccount/Intellijj/SDET_JAVA/.idea/Data/Test.xlsx";

        var data = ExcelReader.read(path);

        System.out.println(data);
    }
}
