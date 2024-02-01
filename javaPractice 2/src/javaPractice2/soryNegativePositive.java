package javaPractice2;

import java.util.Arrays;

public class soryNegativePositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sort();
	
	}

	public static void sort() {
		int arr[]= {1,2,3,4,-5,-6,-9,0,8};
		Arrays.sort(arr);
		for (int i : arr) {
			System.out.print(i+"  ");
		}
	}

}
