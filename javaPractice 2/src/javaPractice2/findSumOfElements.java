package javaPractice2;

public class findSumOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumOfElements();
	}

	public static void sumOfElements() {
		int y[]= {1,2,3,4,6,5};
		int sum=0;

	for (int i = 0; i < y.length; i++) 
	{
		
			sum=sum+y[i];
		}

		System.out.println(sum);
	}

}
