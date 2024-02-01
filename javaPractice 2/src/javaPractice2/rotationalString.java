package javaPractice2;

public class rotationalString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rotationalOrNot();

	}
	
	public static void rotationalOrNot() {
		String origString="akasha";
		String keyString="shaaka";
		
		String newString=origString.concat(origString);
		
		if (newString.contains(keyString)) {
			System.out.println("rotational string");
		} else {
			System.out.println("not rotational string");
		}
	}

}
