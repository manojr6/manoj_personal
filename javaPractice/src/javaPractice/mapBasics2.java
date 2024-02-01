package javaPractice;

import java.util.LinkedHashMap;
import java.util.Map;

public class mapBasics2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String x="aurangazeb";
char y[]=x.toCharArray();
	int size= y.length;
	
	Map<Character, Integer> m1 = new LinkedHashMap<>();
	int i=0;
	while (i!=size) {
		
		if (!m1.containsKey(y[i]))
		{
			m1.put(y[i], 1);
		}
		else {
			int oldVal=m1.get(y[i]);
			int newVal=oldVal+1;
			m1.put(y[i], newVal);
			
		}
		i++;
	}
	System.out.println(m1);
	}

}
