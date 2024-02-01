package seleniumPractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import jxl.Sheet;
import jxl.Workbook;
import jxl.common.Assert;
import jxl.read.biff.BiffException;

public class compareTables {

	public static void main(String[] args) throws Exception {


		getTableContenet();

	}



	public static void getTableContenet() throws Exception  {
		System.setProperty("webdriver.chrome.driver","E:\\Selenium chromedriver\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/html/html_tables.asp");
		//Thread.sleep(10000);
		//driver.findElement(By.xpath("//*[@id=\"main\"]/button")).click();
		List<String> expextedList=new ArrayList<String>();
		List<String> actualList=new ArrayList<String>();
		List<WebElement> values=	driver.findElements(By.xpath("//*[@id=\"main\"]//div[3]//td"));

		int length=values.size();

		for (WebElement tableFields : values) {
			String tableValues=tableFields.getText();
			System.out.println(tableValues);
			expextedList.add(tableValues);
		}

		driver.quit();

		System.out.println("____________________");

		FileInputStream excel = new FileInputStream("E:\\sample table data.xls");
		HSSFWorkbook workbook=new HSSFWorkbook(excel);
		HSSFSheet sheet= workbook.getSheetAt(0);
		int lastRowNo= sheet.getLastRowNum();
		short lastCellNo= sheet.getRow(0).getLastCellNum();
		System.out.println(lastRowNo);
		System.out.println(lastCellNo);

		String[][] data= new String[lastRowNo][lastCellNo];

		for (int i = 1; i <= lastRowNo; i++) {
			HSSFRow row = sheet.getRow(i);

			for (int j = 0; j < lastCellNo; j++) 
			{
				HSSFCell cell = row.getCell(j);
				DataFormatter format=new DataFormatter();
				String excelValues= format.formatCellValue(cell);
				System.out.println(excelValues);
				
				actualList.add(excelValues);


			}


		}



		if (expextedList.size()!=actualList.size()) {
			System.out.println("not same");
			System.exit(0);
		}
		else 
		{
			for (int i = 0; i < expextedList.size(); i++) {

				if (expextedList.get(i).equals(actualList.get(i))) {
					continue;
				} else {
					System.out.println("not same");
					System.exit(0);
				}

			}
			System.out.println("same");





		}
	}
}














