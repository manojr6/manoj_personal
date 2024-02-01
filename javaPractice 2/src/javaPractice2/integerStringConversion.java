package javaPractice2;

public class integerStringConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intToString();
		stringToInt();

	}
	
	public static void intToString() {
		int i=23;
		String a = Integer.toString(i);
		System.out.println(a);
	}
		
		public static void stringToInt() {
			String i="256";
			int a = Integer.parseInt(i);
			System.out.println(a);
		
		
	}

}
