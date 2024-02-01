package prog1;

import java.util.Arrays;
import java.util.HashSet;

public class findMissingAlphabetsinString1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String given="vcxs";
		given=given.toLowerCase();
		given=given.replace("", " ");
		String[] userarray=given.split("");
		System.out.println(given);
		
		String alphabets="abcdefghijklmnopqrstuvwxyz";
		alphabets=alphabets.replace("", " ");
		String[] alphabetsArray=alphabets.split("");
		System.out.println(alphabets);
		
		HashSet<String> set1= new HashSet<String>(Arrays.asList(userarray));
		HashSet<String> set2= new HashSet<String>(Arrays.asList(alphabetsArray));
		
		set2.removeAll(set1);
		
		System.out.println(set2);
		
		
	}

}
