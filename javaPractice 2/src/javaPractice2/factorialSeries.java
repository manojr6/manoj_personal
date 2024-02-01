package javaPractice2;

import java.util.Scanner;

public class factorialSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
factorial();
	}
	
	public static void factorial() {
		System.out.println("Enter number");
		Scanner scanner=new Scanner(System.in);
		int lengthOfSeries=scanner.nextInt();
		
		
		int fact=1;
		for (int i = 1; i <=lengthOfSeries; i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
