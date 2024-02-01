package javaPractice;

public class rotationStringorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String origString="saravana";
		String keyString="varaxnas";

		String newString = origString.concat(origString);

		if (newString.contains(keyString)) {
			System.out.println("rotational string");
		} else {
			System.out.println("non rotational string");
		}

	}

}
