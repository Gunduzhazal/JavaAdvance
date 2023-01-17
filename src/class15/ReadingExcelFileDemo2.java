package class15;

import utils.ExcelReader;

import java.io.IOException;

public class ReadingExcelFileDemo2 {

    public static void main(String[] args) throws IOException {

        var excelData = ExcelReader.read("/Users/otheraccount/Intellijj/SDET_JAVA/.idea/Data/Test.xlsx");

        System.out.println(excelData);

    }
}
