package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static String projectpath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public ExcelUtils(String excelpath, String sheetname) {
		try {
		
		workbook=new XSSFWorkbook(excelpath);
		sheet= workbook.getSheet(sheetname);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		//getrowcount();
		getcelldatastring(0,0);
		getcelldatanumber(1,1);
	}

	public static int getrowcount() {
		int rowcount=0;
		try {

			rowcount=sheet.getPhysicalNumberOfRows();
			System.out.println("No of rows:"+rowcount);

		}catch (Exception e) {
			System.out.println(e.getMessage());;
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return rowcount;


	}
	
	public static int getcolcount() {
		int colcount=0;
		try {

			colcount=sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("No of columns:"+colcount);

		}catch (Exception e) {
			System.out.println(e.getMessage());;
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return colcount;


	}

	public static String getcelldatastring(int rowNum,int columnNum) {
         
		
		String celldata=null;
		try{

		    celldata=sheet.getRow(rowNum).getCell(columnNum).getStringCellValue();
			//System.out.println(celldata);

		}
		catch (Exception e) {
			System.out.println(e.getMessage());;
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return celldata;
	}
	
	public static void getcelldatanumber(int rowNum,int columnNum) {

		try{

			double celldata=sheet.getRow(rowNum).getCell(columnNum).getNumericCellValue();
			//System.out.println(celldata);

		}
		catch (Exception e) {
			System.out.println(e.getMessage());;
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
}
