package javaPractice2;

import java.util.Scanner;

public class reverseStringWithoutLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter input string");
		Scanner scanner = new Scanner(System.in);
		String str=scanner.nextLine();
		char[] ch=str.toCharArray();
		int size=ch.length;
		reverseString(ch, size);
		

	}
	
	public static void reverseString(char[] ch,int size) {
		if (size>0) {
			System.out.print(ch[size-1]);
			size--;
			reverseString(ch, size);
		}
		
		
	}

}
