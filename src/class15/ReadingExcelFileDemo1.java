package class15;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class ReadingExcelFileDemo1 {

    public static void main(String[] args) throws IOException {

        String path = "/Users/otheraccount/Intellijj/SDET_JAVA/.idea/Data/Test.xlsx";

        FileInputStream fis = new FileInputStream(path);

        XSSFWorkbook excel = new XSSFWorkbook(fis);

        Sheet sheet = excel.getSheet("Sheet1");

        int noOfRow = sheet.getPhysicalNumberOfRows();

        Row headerRow = sheet.getRow(0);

        ArrayList<LinkedHashMap<String,String>> excelData = new ArrayList<>();

        for (int rowNo = 1; rowNo < noOfRow; rowNo++) {

            LinkedHashMap<String,String> rowMap = new LinkedHashMap<>();

            Row dataRow = sheet.getRow(rowNo);

            int noOfCell = dataRow.getPhysicalNumberOfCells();

            for (int cellNo = 0; cellNo < noOfCell; cellNo++) {

                String key = headerRow.getCell(cellNo).toString();

                String value = dataRow.getCell(cellNo).toString();

                rowMap.put(key,value);
            }
            excelData.add(rowMap);
        }

        System.out.println(excelData);

    }
}