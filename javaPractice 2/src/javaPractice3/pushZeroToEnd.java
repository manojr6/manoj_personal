package javaPractice3;

public class pushZeroToEnd {

	public static void main(String[] args) {
		pushZero();
	}

	public static void pushZero() {

		int arr[]= {2,3,4,0,9,0,0,7,0,6,8};

		int count=0;
		int n=arr.length;

		for (int i = 0; i < n; i++) {
			if (arr[i]!=0) {
				arr[count++]=arr[i];
			}
		}

			while (count<n) {
				arr[count++]=0;
			}
			
			for (int i = 0; i < n; i++) {
				System.out.print(arr[i]+" ");
			}
		
	}

}
