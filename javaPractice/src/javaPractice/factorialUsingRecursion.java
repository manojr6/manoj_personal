package javaPractice;

import java.util.Scanner;

public class factorialUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter length of series:");
		Scanner scanner=new Scanner(System.in);
		int lengthOfSeries=scanner.nextInt();
		
	
	fact(lengthOfSeries);
		
	System.out.println(fact(lengthOfSeries));

	}

	
	public static int fact(int lengthofSeries) {
		if (lengthofSeries==0) {
			return 1;
		} else {
			return lengthofSeries*fact(lengthofSeries-1);

		}
	}
}
