package prog1;

public class lengthOfAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String givenString = "GayathriRamachandran";
		System.out.println(givenString.length());
		
		
		char[] charArray= givenString.toCharArray();
		int size=charArray.length;
		int length = 0;
		for (char c : charArray) {
			length++;	
		}
		System.out.println(length);
		System.out.println(size);
	}

}
