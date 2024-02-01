package javaPractice;

import java.util.Scanner;

public class reverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter your number");
		Scanner scanner= new Scanner(System.in);
		int givenNumber=	scanner.nextInt();
		//int givenNumber=123456;
		int revNumber=0;

		while (givenNumber!=0) {
			revNumber=revNumber*10;
			revNumber=revNumber+givenNumber%10;
			givenNumber=givenNumber/10;

		}

		System.out.println(revNumber);
	}

}
