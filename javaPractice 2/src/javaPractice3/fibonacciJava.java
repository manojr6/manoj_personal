package javaPractice3;

import java.util.Scanner;

public class fibonacciJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fib();
	}

	public static void fib() {
		System.out.println("Enter number");
		Scanner scanner= new Scanner(System.in);
		int lengthOfSeries=scanner.nextInt();
		int num1=0;
		int num2=1;

		for (int i = 0; i < lengthOfSeries; i++) {

			System.out.println(num1+" ");
			int nextnum=num1+num2;
			num1=num2;
			num2=nextnum;
		}


	}

}
