package javaPractice3;

public class findDuplicateOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x="manojao";
		
		char y[]=x.toCharArray();
		
		int size=y.length;
		
		int occurence=0;
		
		for (int i = 0; i < y.length; i++) {
			for (int j = i+1; j < y.length; j++) {
				if (y[i]==y[j]) {
					occurence++;
					System.out.println(y[j]);
					
				}
			}
			
		}
		
		System.out.println(occurence);
	}

}
