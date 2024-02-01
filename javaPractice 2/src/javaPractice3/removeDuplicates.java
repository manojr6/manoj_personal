package javaPractice3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class removeDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="nnaammeename";

		char ch[]=str.toCharArray();

		int size=ch.length;

	
		

			Map<Character, Integer> map=new LinkedHashMap<>();
			int i=0;
			while (i!=size) {
			
			if (!map.containsKey(ch[i])) {
				map.put(ch[i], 1);
			} else {
				int oldVal=map.get(ch[i]);
				int newVal=oldVal+1;
				map.put(ch[i], newVal);
			}
			i++;
		}
		
		
			String result="";
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			
			result=result+entry.getKey();
			
		}
		
		System.out.println(result);
			
		}
		
	
		
		
	}
	


