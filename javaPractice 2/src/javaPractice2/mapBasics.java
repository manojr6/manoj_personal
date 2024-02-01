package javaPractice2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class mapBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		map1();
		//map2();
		//map3();
		//mapStringCompression();
		//mapStringCompressionBuffer();
	}

	public static void map1() {
		String x="thalaivan";
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
		System.out.println(m1);
	}
	public static void map2() {
		String x= "marudhamalai mamaniye murugayya";
		char y[]=x.toCharArray();
		int size=y.length;

		Map<Character, Integer> m2= new HashMap<Character, Integer>();
		int i=0;
		while (i!=size) {
			if (!m2.containsKey(y[i])) {
				m2.put(y[i], 1);
			} else {
				int oldval=m2.get(y[i]);
				int newval=oldval+1;

				m2.put(y[i], newval);

			}
			i++;
		}
		System.out.println(m2);

	}

	public static void map3() {
		String x="loveyou";
		char y[]=x.toCharArray();
		int size=y.length;

		Map<Character, Integer> m3=new HashMap<>();
		int i=0;
		while (i!=size) {
			if (!m3.containsKey(y[i])) 
			{
				m3.put(y[i], 1);
			} else {
				int oldVal=m3.get(y[i]);
				int newVal=oldVal+1;
				m3.put(y[i], newVal);
			}
			i++;
		}
		System.out.println(m3);
		Set<Map.Entry<Character, Integer>> hmap= m3.entrySet();
		System.out.println(hmap);

	}
	
	public static void mapStringCompression() {
		String x="aaaaabbbbaaaccc";
		char y[]=x.toCharArray();
		int size=y.length;

		Map<Character, Integer> m4=new LinkedHashMap<>();
		int i=0;
		while (i!=size) {
			if (!m4.containsKey(y[i])) 
			{
				m4.put(y[i], 1);
			} else {
				int oldVal=m4.get(y[i]);
				int newVal=oldVal+1;
				m4.put(y[i], newVal);
			}
			i++;
		}
		StringBuilder sb=new StringBuilder();
		for (Map.Entry<Character, Integer> entry : m4.entrySet()) {
		sb.append(entry.getKey());
		sb.append(entry.getValue());
		
	
			
		}
		
		System.out.println(sb);
		

	}



	public static void mapStringCompressionBuffer() {
		String x="aaaaabbbbaaaccc";
		char y[]=x.toCharArray();
		int size=y.length;

		Map<Character, Integer> m4=new LinkedHashMap<>();
		int i=0;
		while (i!=size) {
			if (!m4.containsKey(y[i])) 
			{
				m4.put(y[i], 1);
			} else {
				int oldVal=m4.get(y[i]);
				int newVal=oldVal+1;
				m4.put(y[i], newVal);
			}
			i++;
		}
	
		
		StringBuffer sb1=new StringBuffer();
		for (Map.Entry<Character, Integer> entry1 : m4.entrySet()) {
		sb1.append(entry1.getKey());
		sb1.append(entry1.getValue());
		
			
		}
		
		
		System.out.println(sb1);

	}


}


