package javaPractice2;

public class stringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x="kodiyil oruvan";
		
		System.out.println(x.substring(1,x.length()-1));
		
		System.out.println(x.substring(0, 5));
		
		
		char y[]=x.toCharArray();
	
	for (int j = 1; j < y.length-1; j++) {
	 {
		System.out.print(y[j]);
	}
		
	}

	}

}
