package javaPractice2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class findMaxOccChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       findMax();
	}
	
	public static void findMax() {
		String x="bozzfrogyyyy";
		char y[]=x.toCharArray();
		int size=y.length;

		Map<Character, Integer> m1=new HashMap<>();
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
		
		//Set<Map.Entry<Character, Integer>> hmap=m1.entrySet();
		int maxValue=0;
		char maxKey=' ';
		for (Map.Entry<Character, Integer> entry : m1.entrySet()) {
			if (entry.getValue()>maxValue) {
				maxValue=entry.getValue();
				maxKey=entry.getKey();
				
				
			}
			
		}
		System.out.println(maxValue);
		System.out.println(maxKey);
	
		
			
		}
	}



