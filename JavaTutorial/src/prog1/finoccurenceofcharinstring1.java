package prog1;

public class finoccurenceofcharinstring1 {

	
		// TODO Auto-generated method stub
//using iteration
		public void usingIteration() {
			
		
		String word="asdasdadfdddd";
		char tofind='d';
		int occurence=0;
		
		word=word.toLowerCase();
for (int i = 0; i < word.length(); i++) {
	if (word.charAt(i)==tofind)
	{
	occurence++;	
	}
}
System.out.println(occurence);
	}



public void withoutusingIteration() {
	String input="asssssddfcsss";
	char tofind1='s';
	
	input.toLowerCase();
	int actuallength=input.length();
	System.out.println(actuallength);
	
	
	String tofind2= Character.toString(tofind1).toLowerCase();
	input=input.replaceAll(tofind2, "");
	int lengthafterreplacing=input.length();
	System.out.println(lengthafterreplacing);
	
	System.out.println( actuallength-lengthafterreplacing);
}

public static void main(String[] args) {
	finoccurenceofcharinstring1 findmissing = new finoccurenceofcharinstring1();
	findmissing.withoutusingIteration();
}
}
