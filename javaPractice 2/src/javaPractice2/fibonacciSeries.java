package javaPractice2;

import java.util.Scanner;

public class fibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibonacci();
	}

	public static void fibonacci() {
		System.out.println("Enter number");
		Scanner scanner= new Scanner(System.in);
		int lengthOfSeries=scanner.nextInt();
		int number1=0;
		int number2=1;
		for (int j = 0; j <= lengthOfSeries; j++) {
			System.out.print(number1+" ");
			int nextNum=number1+number2;
			number1=number2;
			number2=nextNum;
		}
	}

}
