package utils;

public class ExcelUtilsDemo {

	public static void main(String[] args) {
		
		String projectpath =System.getProperty("user.dir");
		ExcelUtils excel=new ExcelUtils(projectpath+"/Excel/Data.xlsx", "Sheet1");
		
		
		excel.getrowcount();
		excel.getcelldatastring(0, 0);
		excel.getcelldatanumber(1, 1);
	}
}
