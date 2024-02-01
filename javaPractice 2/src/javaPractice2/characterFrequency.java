package javaPractice2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class characterFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkFrequency();
	}

	public static void checkFrequency() {
		String x="    How Good GOD Is.   ";
		x=x.trim();
		char y[]=x.toCharArray();
		int size=y.length;

		Map<Character, Integer> m1= new HashMap<>();
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
		
		int wordcount=1;
		
		for (int j=0;j<y.length;j++) {
			if (y[j]==' ') {
				wordcount++;
			}
		}
	
	
	Set<Map.Entry<Character, Integer>> hmap= m1.entrySet();
	int vowelsCount=0;
	int upperCaseCount=0;
	int upperFreq=0;
	int vowelFreq=0;
	for (Entry<Character, Integer> entry : hmap) {
		
	
		if (entry.getKey()=='a'||entry.getKey()=='e'||entry.getKey()=='i'||entry.getKey()=='o'||entry.getKey()=='u'||entry.getKey()=='A'||entry.getKey()=='E'||entry.getKey()=='O'||entry.getKey()=='U'||entry.getKey()=='I')
			{
		vowelsCount++;
		vowelFreq=vowelFreq+entry.getValue();
		}
		
			if(entry.getKey()>='A'&&entry.getKey()<='Z') {
			
			upperCaseCount++;
			upperFreq=upperFreq+ entry.getValue();
		}
		
	
	}
	System.out.println("vowels count are:" + vowelsCount);
	System.out.println("upper count are:" + upperCaseCount);
	System.out.println("words count are:" + wordcount);
	System.out.println("upper freq count are:" + upperFreq);
	System.out.println("vowel freq count are:" + vowelFreq);
	}
}
