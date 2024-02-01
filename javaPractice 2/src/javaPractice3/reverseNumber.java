package javaPractice3;

import java.util.Scanner;

public class reverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseANumber();

	}

	public static void reverseANumber() {
		System.out.println("enter number:");
		Scanner scanner=new Scanner(System.in);
		int input=scanner.nextInt();
		
		int revNumber=0;
		while (input>0) {	
		revNumber=revNumber*10;
		revNumber=revNumber+input%10;
		input=input/10;
		}
		
		System.out.println(revNumber);
	}
}
