package util;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;

public class Utilities {

    public static String getData(int rowNumber, int colNumber, String sheetName) {
        XSSFWorkbook workbook;
        XSSFSheet sheet;
        String projectPath = System.getProperty("user.dir");
        String cellData = null;

        try {
            workbook = new XSSFWorkbook(projectPath + "/src/test/resources/testData/loginData.xlsx");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        sheet = workbook.getSheet(sheetName);
        DataFormatter dataFormatter = new DataFormatter();
        cellData = dataFormatter.formatCellValue(sheet.getRow(rowNumber).getCell(colNumber));

        return cellData;
    }
}
