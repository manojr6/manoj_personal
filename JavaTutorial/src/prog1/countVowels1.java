package prog1;

import java.util.Iterator;

public class countVowels1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word="ASVBNNMNO";
		word=word.toLowerCase();
		int vowelscount=0;
		int length=word.length();

		for (int i = 0; i < length; i++) {
			if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)==i||word.charAt(i)=='o'||word.charAt(i)=='u')
			{
				vowelscount++;
				
			}
			
		}

		System.out.println("No.of vowels:" +vowelscount);

	}

}
