package prog1;

import java.util.Scanner;

public class findMyPosition1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your character:");
		
	char givenchar = scanner.next().charAt(0);
	givenchar= Character.toLowerCase(givenchar);
	int asciivalue= (int)givenchar;
	int position= asciivalue-96;
	
	System.out.println(position);
		
				

	}

}
