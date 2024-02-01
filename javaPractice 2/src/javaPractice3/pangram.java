package javaPractice3;

public class pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkPangram();
	}

	public static void checkPangram() {
		String a="The quick brown fox jumps over the lazy dog";
		a=a.toUpperCase();
		a=a.replaceAll(" ", "");
		char b[]=a.toCharArray();
		int size=b.length;


		int x[]= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		int i=0;
		while (i!=size) {
			int index=b[i]-65;
			x[index]=1;
			i++;
		}

		for (int j = 0; j <26; j++) {
			if (x[j]!=1) {
				System.out.println("not pangram");
				System.exit(j);
			}

		}
		System.out.println("pangram");
	}

	public static void checkPangram2() {
		String x="The quick brown fox jumps over the lazy dog";
		x=x.replaceAll(" ", "");
		x=x.toUpperCase();
		char y[]=x.toCharArray();
		int size=y.length;

		int z[]= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

		for (int i = 0; i <size; i++) {
			int index=y[i]-65;
			z[index]=1;		
		}

		int i=0;
		while (i!=26) {
			if (z[i]!=1) {
				System.out.println("not pangram");
				System.exit(i);
			}
			i++;
		}
		System.out.println("pangarm");
	}

}
