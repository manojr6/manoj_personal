package javaPractice3;

import java.util.Scanner;

public class sumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter input:");
		Scanner scanner=new Scanner(System.in);
		long input=scanner.nextLong();
		long sum=0;
		long sumOdd=0;
		long sumEven=0;

		sumDigits(input, sumEven);
		sumOddEvenDigits(input, sum, sumOdd, sumEven);

	}

	public static void sumDigits(long input,long sum) {

		while (input!=0) {

			sum=sum+(input%10);
			input=input/10;
		}
		System.out.println("sum of digits are:" +sum);
	}

	public static void sumOddEvenDigits(long input,long sum,long sumOdd,long sumEven) {

		while (input!=0) {
			if (input%2!=0) {
				long inputOdd=input%10;
				sumOdd=sumOdd+(inputOdd);

			}
			else {
				long inputEven=input%10;
				sumEven=sumEven+(inputEven);

				

			}
			input=input/10;
		}
		System.out.println("sum of odd digits are:" +sumOdd);
		System.out.println("sum of even digits are:" +sumEven);

	}

}
