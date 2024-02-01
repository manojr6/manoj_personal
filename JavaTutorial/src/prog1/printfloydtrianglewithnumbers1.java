package prog1;

//import java.util.Iterator;
import java.util.Scanner;

public class printfloydtrianglewithnumbers1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
System.out.println("Enter no.of rows: ");
int startingnumber=0;
int limit=scanner.nextInt();
int row,column=0;

for(row=0;row<limit;row++) 
{
	for(column=0;column<=row;column++) 
	{
		System.out.print(startingnumber+" ");
		startingnumber=startingnumber+1;
	}
	System.out.println();
}
	}

}
