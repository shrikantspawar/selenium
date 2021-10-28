package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelUtils {
	public  excelUtils(String excelPath,String sheetName) {
		try{
			XSSFWorkbook workbook=new XSSFWorkbook("/home/am-pc-38/eclipse-workspace/ExcelProject/Excel/ExcelFile.xlsx");
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		}
		catch (Exception exp)
		{
			exp.printStackTrace();
		}
		
	}
	public static void main(String []args)
	{
		getRowcount();
		getCellDataString(0,0);
		getCellDataNumber(1,1);
		
		
		}
	
	public static void getRowcount() {


		try
		{XSSFWorkbook workbook=new XSSFWorkbook("/home/am-pc-38/eclipse-workspace/ExcelProject/Excel/ExcelFile.xlsx");
		XSSFSheet sheet=workbook.getSheet("Sheet1");
			
			int rowCount=sheet.getPhysicalNumberOfRows();
			System.out.println("no of rows :"+rowCount);
		}
		catch (Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		}
	}
	public static void getCellDataString(int rowNum,int colNum)
	{
		try
		{
			XSSFWorkbook workbook=new XSSFWorkbook("/home/am-pc-38/eclipse-workspace/ExcelProject/Excel/ExcelFile.xlsx");
			XSSFSheet sheet=workbook.getSheet("Sheet1");
			String celldata=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println(celldata);
		}
		catch (Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

	}
	public static void getCellDataNumber(int rowNum, int colNum)
	{
		try
		{
			XSSFWorkbook workbook=new XSSFWorkbook("/home/am-pc-38/eclipse-workspace/ExcelProject/Excel/ExcelFile.xlsx");
			XSSFSheet sheet=workbook.getSheet("Sheet1");
			double celldata=sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println(celldata);
		}
		catch (Exception exp)
		{
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}

	}

}
