package javaPractice3;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x="laserlikefocus";
		char y[]=x.toCharArray();
		int size=y.length;

		Map<Character, Integer> map1= new LinkedHashMap<>();
		int i=0;
		while (i!=size) {
			if (!map1.containsKey(y[i])) {
				map1.put(y[i], 1);
			}
			else {
				int oldVal=	map1.get(y[i]);
				int newVal=oldVal+1;
				map1.put(y[i], newVal);
			}
			i++;
		}
		System.out.println("values stored in map are:" +map1);
		//findDuplicates(map1);
		//removeDuplicates(map1);
		//maxOccurence(map1);
		//firstNonRepChar(map1);
		
		//map2();

		//Set<Map.Entry<Character, Integer>> hmap= map1.entrySet();
	}




	public static void findDuplicates(Map<Character, Integer> map1) {
		System.out.println("duplicates are: ");
		Set<Map.Entry<Character, Integer>> hmap= map1.entrySet();
		for (Entry<Character, Integer> entry : hmap) {
			if (entry.getValue()>1) {
				System.out.print(entry.getKey()+" ");

			}
		}
		System.out.println();
	}

	public static void removeDuplicates(Map<Character, Integer> map1) {
		System.out.println("after removing duplicates: ");
		Set<Map.Entry<Character, Integer>> hmap= map1.entrySet();
		for (Entry<Character, Integer> entry : hmap) {
			System.out.print(entry.getKey()+" ");


		}
		System.out.println();
	}

	public static void maxOccurence(Map<Character, Integer> map1) {
		System.out.println("max occured: ");
		Set<Map.Entry<Character, Integer>> hmap= map1.entrySet();
		int maxVal=0;
		char maxKey=' ';
		for (Entry<Character, Integer> entry : hmap) {

			if (entry.getValue()>maxVal) {
				maxVal=entry.getValue();
				maxKey=entry.getKey();
			}


		}
		System.out.print(maxVal +" "+  maxKey);




	}

	public static void firstNonRepChar(Map<Character, Integer> map1) {
		System.out.println("first non repeating character is: ");
		Set<Map.Entry<Character, Integer>> hmap= map1.entrySet();
		for (Entry<Character, Integer> entry : hmap) {
			if (entry.getValue()==1) {
				System.out.print(entry.getKey()+" ");
				System.exit(0);

			}
		}

	}


	public static void map2() {
		String x="amuthan";
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
}


