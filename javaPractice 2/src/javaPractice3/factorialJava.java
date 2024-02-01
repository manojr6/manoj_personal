package javaPractice3;

import java.util.Scanner;

public class factorialJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factJava();
	}

	public static void factJava() {
		System.out.println("Enter length of series:");
		Scanner scanner=new Scanner(System.in);
		int los=scanner.nextInt();

		int fact=1;

		for (int i = 1; i < los; i++) {
			fact=fact*i;

		}

		System.out.println(fact);
	}

}
