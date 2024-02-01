package javaPractice3;

/**
 * @author user
 *
 */
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkPalindrome();
	}

	public static void checkPalindrome() {

		String x="racecarb";
		char y[]=x.toCharArray();
		int size=y.length;

		char z[] = new char[size] ;

		for (int i=0;i<size;i++) 
		{

			z[i]=y[size-1-i];
		}

		for (int j = 0; j < z.length; j++) {
		if (y[j]!=z[j]) {
			System.out.println("not palindrome");
			System.exit(j);
		}
		else
		{
			
		}
		
	}
		System.out.println("palindrome");

}
}
