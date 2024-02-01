package prog1;

//import java.util.Iterator;
import java.util.Scanner;

public class printfloydtriangle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
System.out.println("Enter no.of lines: ");
int numberoflines=scanner.nextInt();
int row,column=0;

for(row=0;row<numberoflines;row++) 
{
	for(column=0;column<=row;column++) 
	{
		System.out.print("* ");
	}
	System.out.println();
}
	}

}
