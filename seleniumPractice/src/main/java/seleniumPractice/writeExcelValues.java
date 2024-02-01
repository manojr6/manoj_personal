package seleniumPractice;

import java.io.FileOutputStream;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;



public class writeExcelValues {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub  
		HSSFWorkbook workbook = new HSSFWorkbook();
		   HSSFSheet sheet = workbook.createSheet();
		   String str = "manoj";
		   Row row = sheet.createRow(3);
		  {
		          Cell cell = row.createCell(5);
		          cell.setCellValue(str);
		   } 
		 
		   FileOutputStream outputStream = new FileOutputStream("E:\\Manoj Work\\craeteValues1.xls");
		 
		   {
		       workbook.write(outputStream);
		   }
		  }

	}


