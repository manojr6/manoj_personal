package javaPractice;

import java.util.Scanner;

public class factorialSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter length of series:");
		Scanner scanner = new Scanner(System.in);
		int lengthOfString=scanner.nextInt();
		int fact=1;
		for (int i = 1; i <= lengthOfString; i++) {
			fact=fact*i;
		}
System.out.println(fact);
	}

}
