package javaPractice2;

import java.util.Scanner;

public class largestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		largest();

	}

	public static void largest() {
		System.out.println("enter 3 numbers");
		Scanner scanner=new Scanner(System.in);
		int num1=scanner.nextInt();
		int num2=scanner.nextInt();
		int num3=scanner.nextInt();

		if (num1>num2&&num1>num3) {
			System.out.println("num1 is largest");

		} else 
			if (num2>num1&&num2>num3) {
				System.out.println("num2 is largest");

			}
			else
				if (num3>num2&&num3>num1) {
					System.out.println("num3 is largest");
				}

	}
	
	

}
