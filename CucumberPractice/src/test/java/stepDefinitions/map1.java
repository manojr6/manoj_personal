package stepDefinitions;

import java.util.LinkedHashMap;
import java.util.Map;

public class map1 {

	public static void main(String[]args) {
		String x="manoj capgemini";
		char y[]=x.toCharArray();
		int size=y.length;

		Map<Character,Integer> map1=new LinkedHashMap<Character,Integer>();
		int i=0;

		while(size!=0)
		{
		if(!map1.containsKey(y[i]))
		{
		map1.put(y[i],1);
		}
		else
		{
		int oldVal=map1.get(y[i]);
		int newVal=oldVal+1;
		map1.put(y[i],newVal);
		}
		}
		i++;

		
	
	System.out.println(map1);

	}
}
	


