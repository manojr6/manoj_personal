package prog1;

public class extractnumbersandadd1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word="manoj12345678";
		int total=0;
		
		for (int i = 0; i < word.length(); i++) {
			char character=word.charAt(i);
			if (Character.isDigit(character))
			{
				total=total+Character.getNumericValue(character);
			}
			
		}
System.out.println(total);
	}

}
