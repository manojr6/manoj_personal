package javaPractice;

import java.util.Scanner;

public class fibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=0;
		int num2=1;
		
		System.out.println("enter length of series:");
		Scanner scanner= new Scanner(System.in);
		int lengthOfSeries=scanner.nextInt();
		
		for (int i = 0; i < lengthOfSeries; i++) {
			System.out.print(num1+ " ");
			int nextNum=num1+num2;
			num1=num2;
			num2=nextNum;
		}

	}

}
