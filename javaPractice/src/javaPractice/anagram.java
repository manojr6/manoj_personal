package javaPractice;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x="hitler";
		String y="thiler";

		char a[]=x.toCharArray();
		char b[]=y.toCharArray();

		Arrays.sort(a);
		Arrays.sort(b);

		boolean result=	Arrays.equals(a,b);

		if (result==true) {
			System.out.println("anagram");
		} else {
			System.out.println("not anagram");
		}

	}
}
