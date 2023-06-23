package com.apachepoi;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class ReadEmpData {
    public static void main(String[] args) throws IOException {

        File file = new File("src/test/resources/test_docs/emp data.xlsx");
        FileInputStream fileInputStream = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheets = workbook.getSheetAt(0);

        Iterator<Row> rowIterator = sheets.iterator();

        while (rowIterator.hasNext())
        {
            Row row = rowIterator.next();
            Iterator<Cell> cellIterator = row.cellIterator();

            while (cellIterator.hasNext())
            {
                Cell cell = cellIterator.next();
                switch (cell.getCellType())
                {
                    case STRING:
                        System.out.println(cell.getStringCellValue() + "\t\t\t");
                        break;

                    case NUMERIC:
                        System.out.println(cell.getNumericCellValue() + "\t\t\t");
                        break;

                    default:
                }
            }
            System.out.println("Data driven done");
        }
    }

}
