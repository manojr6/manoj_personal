package javaPractice3;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkPrimeNumber1();
	}

	public static void checkPrimeNumber1() {
		System.out.println("Enter number:");
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();

		int sqrt=(int) (Math.sqrt(number)+1);
boolean flag=true;
		for (int i = 2;i<sqrt ; i++) {
			if (number%i==0) {
			flag=false;
			} 
		}
		
		if (flag==true) {
			System.out.println("Prime Number");
		} else {
			System.out.println("Not Prime Number");
		}
	}

}
