package javaPractice2;

import java.util.Scanner;

public class printFloydTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//printFloydTrianglewithStar();
		//printFloydTrianglewithNumbers();
		printPyramidwithStar();
	}

	public static void printFloydTrianglewithStar() {
		System.out.println("Enter number of lines:");
		Scanner scanner = new Scanner(System.in);
		int noOfLines= scanner.nextInt();

		for (int row = 0; row <noOfLines; row++) {
			for (int column = 0; column <=row; column++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
	
	public static void printFloydTrianglewithNumbers() {
		System.out.println("Enter number of lines:");
		Scanner scanner = new Scanner(System.in);
		int noOfLines= scanner.nextInt();
int i=1;
		for (int row = 0; row <noOfLines; row++) {
			for (int column = 0; column <=row; column++) {
				System.out.print(i+" ");
				i++;
			}
			System.out.println();
		}

	}
	
	public static void printPyramidwithStar() {
		System.out.println("Enter number of lines:");
		Scanner scanner = new Scanner(System.in);
		int noOfLines= scanner.nextInt();

		for (int row = 0; row <noOfLines; row++) {
			for (int column=noOfLines-row; column>1; column--)
            {
                // printing spaces
                System.out.print(" ");
            }
			for (int column = 0; column <=row; column++) {
				System.out.print(" * ");
			}
			System.out.println();
		}

	}

}
