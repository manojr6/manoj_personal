package javaPractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class mapBasics3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x="gayathriramachandran";

		char y[]=x.toCharArray();

		int size=y.length;
		Map<Character, Integer> m1 = new HashMap<>();
		int i=0;
		while (i!=size) {
			if (!m1.containsKey(y[i])) {
				m1.put(y[i], 1);
			} else {
				int oldVal= m1.get(y[i]);
				int newVal= oldVal+1;
				m1.put(y[i], newVal);
			}
			i++;
		}
		System.out.println(m1);
	}

}
