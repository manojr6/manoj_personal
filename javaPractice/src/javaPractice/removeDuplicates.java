package javaPractice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class removeDuplicates  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x="sillyspiders";

		char y[]=x.toCharArray();

		int size=y.length;

	
		Map<Character,Integer> map = new LinkedHashMap<>(); 
		int i=0; 
		while (i!=size)
		{ 
			if 
			(!map.containsKey(y[i]))
			{ map.put(y[i], 1);
			}
			else
			{ 
				int oldVal=map.get(y[i]);
				int newVal=oldVal+1; 
				map.put(y[i], newVal);
			}
			i++;
		}
System.out.println(map);


		
		Set<Map.Entry<Character, Integer>> lhmap = map.entrySet();
		String res = " ";
		for (Map.Entry<Character, Integer> data : lhmap) {
			res = res + data.getKey();
		}
		System.out.println(res);

	}
}
