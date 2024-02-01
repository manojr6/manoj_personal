package prog1;

public class ArrayContainsElementOrNot {

	int[] array= {1,2,3,4,5,6};
	int numberToFind=3;


	boolean found=false;

	public void presentOrNot() {
		for (int number : array) {
			if (number==numberToFind)
			{
				found=true;	
				System.out.println("Number is present");
			}
		}

			if (found) {
				System.out.println("Number present");
			} else {
				System.out.println("Number Not Present");
			}
		}
	


	public static void main(String[] args) {
		ArrayContainsElementOrNot arrayContainsElementOrNot = new ArrayContainsElementOrNot();
		arrayContainsElementOrNot.presentOrNot();


	}

}
