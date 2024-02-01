package prog1;

public class RemoveLeadingAndTrailingSpaces {

	public static void main(String[] args) {
		String input="   Roja roja    ";
		System.out.println(input);
		//USING TRIM
		System.out.println(input.trim());
//USING REGULAR EXPRESSIONS
		System.out.println(input.replaceAll("^[ \t]+|[ \t]+$",""));
		System.out.println(input.replaceAll("^[ \t]",""));
		System.out.println(input.replaceAll("[ \t]+$",""));
	}

}
