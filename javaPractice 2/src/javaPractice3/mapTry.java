package javaPractice3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class mapTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mapTry1();
	}


	public static void mapTry1() {
		String x="twitter";
		char y[]=x.toCharArray();

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

		for (Map.Entry<Character, Integer> entry : m1.entrySet()) {
			System.out.println(entry.getKey());
		}
		
	}
}
