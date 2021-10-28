package utils;

public class excelUtilsDemo {

	public static void main(String[] args) {
		excelUtils excel=new excelUtils("/home/am-pc-38/eclipse-workspace/ExcelProject/Excel/ExcelFile.xlsx", "Sheet1");
		excel.getRowcount();
		excel.getCellDataString(1,0);
		excel.getCellDataNumber(2,1);
	}

}
