package prog1;

public class arrayContainsElementorNot1 {

	int array[]= {1,2,3,4,56,6,7,8,9};
	int numbertofind=71;

	boolean present=false;

	public void elementPresent() {
		for (int number : array) {
			if (number==numbertofind)
				present=true;
		}
		if(present)
		{
			System.out.println("Number is present");	
		} else {
			System.out.println("Number is not present");

		}	

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrayContainsElementorNot1 result= new arrayContainsElementorNot1();
		result.elementPresent();

	}

}
