package javaPractice2;

public class deleteAllOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="sillyspiders";
		char remove='s';

		char b[]=a.toCharArray();

		int i=0;
		String res="";
		int size=b.length;
		while(i!=size) {
			if (b[i]!=remove) {
				res=res+b[i];

			}
			i++;
		}
		System.out.println(res);	
	}

}
