
package javaPractice2;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkAnagram();
	}

	public static void checkAnagram() {
		String x="post";
		String y="stip";

		char a[]=x.toCharArray();
		char b[]=y.toCharArray();

		Arrays.sort(a);
		Arrays.sort(b);

		boolean result=Arrays.equals(a, b);

		if (result) {
			System.out.println("anagram");
		} else {
			System.out.println("not anagram");
		}
	}

}
