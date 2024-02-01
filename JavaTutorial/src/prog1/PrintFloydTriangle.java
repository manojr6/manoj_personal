package prog1;

import java.util.Scanner;

public class PrintFloydTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no.of lines: " );
		int numberOfLines= scanner.nextInt();
		int row,column=0;
		
		
	for(row=0;row<numberOfLines;row++)
	{
		for(column=0;column<=row;column++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
		
	}
}