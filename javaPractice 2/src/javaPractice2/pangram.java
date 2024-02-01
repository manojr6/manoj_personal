package javaPractice2;

public class pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkPangram();
	}

	public static void checkPangram() {
		String a="The quick brown fox jumps over the lazy dog";
		a=a.replace(" ", "");
		a=a.toUpperCase();
		char b[]=a.toCharArray();
		int size=a.length();
		int c[]= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

		int i=0;
		while (i!=size) {
			int index=b[i]-65;
			
			c[index]=1;
			i++;
		}
		i=0;
		while (i!=26) {
			
		if (c[i]!=1) {
			System.out.println("not pangram");
			System.exit(i);
		} else {
			i++;	
		}

	}
		System.out.println("pangram");
	}
}
