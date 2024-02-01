package javaPractice2;

import java.util.Scanner;

public class sumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter input");
		Scanner scanner=new Scanner(System.in);
		long input=scanner.nextLong();
		//findSumOfDigits(input);
		//findSumOfEvenDigits(input);
		findSumOfOddDigits(input);
	}

	public static void findSumOfDigits(long input) {

		long sum=0;
		while (input!=0) {
			sum=sum+(input%10);
			input=input/10;
		}
		System.out.println(sum);
	}


	public static void findSumOfEvenDigits(long input) {

		long sum=0;
		
			while (input!=0) {
				long inputEven=input%10;
				if (inputEven%2==0) {
					sum=sum+inputEven;	
				}
				input=input/10;
				
			}

			
			System.out.println(sum);
		}
	public static void findSumOfOddDigits(long input) {

		long sum=0;
		
			while (input!=0) {
				long inputOdd=input%10;
				if (inputOdd%2!=0) {
					sum=sum+inputOdd;	
				}
				input=input/10;
				
			}

			
			System.out.println(sum);
		}

	}

