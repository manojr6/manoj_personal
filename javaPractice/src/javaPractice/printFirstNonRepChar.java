package javaPractice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class printFirstNonRepChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x="anagond";
		char y[]=x.toCharArray();
		int size=y.length;

		Map<Character, Integer> m2= new LinkedHashMap<>();
		int i=0;
		while (i!=size) {
			if (!m2.containsKey(y[i]))
			{
				m2.put(y[i], 1)	;
			} else 
			{
				int oldVal=m2.get(y[i]);
				int newVal=oldVal+1;
				m2.put(y[i], newVal);
			}


			i++;
		}
		//System.out.println(m2);


		Set<Map.Entry<Character, Integer>> lmap= m2.entrySet();
		for (Map.Entry<Character, Integer> entry : lmap) {
			if (entry.getValue()==1) {
				System.out.println(entry);
				System.exit(i);
			}
		}

	}
}



