package javaPractice2;

public class findOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		usingForEach();
	}

	public static void usingForEach() {
		String x="aaromaeeele";
		char toFind='e';
		int occurence=0;

		char y[]=x.toCharArray();
		int i=0;
		for (char c : y) {
			if (y[i]==toFind) {
				occurence++;		
			}
			i++;
		}
		System.out.println(occurence);
	}
}
