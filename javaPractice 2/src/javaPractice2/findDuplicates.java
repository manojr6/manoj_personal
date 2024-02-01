package javaPractice2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class findDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findDupl();
		//findDupl2();

	}
	
	public static void findDupl() {
		String x="sillyspiders";
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
		
		Set<Map.Entry<Character, Integer>> lmap= m1.entrySet();
		for (Map.Entry<Character, Integer> entry : m1.entrySet())
		{
			if (entry.getValue()!=1) {
				System.out.println(entry);
			}
			
		}
	}
	
	public static void findDupl2() {
		String x="sillyspiders";
		char y[]=x.toCharArray();
		int size=y.length;

		Map<Character, Integer> m1=new LinkedHashMap<>();
		int i=0;
		while (i!=size) {
			if (!m1.containsKey(y[i])) {
				m1.put(y[i], 1);
			} else {
			
			System.out.println(y[i]);
			}
			
			i++;

		}
		

}
}
