package prog1;

public class reversewordsinasentence1 {
	public static void main (String[] args) 
	{
		String word="i love you";
		String reversedWord="";

		String[] temp=word.split(" ");

		System.out.println(temp.length);

		for (int i=temp.length-1;i >=0; i--) {
			reversedWord=reversedWord+temp[i]+" ";


		}
		System.out.println(reversedWord);

	}
}
