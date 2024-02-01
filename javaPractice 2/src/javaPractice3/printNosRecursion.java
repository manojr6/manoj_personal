package javaPractice3;

import java.util.Scanner;

public class printNosRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number:");
		Scanner scanner=new Scanner(System.in);
		int los=scanner.nextInt();
		printNumbers(los);
	}
	
	public static void printNumbers(int los) {
		int i=0;
		if (i<=los) {
			System.out.println(los);
			printNumbers(los-1);
			
		}
	}

}
