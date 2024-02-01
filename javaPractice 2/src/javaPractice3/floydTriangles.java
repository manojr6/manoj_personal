package javaPractice3;

import java.util.Scanner;

public class floydTriangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//floydStar();
		//floydNumbers();
	floydPyramidStar();
	}

	public static void floydStar() {
		System.out.println("Enter los");
		Scanner scanner=new Scanner(System.in);
		int los=scanner.nextInt();
		for (int row = 0; row < los; row++) {
			for (int column = 0; column <=row; column++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

	public static void floydNumbers() {
		System.out.println("Enter los");
		Scanner scanner=new Scanner(System.in);
		int los=scanner.nextInt();
		int i=1;
		for (int row = 0; row < los; row++) {
			for (int column = 0; column <=row; column++) {
				System.out.print(i+" ");
				i++;
			}

			System.out.println();
		}

	}
	
	public static void floydPyramidStar() {
		System.out.println("Enter los");
		Scanner scanner=new Scanner(System.in);
		int los=scanner.nextInt();
		
		for (int row = 0; row < los; row++) {
			
			for (int column = los-row; column>1; column--) {
				System.out.print(" ");
				
			}
			for (int column = 0; column <=row; column++) {
				System.out.print(" * ");
			
			}

			System.out.println();
		}

	}

}


