package javaPractice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class mapBasics {

	public  static void main(String[] args) 
	{
		mapBasics mapBasiccc=new mapBasics();
		//mapBasiccc.mb1();
		//mapBasiccc.mb2();
		mapBasiccc.mb4();
	}


	public void  mb1() {
		// TODO Auto-generated method stub
		String x="manoj";

		char y[]=x.toCharArray();

		int size=y.length;

		Map<Character,Integer> map = new LinkedHashMap<>();
		int i=0;
		while (i!=size) {
			if (!map.containsKey(y[i]))
			{
				map.put(y[i], 1);
			} else {
				int oldVal= map.get(y[i]);
				int newVal=oldVal+1;
				map.put(y[i], newVal);
			}
			++i;
		}

		System.out.println(map);



	}

	public void mb2() {
		String x= "practice makes man perfect";
		x=x.replace(" ", "");
		char y[]=x.toCharArray();

		int size = y.length;

		Map<Character, Integer> map1 = new TreeMap<>();
		int i=0;
		while (i!=size) {
			if (!map1.containsKey(y[i])) {
				map1.put(y[i], 1);
			} else {
				int oldVal=map1.get(y[i]);
				int newVal= oldVal+1;
				map1.put(y[i], newVal);
			}
			i++;
		}
		System.out.println(map1);
	}

	public void mb3() {
		String x="mindfulness";
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
		System.out.println(m3);
	}
	
	public void mb4() {
		
		String a="lairaleral";
				char b[]=a.toCharArray();
		int size= b.length;
		
		Map<Character, Integer> map= new HashMap<>();
		int i=0;
		while (i!=size) {
			if (!map.containsKey(b[i])) {
				map.put(b[i], 1);
				
			} else {
				int oldVal=map.get(b[i]);
				int newVal=oldVal+1;
				map.put(b[i], newVal);

			}
	i++;
	}
		
	System.out.println(map);	
	}

}
