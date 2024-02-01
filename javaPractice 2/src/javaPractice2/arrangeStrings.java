package javaPractice2;

public class arrangeStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrangeStringsFnB();
	}

	public static void arrangeStringsFnB() {

		String x= "Apple is a fruit i like it very much";
	String[] y= x.split(" ");	
	for (String stringBefore : y) {
		System.out.print(stringBefore+" ");
	}
	System.out.println();

	//char y[]=x.toCharArray();

		int size=y.length;
		String z[]=new String[size];

		for (int i = 0; i < size; i++) {
			if (i%2==0) {
				z[i]=y[i];
			} else {
				z[i]=y[size-1-i];
			}

		}
for (String stringAfter : z) {
	System.out.print(stringAfter+" ");
}
		

	}

}
