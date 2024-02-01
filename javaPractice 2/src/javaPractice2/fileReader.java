package javaPractice2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class fileReader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//fileReadUsingBuffer();
		fileReadUsingLoops();
	}

	public static void fileReadUsingBuffer() throws IOException {
		String loc="E:\\\\Manoj Work\\\\fileWriteSample.txt";
		FileReader fileReader=new FileReader(loc);
		BufferedReader reader=new BufferedReader(fileReader);
		String str= reader.readLine();
		System.out.println(str);
		reader.close();
		fileReader.close();

	}

	public static void fileReadUsingLoops() throws IOException {
		String loc="E:\\\\Manoj Work\\\\fileWriteSample.txt";
		FileReader fileReader=new FileReader(loc);
		BufferedReader reader=new BufferedReader(fileReader);
		String str;
		while ((str=reader.readLine())!=null) {
			System.out.println(str);

		}
		

		reader.close();
		fileReader.close();

	}

}
