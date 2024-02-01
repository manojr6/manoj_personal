package javaPractice3;

public class pushZeroToEnd2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {2,3,4,0,5,0,8,9,1,0,9,0,0,0,0,7,0,6,8};
		
		int size=arr.length;
		int count =0;
		
		
		for (int j = 0; j < size; j++) 
	
	 {
		if (arr[j]!=0) {
			arr[count++]=arr[j];
		}
		}
		
		while (count<size) {
			arr[count++]=0;
		}
		
		for (int j = 0; j < size; j++) {
			System.out.print(arr[j]+ " ");
		}
	}

}
