package javaPractice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class printNonRepeatedChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x="suriyaservicecentre";
		char y[]=x.toCharArray();
		int size=y.length;
		
		Map<Character,Integer> m1= new LinkedHashMap<>();
		int i=0;
		while (i!=size) {
			if (!m1.containsKey(y[i])) {
				m1.put(y[i], 1);
			} else {
				int oldVal= m1.get(y[i]);
				int newVal=oldVal+1;
				m1.put(y[i],newVal);

			}
			i++;
		}

		
		Set<Map.Entry<Character, Integer>> lhmap= m1.entrySet();
		for (Entry<Character, Integer> entry : lhmap) {
		if (entry.getValue()==1)
		{
		System.out.println(entry.getKey());	
				
		}	
		}
		
			
		
	}

}
