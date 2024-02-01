package prog1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SmallestNumberInArray
{

	int givenArray[]= {2,1,3,4,5};
	
	public void findSmallest() {
	
		int smallest= Integer.MAX_VALUE;
	
		for(int i=0;i<givenArray.length;i++)
		{
			if(givenArray[i]<smallest) {
				smallest=givenArray[i];
			}
			
				
		}
		System.out.println("Smallest number is:"+smallest);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		SmallestNumberInArray array= new SmallestNumberInArray();
		array.findSmallest();
	}
}


/*
 * 
 * //using arrays
 * 
 * public void usingArrays() 
 * {
 *  Arrays.sort(givenArray);
 * System.out.println(givenArray[0]);
 *  }
 * 
 * 
 * //using collections
 * 
 * public void usingCollections() { 
 * //change int to Integer
 * 
 * List<Integer> list= Arrays.asList(givenArray); 
 * Collections.sort(list); 
 *int smallest=list.get(0);
 *System.out.println(smallest); }
 */