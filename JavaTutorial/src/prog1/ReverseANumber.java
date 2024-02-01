package prog1;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int givenNumber=80385143;
		int reversedNumber=0;
		
		while(givenNumber!=0) {
		
		reversedNumber=reversedNumber*10;
		reversedNumber=reversedNumber+givenNumber%10;
        givenNumber=givenNumber/10;
	}
		System.out.println(reversedNumber);
	}
	
	
	//to get value from user -----------------------
	
	/*
	 * int givennumber=0; System.out.println("Enter your number:"); Scanner
	 * scanner=new Scanner(System.in); scanner.nextInt();
	 * 
	 */

}
