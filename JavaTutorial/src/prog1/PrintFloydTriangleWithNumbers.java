package prog1;

import java.util.Scanner;

public class PrintFloydTriangleWithNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the rows : " );
		
		int startingNumber=1;
			int limit;
		limit= scanner.nextInt();
		int row,column=0;
		
		
	for(row=0;row<limit;row++)
	{
		for(column=0;column<=row;column++)
		{
			System.out.print(startingNumber+" ");
			startingNumber=startingNumber+1;
		}
		System.out.println();
	}
		

	}

}
