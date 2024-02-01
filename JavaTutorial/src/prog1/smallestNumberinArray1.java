package prog1;

public class smallestNumberinArray1 {

	int givenArray[]= {2,3,4,5,6,7,8,9,1001};
	public void findSmallest()
	{

		int smallest= Integer.MAX_VALUE;

		for(int j=0;j<givenArray.length;j++) {
			if (givenArray[j]<smallest)
			{
				smallest=givenArray[j];

			}

		}
		System.out.println("Smallest number is:"+smallest);
	}

	public void findLargest()
	{

		int largest= Integer.MIN_VALUE;

		for(int j=0;j<givenArray.length;j++) {
			if (givenArray[j]>largest)
			{
				largest=givenArray[j];

			}

		}
		System.out.println("LARGEST number is:"+largest);
	}

	public static void main(String[] args) {
		smallestNumberinArray1 array= new smallestNumberinArray1();
		array.findSmallest();
		array.findLargest();
		
	}

}
