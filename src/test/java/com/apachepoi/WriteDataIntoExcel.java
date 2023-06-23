package com.apachepoi;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class WriteDataIntoExcel {
    public static void main(String[] args) throws IOException {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheets = workbook.createSheet(" Testing data ");

        Object[][] empData = {
                {"John", "Mumbai", 744444},
                {"Paul", "Delhi", 78887771},
                {"harry", "Chennai", 122222}
        };

        int rowCount = 0;

        for (Object[] newEmp: empData)  {
            Row row = sheets.createRow(++rowCount);

            int countCount = 0;

            for (Object desig: newEmp) {
                Cell cell = row.createCell(++countCount);
//                if(desig instanceof String) {
//                    cell.setCellValue((String) desig);
//                } else if (desig instanceof Integer) {
//                    cell.setCellValue((Integer) desig);
//                }
            }
        }
        FileOutputStream stream = new FileOutputStream(new File("src/test/resources/test_docs/tc_01.xlsx"));
        workbook.write(stream);
    }
}
