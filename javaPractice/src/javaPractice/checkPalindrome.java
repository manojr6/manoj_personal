package javaPractice;

public class checkPalindrome {

	public static void main(String[] args) {
		checkPalindrome test1=new checkPalindrome();
		test1.pal1();
		//test1.spaceCasePal();
	}
	public void normalPal() {
		String x="toohottopoot";
		char y[]=x.toCharArray();
		int size=y.length;
		char a[]= new char[size];
		int i=0;
		while (i!=size) {
			a[size-1-i]=y[i];
			i++;
		}
		System.out.println(y);
		System.out.println(a);

		i=0;
		while (i<=size) {
			if (a[i]!=y[i]) {
				System.out.println("string is not a palindrome");
				System.exit(i);
			} else {
				i++;	
			}
		}
		System.out.println("string is a palindrome");

	}
	public void spaceCasePal() {
		String x="mor POR rop rom";
		x=x.replaceAll(" ", "");
		x=x.toLowerCase();

		char y[]=x.toCharArray();
		int size=y.length;
		char a[]= new char[size];
		int i=0;
		while (i!=size) {
			a[size-1-i]=y[i];
			i++;
		}
		System.out.println(y);
		System.out.println(a);

		i=0;
		while (i!=size) {
			if (a[i]!=y[i]) {
				System.out.println("string is not a palindrome");
				System.exit(i);
			} else {
				i++;	
			}
		}
		System.out.println("string is a palindrome");

	}

	public void pal1() {
		String a="malayalam";
		char b[]=a.toCharArray();
		int size=b.length;
		char c[]= new char[size];

		int i=0;
		while (i!=size) {
			c[size-1-i]=b[i];
			i++;
		}
		System.out.println(b);
		System.out.println(c);

		i=0;
		while (i!=size) {

			if (b[i]!=c[i]) {
				System.out.println("not palindrome");
				System.exit(i);
			} else {
				i++;

			}
		
		}
		System.out.println("palindrome");
	}
}
// TODO Auto-generated method stub

