package javaPractice;

public class swapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swapTwoNumbers swap1=new swapTwoNumbers();
		swap1.withoutThirdVariable();

	}

	public void withThirdVariable() {
		
		int mySal=100000;
		int bossSal=100001;
		int temp;
		
		temp=mySal;
		mySal=bossSal;
		bossSal=temp;
		
		System.out.println(mySal);
		System.out.println(bossSal);
	}
	
	public void withoutThirdVariable() {
		
		int mySal=100000;
		int bossSal=11111;
		
		
	mySal=mySal-bossSal;
	bossSal=mySal+bossSal;
	mySal=bossSal-mySal;
	
		System.out.println(mySal);
		System.out.println(bossSal);
	}
}
