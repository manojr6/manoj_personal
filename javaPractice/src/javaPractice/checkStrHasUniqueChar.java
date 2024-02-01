package javaPractice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class checkStrHasUniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x="aassdff";
		char y[]=x.toCharArray();
		int size=y.length;

		Map<Character, Integer> m1 = new LinkedHashMap<>();
		int i=0;
		while (i!=size) {
			if (!m1.containsKey(y[i])) {
				m1.put(y[i], 1);
			} else {
				int oldval=m1.get(y[i]);
				int newval=oldval+1;
				m1.put(y[i], newval);

			}
			i++;			
		}
		//System.out.println(m1);



		Set <Map.Entry<Character,Integer>> lhmap= m1.entrySet();

		//int j=0;
		for (Entry<Character, Integer> entry : lhmap) {
			if (entry.getValue()>1) 
			{
				System.out.println("not all characters in string are unique");
				System.exit(0);
			} 
		}
		System.out.println("string has all unique characters");

	}




}



