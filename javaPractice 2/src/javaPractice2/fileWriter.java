package javaPractice2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class fileWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	fileWriteUsingBuffer();
	}

	
	public static void fileWriteUsingFileWriter() throws IOException {
		String loc="E:\\Manoj Work\\fileWriteSample1.xls";
		FileWriter fileWriter=new FileWriter(loc);
		fileWriter.write("laser like focus manoj");
		fileWriter.close();

	}
	
	public static void fileWriteUsingBuffer() throws IOException {
		String loc="E:\\Manoj Work\\fileWriteSampleBuff.txt";
		FileWriter fileWriter=new FileWriter(loc);
		BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
		bufferedWriter.write("va va va va");
		bufferedWriter.close();
	}
}
