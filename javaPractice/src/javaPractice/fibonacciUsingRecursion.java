package javaPractice;

import java.util.Scanner;

public class fibonacciUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.out.println("enter length of series:");
		Scanner scanner=new Scanner(System.in);
		int lengthOfSeries=scanner.nextInt();

		System.out.println(n1+ "\n" +n2);
		printFibonacci(lengthOfSeries-2);

		


	}




	static int n1=0, n2=1, n3=0;
	public static void printFibonacci(int lengthofSeries) {

		if (lengthofSeries>0) {
			n3=n1+n2;
			System.out.println(""+n3);
			n1=n2;
			n2=n3;
			printFibonacci(lengthofSeries-1);

		}
	}
}


