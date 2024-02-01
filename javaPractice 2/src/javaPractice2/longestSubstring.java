 package javaPractice2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class longestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//findSubString();
		findLongestSubString();
	}

	public static void findSubString() {
		String x="javaconceptoftheday";
		//char y[]=x.toCharArray();


		
		for (int i = 0; i < x.length(); i++) {
			for (int j = i+1; j < x.length(); j++) {
				System.out.println(x.substring(i,j));
				
			}
		}
	}
	
	
	public static void findLongestSubString() {
		String x="javaconceptoftheday";
		char y[]=x.toCharArray();
		
		String longestSubString=null;
		int longSubStringLength=0;
		LinkedHashMap<Character, Integer> map1=new LinkedHashMap<>();
		for (int i = 0; i < y.length; i++) {
			char ch=y[i];
			if (!map1.containsKey(ch)) {
				map1.put(ch, i);
				
			} else 
			{
				i=map1.get(ch);
				map1.clear();

			}
			if (map1.size()>longSubStringLength) {
				longSubStringLength=map1.size();
				longestSubString=map1.keySet().toString();
				
			}
			
		}
		System.out.println(longestSubString);
		System.out.println(longSubStringLength);
	}
}


