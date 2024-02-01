package javaPractice2;

public class printSubStrUsingRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j=1;
		printSubStr(j);
	}

	public static void printSubStr(int j) {
		String x="manoj";
		char y[]=x.toCharArray();
		if (j<y.length-1) {
			 {
				System.out.print(y[j]);
				printSubStr(j+1);
			
		}
		}
	}

}
