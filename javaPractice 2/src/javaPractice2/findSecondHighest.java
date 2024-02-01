package javaPractice2;

import java.util.Arrays;

public class findSecondHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//secondHighest();
	
		int arr[] = { 100,14, 46,25, 47, 94, 94,109, 52,1008, 86, 36, 94,214,3009, 89,98999};
		secondLowest(arr);
		System.out.println(secondLowest(arr));

	}

	public static void secondHighest() {
		int arr[] = { 100,14, 46, 47, 94, 94,109, 52,1008, 86, 36, 94,214,3009, 89,98999};
		int highest1=0;
		int highest2=0;
		int index=0;
	
		
		for (int i : arr) {
			if (arr[index]>highest1) {
				
				highest2=highest1;
				highest1=arr[index];
				
			}
			else if (arr[index]>highest2) {
				highest2=arr[index];
			}
			
			index++;	
		}
			
		
		System.out.println(highest1);
		System.out.println(highest2);
	}
	
	
	public static int secondLowest(int[] arr) {
		//int arr[] = { 100,14, 46, 47, 94, 94,109, 52,1008, 86, 36, 94,214,3009, 89,98999};

		Arrays.sort(arr);
		return arr[1];
	}

}
