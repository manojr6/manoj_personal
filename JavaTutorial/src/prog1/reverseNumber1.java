package prog1;

public class reverseNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int givennumber=987654532;
		int reversednumber=0;
		
		while (givennumber!=0) {
			reversednumber=reversednumber*10;
			reversednumber=reversednumber+givennumber%10;
			givennumber=givennumber/10;
			
			
			
		}
		System.out.println(reversednumber);

	}

}
