package lib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.apache.poi.xssf.usermodel.XSSFCell;
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.hssf.*;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelReader {
	public FileOutputStream fileoutput=null;
	public FileInputStream fis=null;
	String path=null;
	private HSSFWorkbook workbook= null;
	private HSSFSheet sheet = null;
	private HSSFRow row= null;
	private HSSFCell cell = null;
	
	public ExcelReader() throws IOException
	{
	path= System.getProperty("user.dir")+ "\\TESTDATA\\testdata.xls";
	fis= new FileInputStream (path);
	workbook = new HSSFWorkbook (fis);
	sheet = workbook.getSheetAt(0);
	}

	public int getSheetRows(String SheetName) 
	{
		int index = workbook.getSheetIndex(SheetName);
		sheet = workbook.getSheetAt(index);
		return(sheet.getLastRowNum()+1);
			
	}
	
	  public int getSheetColumns (String SheetName) 
	  { 
		  int index = workbook.getSheetIndex(SheetName);
		  sheet = workbook.getSheetAt(index);
		  row = sheet.getRow(0);
		return (row.getLastCellNum()); 
		 
	 
	 }
	 
	  
	  public String getCellData(String SheetName, int colNum, int rowNum )
	  {
		  int index = workbook.getSheetIndex(SheetName);
		  sheet = workbook.getSheetAt(index);
		  row= sheet.getRow(rowNum);
		  cell= row.getCell(colNum);
		  return(cell.getStringCellValue());
		  
	  }
	  
	  public String getCellData1(String SheetName, String colName, int rowNum)
	  {   int colNum=-1;
		  int index = workbook.getSheetIndex(SheetName);
		  sheet = workbook.getSheetAt(index);
		  for(int i=0; i<getSheetColumns(SheetName); i++)
		  {
			  row= sheet.getRow(0);
			  cell= row.getCell(i);
			  if(cell.getStringCellValue().equals(colName))
			  {
				colNum= cell.getColumnIndex();
				break;
			  }
				  
		  }
		  row= sheet.getRow(rowNum);
		  cell= row.getCell(colNum);
		  return(cell.getStringCellValue());
	  }
public void setCellData(String SheetName, int colNum, int rowNum, String str)
{
	int index= workbook.getSheetIndex(SheetName);
	sheet = workbook.getSheetAt(index);
	row= sheet.getRow(rowNum);
	cell= row.createCell(colNum);
	cell.setCellValue(str);
	
	try {
		fileoutput= new FileOutputStream(path);
		try {
			workbook.write(fileoutput);
			fileoutput.close();
		    }
		catch (IOException e)
		     {
			e.printStackTrace();
			}
	    }
	catch(FileNotFoundException e) 
	{
	e.printStackTrace();
	
	}
}
	
public static void main (String args[]) throws IOException 
{
	ExcelReader reader = new ExcelReader();
	
//	System.out.println(reader.getSheetRows("LoginTest"));
//	System.out.println(reader.getSheetRows("SignUpTest"));
//	System.out.println(reader.getSheetRows("LoginTest1"));
//	System.out.println(reader.getSheetColumns("LoginTest"));
//	System.out.println(reader.getCellData("SignUpTest", 1,1));
//	System.out.println(reader.getCellData1("SignUpTest","Last Name",1));
	reader.setCellData("LoginTest", 1, 1, "Hello World");
	
}
}
