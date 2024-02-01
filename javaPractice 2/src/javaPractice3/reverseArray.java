package javaPractice3;

public class reverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		reverseAnArray();
	}
	
	public static void reverseAnArray() {
		
		int [] arr = new int [] {1, 2, 3, 4, 5,9};  
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		
		
		for (int i = arr.length-1; i >=00; i--) {
			System.out.print(arr[i]+" ");
		}
	}

}
