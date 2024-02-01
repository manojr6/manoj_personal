package seleniumPractice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;

public class readExcelValues {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream excel = new FileInputStream("E:\\sample data.xls");
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
			String value= format.formatCellValue(cell);
		    //data[i-1][j]=value;
			
	//	System.out.println("excel:"+value);
		
		List<String> list=new ArrayList<String>(Arrays.asList(value));
		
	
		
		System.out.println("excelList:"+list);
		
		//Set<String> set=new HashSet<String>(Arrays.asList(value));
		//System.out.println("excelSet:"+set);
		
		
		
			
		workbook.close();

	}

}
	}
}
