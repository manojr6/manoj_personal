package javaPractice2;

public class findDuplicatesusingLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findDuplicate();

	}

	
	public static void findDuplicate() {
		String x="manojram";
		char[] y=x.toCharArray();
		int size=y.length;
		
		for (int i = 0; i < y.length; i++) {
			for (int j = i+1; j < y.length; j++) {
				if (y[i]==y[j]) {
					System.out.println(y[j]);
					break;
				}
			}
		}
		
	}
}
