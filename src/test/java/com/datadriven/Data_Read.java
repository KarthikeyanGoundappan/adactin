package com.datadriven;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//import com.microsoft.schemas.office.visio.x2012.main.CellType;



public class Data_Read {

			private void rowread() throws IOException {
				List<String> name = new ArrayList<String>();
				File f = new File("C:\\Users\\GIRIMAHI\\eclipse-workspace\\Maven_Intro\\Data_excel\\Test case 1.xlsx");
				FileInputStream fi = new FileInputStream(f);
				Workbook wb = new XSSFWorkbook(fi);
				Sheet sheetat = wb.getSheetAt(0);
				int rowsize = sheetat.getPhysicalNumberOfRows();
				for (int i = 0; i < rowsize; i++) {
					Row rw = sheetat.getRow(i);

					Cell cell1 = rw.getCell(0);
					CellType cell2 = cell1.getCellType();

					if (cell2.equals(CellType.STRING)) {
						String val = cell1.getStringCellValue();
						System.out.println(val + "    ");
						name.add(val);
					} else if (cell2.equals(CellType.NUMERIC)) {
						double val2 = cell1.getNumericCellValue();
						System.out.println(val2);
					}
				}
				System.out.println(name);
				System.out.println(name.get(2));
			}

			private void columnread() throws IOException {
				List<Integer> marks = new ArrayList<Integer>();
				File f = new File("C:\\Users\\GIRIMAHI\\eclipse-workspace\\Maven_Intro\\Data_excel\\Test case 1.xlsx");
				FileInputStream fi = new FileInputStream(f);
				Workbook wb = new XSSFWorkbook(fi);
				Sheet sheetat = wb.getSheetAt(0);
				int rowsize = sheetat.getPhysicalNumberOfRows();
				for (int i = 0; i < rowsize; i++) {
					Row rw = sheetat.getRow(i);
					Cell cell1 = rw.getCell(1);
					CellType cell2 = cell1.getCellType();

					if (cell2.equals(CellType.STRING)) {
						String val = cell1.getStringCellValue();
						System.out.println(val);
					} else if (cell2.equals(CellType.NUMERIC)) {
						double val2 = cell1.getNumericCellValue();
						int k = (int) val2;
						System.out.println(k);
						marks.add(k);
					}
				}
				System.out.println(marks);
				System.out.println(marks.get(2));

			}

			public static void main(String[] args) throws IOException {
				 Data_Read  n = new  Data_Read ();
				n.rowread();
				System.out.println();
				n.columnread();
			}
		
		
	}
	
	

