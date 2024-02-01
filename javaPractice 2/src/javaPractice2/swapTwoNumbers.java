package javaPractice2;

public class swapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//swapTwoNumbersUsingTempVar();
		swapTwoNumbersWithoutTemp();
	}

	public static void swapTwoNumbersUsingTempVar() {
		int firstNumber=100;
		int secondNumber=202;
		int temp;

		temp=firstNumber;
		firstNumber=secondNumber;
		secondNumber=temp;

		System.out.println(firstNumber);
		System.out.println(secondNumber);
	}

	public static void swapTwoNumbersWithoutTemp() {
		int firstNumber=1011;
		int secondNumber=2022;

		firstNumber=firstNumber-secondNumber;
		secondNumber=firstNumber+secondNumber;
		firstNumber=secondNumber-firstNumber;

		System.out.println(firstNumber);
		System.out.println(secondNumber);
	}

}
