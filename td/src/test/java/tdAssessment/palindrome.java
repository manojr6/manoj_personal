package tdAssessment;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//checkPalindrome();
		
		int a=2;
		//System.out.println(a++);
		System.out.println(++a);
		
	
		
		///System.out.println(a);
		//System.out.println(++a);
	}

	public static void checkPalindrome() {
		System.out.println("Enter input");
		Scanner scanner= new Scanner(System.in);
		String input=scanner.next();

		char y[]=input.toCharArray();

		int size=y.length;

		char z[]= new char[size];

		int i=0;

		for (i=0;i<size;i++) {
			z[i]=y[size-1-i];
		}

	for (int j = 0; j < z.length; j++) {
		
		if (y[j]!=z[j]) {
			System.out.println("Not a Palindrome");
			System.exit(i);
	
		}
	
		}
		System.out.println("Palindrome");
	
	}
	
	}

