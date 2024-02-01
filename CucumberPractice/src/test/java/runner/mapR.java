package runner;

import java.util.HashMap;
import java.util.Map;

public class mapR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x="manoj rama chandran";

		char y[]=x.toCharArray();

		int size=y.length;

		Map<Character,Integer> map1=new HashMap<Character, Integer>();
		int i=0;
		while(i!=size)
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
		
		i++;
		}
		
		

		System.out.println(map1);


	

}
	}
