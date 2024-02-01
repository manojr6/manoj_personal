package prog1;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word="Assumptioni";
		int vowelsCount=0;
		
		word=word.toLowerCase();
		int length = word.length();
		
		for (int i = 0; i < length; i++) {
			
			if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u')
					{
				vowelsCount++;
			}
			
		}
		
		System.out.println("Your word has "+vowelsCount+ " vowels");
				

	}

}
