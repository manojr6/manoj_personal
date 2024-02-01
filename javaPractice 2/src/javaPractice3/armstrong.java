package javaPractice3;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkArmstrong();
	}

	public static void checkArmstrong() {
		System.out.println("Enter number:");
		Scanner scanner=new Scanner(System.in);
		int original=scanner.nextInt();

		int number=original;
		int temp=0;
		int check=0;

		while (number>0) {
			temp=number%10;

			check=check+(temp*temp*temp);
			number=number/10;

		}

		if (original==check) {
			System.out.println("armstrong");
		} else {
			System.out.println("not armstrong");
		}
	}

}
