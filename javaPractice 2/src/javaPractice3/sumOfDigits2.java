package javaPractice3;

import java.util.Scanner;

public class sumOfDigits2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumOfDigits2A();
	}

	public static void sumOfDigits2A() {
		System.out.println("enter number:");
		Scanner scanner=new Scanner(System.in);
		int input=scanner.nextInt();

		int sum=0;
		while (input!=0) 
		{
			sum=sum+input%10;
			input=input/10;
		}

		System.out.println(sum);
	}

}
