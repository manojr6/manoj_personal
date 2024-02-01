package javaPractice3;

import java.util.Scanner;

public class printFloydTriangle3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter length of series");
		Scanner scanner=new Scanner(System.in);
		int LOS=scanner.nextInt();
		//withStar(LOS);
		//withNumber(LOS);
		printPyramidwithStar(LOS);
		//printPyramidwithNumbers(LOS);	
	}

	public static void withStar(int LOS) {
		for (int row = 0; row <LOS; row++) 
		{
			for (int column = 0; column <=row ; column++) {
				System.out.print("*");

			}
			System.out.println();

		}
	}

	public static void withNumber(int LOS) {
		int i=1;
		for (int row = 0; row <LOS; row++) {
			for (int column = 0; column <=row ; column++) {
				System.out.print(i+" ");
				i++;
			}
			System.out.println();

		}
	}

	public static void printPyramidwithStar(int LOS) {
		for (int row = 0; row < LOS; row++) {

			for (int column = LOS-row; column>1; column--) {
				System.out.print(" ");
			}

			for (int column = 0; column <=row; column++) {
				System.out.print(" * ");
			}
			System.out.println();

		}
	}

	public static void printPyramidwithNumbers(int LOS) {
		int i=1;
		for (int row = 0; row < LOS; row++) {

			for (int column = LOS-row; column>1; column--) {
				System.out.print(" ");
			}

			for (int column = 0; column <=row; column++) {
				System.out.print("    "+i+"   ");
				i++;
			}
			System.out.println();

		}
	}

}
