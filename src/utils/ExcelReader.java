package utils;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ExcelReader {

    public static List<Map<String, String>> read(String path) {

        XSSFWorkbook excel = null;
        FileInputStream fis = null;
        List<Map<String, String>> excelData = null;

        try {
            fis = new FileInputStream(path);
            excel = new XSSFWorkbook(fis);

            Sheet sheet = excel.getSheet("Sheet1");

            int noOfRow = sheet.getPhysicalNumberOfRows();
            Row headerRow = sheet.getRow(0);

            excelData = new ArrayList<>();


            for (int rowNo = 1; rowNo < noOfRow; rowNo++) {
                LinkedHashMap<String, String> rowMap = new LinkedHashMap<>();

                Row dataRow = sheet.getRow(rowNo);

                int noOfCell = dataRow.getPhysicalNumberOfCells();

                for (int cellNo = 0; cellNo < noOfCell; cellNo++) {

                    String key = headerRow.getCell(cellNo).toString();
                    String value = dataRow.getCell(cellNo).toString();
                    rowMap.put(key, value);
                }
                excelData.add(rowMap);

            }
        } catch (IOException f) {
            f.printStackTrace();

        } finally {

            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return excelData;
    }
}