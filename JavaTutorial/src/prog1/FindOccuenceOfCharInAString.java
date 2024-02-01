package prog1;

public class FindOccuenceOfCharInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//USING ITERATION
		String input="adingolavadep";
		char toFind='a';
		
	int	occurence=0;
	
	input=input.toLowerCase();
	
		for (int i=0;i<input.length();i++) {
			if (input.charAt(i)==toFind)
			{
			occurence=occurence+1;	
			}
		}
System.out.println(toFind + " is present " + occurence +" no.of times");
	}

}
		
	//NOT USING ITERATION
		
		String input="adingolavadep";
		char toFind='a';
		

	
	input=input.toLowerCase();
	
	
	String charToFind= Character.toString(toFind).toLowerCase();
	int actualLength=input.length();
	System.out.println(actualLength);
	input=input.replace(charToFind, "");
	
	int lengthAfterReplacing=input.length();
	System.out.println(lengthAfterReplacing);
	
	System.out.println(actualLength-lengthAfterReplacing);
	}
}
