package prog1;

public class lengthOfaString1 {
	
	

	public static void main(String[] args) {
		String givenstring="podadub";
		
		//METHOD1
		int length= givenstring.length();
		
		System.out.println(length);

		//METHOD2
		char[] chara=givenstring.toCharArray();
		int lengthA=0;
		
		for (char c : chara) {
			 lengthA++;
			
		}
		System.out.println(lengthA);
	}
}
