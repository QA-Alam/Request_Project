package zoopla.uk.hookstest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExceptionHandlingClass {

	// If i need to read any file from outside or like excel, database, properties
	// and many more
	// file we are getting error on the code that is call check time exception
	// Or any code error we are getting before execution that is call check time
	// exception

	public static ArrayList<String> readExcelData(int colNo)  {
		FileInputStream data = null;
		try {
			data = new FileInputStream("");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XSSFWorkbook workbook = null;
		try {
			workbook = new XSSFWorkbook(data);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XSSFSheet sheet = workbook.getSheet("login");
		Iterator<Row> rowIterator = sheet.iterator();
		rowIterator.next();
		ArrayList<String> list = new ArrayList<String>();
		while (rowIterator.hasNext()) {
			list.add(rowIterator.next().getCell(colNo).getStringCellValue());
		}
		System.out.println(list);
		return list;
	}
	
	public static void maine(String[] args){
		readExcelData(0) ;
	}
	

	// After execution if we can see any error that means this is a un-check
	// exception
	public static void mains(String[] args) {
		
		
		String name = " ";
		String names = null;
		System.out.println(names);

	}

	//@Test
	public void indexOutOFBoundaryExc() {
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Dogs");
		myList.add("are");
		myList.add("cute.");
		System.out.println(myList.get(3));
	}
 @Test
	public static void ArithmeticExceptionTest() {
		try {
			int a = 0, b = 10;
			int c = b / a;
			System.out.println("Value of c is : " + c);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
	}
 
 
 public void userDefineException() {
	        try {
	            // Throw an object of user defined exception
	            throw new MyException("GeeksGeeks");
	        }
	        catch (MyException ex) {
	            System.out.println("Caught");
	 
	            // Print the message from MyException object
	            System.out.println(ex.getMessage());
	        }

 }
 
 public static void main(String args[]){
	try{
		System.out.println("Starting of try block");
		// I'm throwing the custom exception using throw
		throw new MyException("This is My error Message");
	}
	catch(MyException exp){
		System.out.println("Catch Block") ;
		System.out.println(exp) ;
	}
  }
}
