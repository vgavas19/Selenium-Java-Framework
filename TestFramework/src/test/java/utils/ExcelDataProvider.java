package utils;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	
	@Test(dataProvider= "Test1data")
	public void test1(String username, String password) {
		System.out.println(username + " | " + password);
	}
	
	@DataProvider(name= "Test1data")
	public Object[][] getdata() {
		String excelpath="C:/Users/Vaibhav Gavas/eclipse-workspace/TestFramework/Excel/Data.xlsx";
		
		Object data[][]=testdata(excelpath, "Sheet1");
		return data;
	}
	

	public Object[][] testdata(String excelpath, String sheetname) {
		
		ExcelUtils excel=new ExcelUtils(excelpath, sheetname);
		
		int rowcount=excel.getrowcount();
		int colcount=excel.getcolcount();
		
		Object data[][]= new Object[rowcount-1][colcount];
		
		for(int i=1; i<rowcount; i++)
		{
			for(int j=0;j<colcount;j++)
			{
			String celldata=excel.getcelldatastring(i, j);
			System.out.print(celldata+" | ");
			data[i-1][j]=celldata;
			}
			System.out.println();
		}
		return data;
	}
	
}
