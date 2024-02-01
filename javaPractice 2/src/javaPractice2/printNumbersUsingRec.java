package javaPractice2;

public class printNumbersUsingRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=1;
		printNumbers(number);
	}

	public static void printNumbers(int number) {
		if (number<=100) {
			System.out.println(number);
			printNumbers(number+1);
		}
	}

}
