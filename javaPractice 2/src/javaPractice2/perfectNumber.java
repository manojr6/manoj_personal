package javaPractice2;

import java.util.Scanner;

public class perfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//checkPerfectNumber();
		checkPerfectNumber1();

	}
	
	public static void checkPerfectNumber() {
		System.out.println("enter number");
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		scanner.close();
		int sum=0;
		for (int i = 1; i <= number/2; i++) {
			if (number%i==0) {
				sum=sum+i;
			}
		}
		if (sum==number) {
			System.out.println("perfect number");
		} else {
			System.out.println("not perfect number");

		}
		
		

}
	
	public static void checkPerfectNumber1() {
		System.out.println("enter number");
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		
		int sum=0;
		
		for (int i = 1; i <= number/2; i++) {
			if (number%i==0) {
				sum=sum+i;	
			}
			
			
		}
		
		if (sum==number) {
			System.out.println("perfect number");
		} else {
			System.out.println("not perfect number");
		}
	}
}
