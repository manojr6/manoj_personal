package javaPractice2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class removeDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		remDupl();

	}

	public static void remDupl() {
		String x="sillyspiders";
		char y[]=x.toCharArray();
		//char y[]={'a','e','i','o','a','u','u','e','o'};
		
		int size=y.length;

		Map<Character, Integer> m1=new LinkedHashMap<>();
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
		Set<Map.Entry<Character, Integer>> lmap=m1.entrySet();
		String res="";
		for (Map.Entry<Character, Integer> entry : lmap) {

			res= res+entry.getKey();

		}
		System.out.println(res);

	}
}
