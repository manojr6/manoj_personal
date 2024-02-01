package javaPractice3;

public class printTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//printNumbers();
		stringSwap();

	}

	public static void printNumbers() {
		int x=5;



		System.out.println(x++);

		System.out.println(+x);

		System.out.println(x);
	}

	public static void stringSwap() {

		String x="manoj";
		String y="ramachandran";

		String z=	x.concat(y);
		
		y=x;
		x=z.substring(x.length(),z.length());
		System.out.println(x);
		System.out.println(y);

	}

}
