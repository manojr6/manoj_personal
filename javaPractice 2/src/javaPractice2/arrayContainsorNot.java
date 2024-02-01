package javaPractice2;

public class arrayContainsorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arraycontainsornotusingForEach();
		arraycontainsornotusingWhile();
	}


	public static void arraycontainsornotusingForEach() {
		int[] array= {1,2,3,4,7,8,5,44,6};
		boolean found=false;
		int numToFind=666;

		for (int i : array) {
			if (i==numToFind) {
				found=true;
			}
		}

		if (found) {
			System.out.println("array contains element");
		} else {
			System.out.println("array not contains element");
		}
	}

	public static void arraycontainsornotusingWhile() {
		int[] array= {1,2,3,4,7,8,5,44,6};
		boolean found=false;
		int numToFind=6;
		int i=0;
		int size=array.length;
		while (i!=size) {
			if (array[i] ==numToFind) {
				found=true;
			}
		i++;	
		}

		if (found) {
			System.out.println("array contains element");
		} else {
			System.out.println("array not contains element");
		}
	}
}
