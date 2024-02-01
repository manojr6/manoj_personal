package javaPractice2;

public class copyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		copyString();

	}

	public static void copyString() {
		String a="olamigaohoh";
		char x[]= a.toCharArray();
		int size=x.length;
		char y[] = new char[size];
		int i=0;
		while (i!=size) {
			y[i]=x[i];
			i++;
		}

		System.out.println(x);
		System.out.println(y);
	}
}
