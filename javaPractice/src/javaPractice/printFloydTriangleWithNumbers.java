package javaPractice;

import java.util.Scanner;

public class printFloydTriangleWithNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter the no.of lines: " );
			int startingNumber=0;
			int noOfLines=scanner.nextInt();
			for (int row = 0; row < noOfLines; row++) {
				for (int column = 0; column <=row; column++) {
					System.out.print(startingNumber+" ");
					startingNumber=startingNumber+1;
				}
				System.out.println();
		
			}
		}


	}


