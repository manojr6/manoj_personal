package prog1;

import java.security.PublicKey;

public class SWAPtWOnUMBERS1 {

	public static void main(String[] args) {
		SWAPtWOnUMBERS1 swapTwoNumbers=new SWAPtWOnUMBERS1();
		swapTwoNumbers.withoutThirdVariable();
		swapTwoNumbers.withThirdVariable();
		
	}
	public void withThirdVariable()

	{
		int mySalary=50000000;
		int superiorSalary=51111111;
		
		System.out.println("Before swapping "+ "mine:"+ mySalary + "superior:" +superiorSalary );
		int temp=mySalary;
		mySalary=superiorSalary;
		superiorSalary=temp;
		
		System.out.println("After swapping "+ "mine:"+ mySalary + "superior:" +superiorSalary );
		
		
	}
	public void withoutThirdVariable()
	
	{
		int mySalary=50;
		int superiorSalary=51;
		
		System.out.println("Before swapping "+ "mine:"+ mySalary + "superior:" +superiorSalary );
		mySalary=mySalary-superiorSalary;
		superiorSalary=mySalary+superiorSalary;
		mySalary=superiorSalary-mySalary;
		System.out.println("After swapping "+ "mine:"+ mySalary + "superior:" +superiorSalary );
		
		
	}

}
