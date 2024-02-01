package javaPractice3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class collectionsPractice {

	public static <T> void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr[]={"aeroplane","bala","pomo","coma","pomo"};
		//char[] y=x.toCharArray();
		
		System.out.println("Array: "+ Arrays.toString(arr)); 
		
		 Set<String> aset = new HashSet<>(Arrays.asList(arr));
		 
			System.out.println("set1: "+ aset);
			
			
			String x="suspense";
			char[] y=x.toCharArray();
			
			
			System.out.println("chArray: "+ Arrays.toString(y)); 
			
			;
			 Set<Character> bset = new LinkedHashSet<>(Arrays.asList('a','e','i','o','u','a','u','i'));
			 
				System.out.println("set2: "+ bset);
				
				List<String> alist=new ArrayList<>(Arrays.asList(arr));
				System.out.println("ListArrayA:" +alist);
				
				List<String> blist= new ArrayList<>();
				Collections.addAll(blist, arr);
				Collections.sort(blist,Collections.reverseOrder());
				System.out.println("ListArrayB:" +blist);
				
				
				
				List<Character> chList=new ArrayList<Character>();
				for (char c : y) {
					chList.add(c);
				}
				
				System.out.println("ListArrayC:" +chList);
				
				
				Set<Character> chSet=new LinkedHashSet<Character>();
				for (char c : y) {
					chSet.add(c);
				}
				
				
		
				System.out.println("charSet:" +chSet);
				
				 Set<String> dset = new LinkedHashSet<>(Arrays.asList("apple","mango","orange","apple"));

	System.out.println("strSet:" +dset);
	}

}
