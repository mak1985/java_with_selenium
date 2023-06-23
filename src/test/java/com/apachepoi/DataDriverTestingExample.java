package com.apachepoi;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataDriverTestingExample {

    public static void main(String[] args) throws IOException {

        XSSFWorkbook excel_book = null;
        XSSFSheet excel_sheet;
        XSSFRow row;
        XSSFCell cell;

        //Create an object fo File class to open excel file
        File excelFile = new File("src/test/resources/test_docs/testdatainexcel.xlsx");
        //Create an object of FileInputStream to read data from file
        FileInputStream inputStream = new FileInputStream(excelFile);
        //Create object of XSSFWorkbook to handle xlsx file
        excel_book = new XSSFWorkbook(inputStream);
        excel_sheet = excel_book.getSheetAt(0); //To access the sheet
        //Get total row counts
        int totalRows = excel_sheet.getLastRowNum() + 1;

        //get total no of cells in a row
        int totalCells = excel_sheet.getRow(0).getLastCellNum() +1;
        for (int currentRow = 1; currentRow<totalRows; currentRow++)
        {
            for(int currentCell =0; currentCell<totalCells; currentCell++)
            {
                System.out.println(excel_sheet.getRow(currentRow).getCell(currentCell).toString());
                System.out.println("\t");
            }
            System.out.println("\n");

        }


    }

}
