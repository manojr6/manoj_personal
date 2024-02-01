package javaPractice;

public class deleteAllOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x="sillyspiders";
		char y[]=x.toCharArray();
		int size=y.length;
		char key='s';
		
		String res="";
		int i=0;
		while (i!=size) {
			if (y[i]!=key) {				
			res= res+ y[i] ;
		
		}
			i++;	
	}
		
System.out.println(res);
}
}