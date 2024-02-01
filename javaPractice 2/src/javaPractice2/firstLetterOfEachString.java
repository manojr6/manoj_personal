package javaPractice2;

public class firstLetterOfEachString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getFirstLetterOfEachString();
	}

	public static void getFirstLetterOfEachString() {
		String x="i love tamilnadu zebras";
		char y[]=x.toCharArray();
		int size=y.length;


		System.out.println(y[0]);
		int i=0;
		 while (i!=size) {
              if (y[i]==' ')
			{
				System.out.println(y[i+1]);
			}
              i++;



		 }
		
		 }

}
