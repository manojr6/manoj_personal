package prog1;

public class SwapTwoNumbers {

	public void withThidVariable()
	{
		int mySalary=20;
		int superirorSalary=50;

		System.out.println("Before swapping "+ "mine:"+ mySalary + "superior:" +superirorSalary );

		int temp= mySalary;
		mySalary=superirorSalary;
		superirorSalary=temp;
		System.out.println("After swapping "+ "mine:"+ mySalary + "superior:" +superirorSalary );

	}

	public void withoutThidVariable()
	{
		/*
		 * formula:
		 * addition,subtraction----
		 * first=first-second second=first+second first=second-first
		 * 
		 * 
		 * multiplication,division----
		 * first=first*second second=first/second first=first/second
		 */

		int first=20;
		int second=50;

		System.out.println("Before swapping "+ "mine:"+ first + "superior:" +second );

		        first=first-second ;
				second=first+second ;
				first=second-first;
				System.out.println("Before swapping "+ "mine:"+ first + "superior:" +second );

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapTwoNumbers numbers=new SwapTwoNumbers();
		numbers.withoutThidVariable();
		numbers.withThidVariable();

	}

}
