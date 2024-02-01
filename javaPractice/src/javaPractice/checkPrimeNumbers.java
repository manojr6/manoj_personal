package javaPractice;

import java.util.Scanner;

public class checkPrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean flag=true;

		System.out.println("enter number:");
		Scanner scn= new Scanner(System.in);
		int number=scn.nextInt();

		int sqrt= (int) (Math.sqrt(number)+1);

		for (int j = 2; j < sqrt; j++) {
			if (number%j==0) {
				flag=false;
			}

		}

		if (flag==true) {
			System.out.println("given number is prime number");
		} else {
			System.out.println("given number is not a prime number");
		}
	}

}
