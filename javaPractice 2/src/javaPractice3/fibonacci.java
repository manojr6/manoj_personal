package javaPractice3;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//checkFibonacci();
		System.out.println("Enter length of series:");
		Scanner scanner=new Scanner(System.in);
		int los=scanner.nextInt();
		
		System.out.println(n1+ "\n" +n2);
		checkFibonacciRecursion(los-1);
	}

	public static void checkFibonacci() {
		System.out.println("Enter length of series:");
		Scanner scanner=new Scanner(System.in);
		int los=scanner.nextInt();

		int firstNumber=0;
		int secondNumber=1;
	
		int i=0;
		while(i<=los)
		{
			
			System.out.print(firstNumber+" ");
			int nextNumber=firstNumber+secondNumber;
			firstNumber=secondNumber;
			secondNumber=nextNumber;
			i++;
		}

		

	}
	static int n1=0,n2=1;
	public static void checkFibonacciRecursion(int los) {
	
	
	if (los>0) {
		int n3=n1+n2;
		System.out.println(n3+" ");
		n1=n2;
		n2=n3;
		checkFibonacciRecursion(los-1);
	}
		
		
		
		
	}

}
