package javaPractice2;

public class verifyIntString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		verifyIntString();

	}
	
	public static void verifyIntString() {
		
		String a="1209977786345";
		char b[]=a.toCharArray();
		int size=b.length;
		int i=0;
		
		for (char c : b) {
			if (b[i]>='0'&&b[i]<='9')
			{
				i++;
			
			}
			else
			{
				System.out.println("not integer string");
				System.exit(i);
			}
			
		}
		System.out.println("integer string");
	}

}
