package javaPractice;

public class arrayContainsorNot {

	public static void main(String[] args) {
		new arrayContainsorNot();
		arrayContainsorNot.containsOrNot();

	}


	public static void containsOrNot() {
		int[] array= {1,2,3,4,6};
		boolean found=false;
		int numToFind=6;
		for (int number : array) {
			if (number==numToFind) 
			{
				found=true;
				System.out.println("contains");
			}
		
	}
		if (found) {
			System.out.println("Number present");
		} else {
			System.out.println("Number Not Present");
		}
	}
}
