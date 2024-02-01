package javaPractice2;

public class pushZeroToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,0,5,6,0,4,0,9};
		int n=arr.length;
		pushZeroToEnd(arr, n);
		System.out.println("Array after pushing zeros to back:");

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+"");
		}

	}
	
	public static void pushZeroToEnd(int arr[],int n) {
		int count=0;
		for (int i = 0; i < n; i++) {
			if (arr[i]!=0) {
				arr[count++]=arr[i];
			}
		}
		
		while (count<n) {
			arr[count++]=0;
		}
	}

}
