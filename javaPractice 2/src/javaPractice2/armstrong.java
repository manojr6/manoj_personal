package javaPractice2;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//checkArmstrong();
		checkArmstrong1();
	}

	public static void checkArmstrong() {
		System.out.println("enter number");
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		scanner.close();


		int original=number;
		int temp;
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


	public static void checkArmstrong1() {
		System.out.println("enter original number");
		Scanner scanner= new Scanner(System.in);
		int number= scanner.nextInt();


		int temp;
		int check=0;
		int original=number;

		while (number>0) {
			temp=number%10;
			check=check+(temp*temp*temp);
			number=number/10;
		}

		if (original==check) {
			System.out.println("armstrong");
		} else {
			System.out.println(" not armstrong ");
		}

	}

}
