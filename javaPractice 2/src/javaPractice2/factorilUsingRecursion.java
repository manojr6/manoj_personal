package javaPractice2;

import java.util.Scanner;

public class factorilUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter length of series:");
		Scanner scanner = new Scanner(System.in);
		int lengthOfSeries=	scanner.nextInt();


		factorialRecursion(lengthOfSeries);
		System.out.println(factorialRecursion(lengthOfSeries));
	}



	public static int factorialRecursion(int lengthOfSeries) {


		if (lengthOfSeries==0) {
			return 1;
		} else {
			return lengthOfSeries*factorialRecursion(lengthOfSeries-1); 
		}



	}

}
