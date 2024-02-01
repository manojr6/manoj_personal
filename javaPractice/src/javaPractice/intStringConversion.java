package javaPractice;

public class intStringConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intStringConversion isc= new intStringConversion();
		isc.intToString();
		isc.stringToInteger();
	}

	public static void intToString() {
		int i=65;
		String j = Integer.toString(i);
		System.out.println(j);
	}

	public static void stringToInteger() {
		String k="66";
		int m=Integer.parseInt(k);
		System.out.println(m);
	}

}
