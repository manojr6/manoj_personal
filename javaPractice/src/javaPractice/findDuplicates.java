package javaPractice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class findDuplicates {

	public static void main(String[] args) {
		
			// TODO Auto-generated method stub

			String x="mmanoj";

			char y[]=x.toCharArray();

			int size=y.length;

			Map<Character,Integer> map = new LinkedHashMap<>();
			int i=0;
			while (i!=size) {
				if (!map.containsKey(y[i]))
				{
					map.put(y[i], 1);
				} else {
					int oldVal= map.get(y[i]);
					int newVal=oldVal+1;
					map.put(y[i], newVal);
				}
				++i;
			}





			Set<Map.Entry<Character,Integer>> lhmap= map.entrySet();
			for (Entry<Character, Integer> data : lhmap) {
				if(data.getValue()==1)
				{
					System.out.println("0");
					

				}
				else {
					System.out.println(data.getKey());
					System.out.println(data.getValue());
					
				}
			}

		}

}
