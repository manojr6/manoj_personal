package javaPractice2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class printFirstNonRepChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printNonRepeatChar();
	}
	
	public static void printNonRepeatChar() {
		String x="AABBCCDDEEZFFGGHHIJKLMNO";
		char y[]=x.toCharArray();
		int size=y.length;

		Map<Character, Integer> m1=new LinkedHashMap<Character, Integer>();
		int i=0;
		while (i!=size) {
			if (!m1.containsKey(y[i])) {
				m1.put(y[i], 1);
			} else {
				int oldVal=m1.get(y[i]);
				int newVal=oldVal+1;

				m1.put(y[i], newVal);
			}
			i++;
		}
		
		Set<Map.Entry<Character, Integer>> hmap= m1.entrySet();
		for (Map.Entry<Character, Integer> entry : hmap) {
			if (entry.getValue()==1 ) 
			{
			System.out.println(entry);
			System.exit(i);
			}
			
		}
		
		
	}

}
