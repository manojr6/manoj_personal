package javaPractice2;

public class caseConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lowerToUpper();
		upperToLower();
	}

	public static void lowerToUpper() {
		String x="leo";
		char y[]=x.toCharArray();
		int size=y.length;

		int i=0;
		while (i!=size) {
			y[i]=(char) (y[i]-32);
			i++;	
		}
		System.out.println(y);

	}
	
	public static void upperToLower() {
		String x="VIDAMUYARCHI";
		char y[]=x.toCharArray();
		int size=y.length;

		int i=0;
		while (i!=size) {
			y[i]=(char) (y[i]+32);
			i++;	
		}
		System.out.println(y);

	}

}
