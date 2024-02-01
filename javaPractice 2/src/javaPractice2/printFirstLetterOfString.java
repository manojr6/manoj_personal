package javaPractice2;

public class printFirstLetterOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printFirst();
	}

	public static void printFirst() {
		String x="avan ivan evano vallavan nallavan manoj";
		char y[]=x.toCharArray();
		System.out.println(y[0]);
		for (int i = 0; i < y.length; i++)   {
			if (y[i]==' ')
			{
			System.out.println(y[i+1]);	
			}
		}


	}
}