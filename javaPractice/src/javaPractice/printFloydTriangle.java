package javaPractice;

import java.util.Iterator;
import java.util.Scanner;

public class printFloydTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the no.of lines: " );
		int i=0;
		int noOfLines=scanner.nextInt();

		
		for (int row = 0; row < noOfLines; row++) {
			for (int column = 0; column <=row; column++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
