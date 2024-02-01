package javaPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class findMaxOccCharinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x="maaannnoj";
		char y[]=x.toCharArray();
		int size=y.length;
		Map<Character, Integer> m3= new HashMap<>();

		int i=0;
		while (i!=size) {
			if (!m3.containsKey(y[i])) {
				m3.put(y[i], 1);
			} else {
				int oldVal=m3.get(y[i]);
				int newVal=oldVal+1;
				m3.put(y[i], newVal);
			}
i++;
		}
Set<Map.Entry<Character, Integer>> hmap= m3.entrySet();
char maxKey=' ';
int maxVal=0;
for (Map.Entry<Character, Integer> entry : hmap) {
	if (entry.getValue() > maxVal ) {
		maxVal=entry.getValue();
		maxKey=entry.getKey();
	}
}
System.out.println(maxVal);
System.out.println(maxKey);
	}

}
