package zoopla.uk.genericlivery;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	// Constants variable
	final static String file = "C:\\Users\\User\\git\\repository2\\Request_Project\\TestData\\SampleExcel.xlsx";
	// How to read the excel file in automation?
	// Ans: Help of Apache POI
	// What is the Apache POI?
	// It's a dependencies or livery file or API
	// How to pass the data from excel to web-site
	// Ans: Help of Apache POI

	public static void main(String[] args) throws Throwable {
		
		readExcelData(0) ;
		readExcelData(1) ;
		
		
		// FileInputStream (it's a java class) to identify the location of the file
		// FileOutputStream (it's a java class) to write the data
            FileInputStream data = new FileInputStream(file);
		
		
		// I have to use XSSFWorkbook class from ApachePOI to create the object and pass  the parameter
		// FileInputStream object
		 XSSFWorkbook workbook = new XSSFWorkbook(data);
		
	
		// I have to use XSSFSheet object = WorkBook object to call the getSheet method
		// and passing the sheet name inside the parameter - it takes control of all the  sheet data
		XSSFSheet sheet = workbook.getSheet("login"); // <-- sheet name according to my excel file

		// Iterator (coming from java util) - to go throw all the excel sheet
		// <Row> (coming from Apache POI)

		// I go through the iterator creating object to go through all the sheet value and
		// ignore the header using next method
		Iterator<Row> rowIterator = sheet.iterator();
		rowIterator.next();
		
		
		// Now I have to create a Arraylist of object to take control of all the data
		ArrayList<String> list = new ArrayList<String>();

		// Now I have to use any loop, but better to use while loop and passing the condition
		// iterator object to call the HasNext method and I can take control of all the
		// sheet data value
		while (rowIterator.hasNext()) {

			// Finally, help with the Array-list object, all the add method and using
			// getCell value method  I read the data from excel
			list.add(rowIterator.next().getCell(1).getStringCellValue());
			//System.out.println(list);
		}
	}
	
	
	public static  ArrayList<String> readExcelData(int colNo) throws Throwable {
		// FileInputStream (it's a java class) to identify the location of the file
		// FileOutputStream (it's a java class) to write the data
            FileInputStream data = new FileInputStream(file);
		
		
		// I have to use XSSFWorkbook class from ApachePOI to create the object and pass  the parameter
		// FileInputStream object
		 XSSFWorkbook workbook = new XSSFWorkbook(data);
		
	
		// I have to use XSSFSheet object = WorkBook object to call the getSheet method
		// and passing the sheet name inside the parameter - it takes control of all the  sheet data
		XSSFSheet sheet = workbook.getSheet("login"); // <-- sheet name according to my excel file

		// Iterator (coming from java util) - to go throw all the excel sheet
		// <Row> (coming from Apache POI)

		// I go through the iterator creating object to go through all the sheet value and
		// ignore the header using next method
		Iterator<Row> rowIterator = sheet.iterator();
		rowIterator.next();
		
		
		// Now I have to create a Arraylist of object to take control of all the data
		ArrayList<String> list = new ArrayList<String>();

		// Now I have to use any loop, but better to use while loop and passing the condition
		// iterator object to call the HasNext method and I can take control of all the
		// sheet data value
		while (rowIterator.hasNext()) {

			// Finally, help with the Array-list object, all the add method and using
			// getCell value method  I read the data from excel
			list.add(rowIterator.next().getCell(colNo).getStringCellValue());
			
		}
		System.out.println(list);
		return list;
		
	}
}
