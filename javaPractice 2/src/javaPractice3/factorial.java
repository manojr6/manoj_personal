package javaPractice3;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//checkFactorial();
		System.out.println("Enter length of series:");
		Scanner scanner=new Scanner(System.in);
		int los=scanner.nextInt();
		
	 factorialRecursion(los);
	 System.out.println(factorialRecursion(los));

	}

	public static void checkFactorial() {
		System.out.println("Enter length of series:");
		Scanner scanner=new Scanner(System.in);
		int los=scanner.nextInt();

		int fact=1;

		for (int i = 1; i <= los; i++) {
			fact=fact*i;

		}
		System.out.println(fact);

	}

	public static int factorialRecursion(int los) {
		if (los==0) {
			return 1;
		} else {
			return los*factorialRecursion(los-1);
		}
	}

}
