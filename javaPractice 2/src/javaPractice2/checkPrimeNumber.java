package javaPractice2;

import java.util.Scanner;

public class checkPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
checkPrimeNumbers();
	}
	
	public static void checkPrimeNumbers() {
		System.out.println("enter number");
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		
		boolean flag=true;
		
		int sqrt=(int) (Math.sqrt(number)+1);
		
		for (int i = 2; i < sqrt; i++) {
			if (number%i==0) {
				flag=false;
			}
			
		}
		
		if (flag==true) {
			System.out.println("prime number");
		} else {
			System.out.println("not prime number");
		}
	}

}
