package javaPractice2;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkPalindrome();
	}

	public static void checkPalindrome() {

		String a="malayalam";
		char b[]=a.toCharArray();
		int size=b.length;
		char c[]=new char[size];
		int i=0;
		for (char d : c) {
			c[i]=b[size-1-i];
			i++;
		}
		System.out.println(b);
		System.out.println(c);

		i=0;
		for (char d : c) {
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
