package javaPractice2;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseString();

	}
	
	public static void reverseString() {
		String givenString="legendsaravanastores";
		char a[]=givenString.toCharArray();
		int size=a.length;
		char b[]= new char[size];
		
		int i=0;
		for (char c : b) {
			b[i]=a[size-i-1];
			i++;
		}
		
		System.out.println(a);
		System.out.println(b);
	}
	

}
