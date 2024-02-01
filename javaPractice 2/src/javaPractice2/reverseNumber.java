package javaPractice2;

import java.util.Scanner;

public class reverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseNumberusingWhile();

	}

	public static void reverseNumberusingWhile() {
		System.out.println("Enter given number");
		Scanner scanner=new Scanner(System.in);
		long givenNumber=scanner.nextLong();

		long revNumber=0;

		while (givenNumber!=0)
		{
			revNumber=revNumber*10;
			revNumber=revNumber+givenNumber%10;
			givenNumber=givenNumber/10;
		}
		System.out.println(revNumber);

	}

}
