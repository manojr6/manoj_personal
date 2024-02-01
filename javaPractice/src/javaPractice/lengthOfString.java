package javaPractice;

public class lengthOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lengthOfString test1= new lengthOfString();
		test1.usingConcat();
		test1.usingLength();
		test1.usingForEach();

	}
	public  void usingConcat()
	{
	String given="manoj";
	given= given.concat("\0");
	System.out.println(given);
	char y[]= given.toCharArray();
	
	int i=0;
	int count=0; 
	while (y[i]!='\0') {
		count++;
		i++;
	
		
	}
	System.out.println(count);
	}
	
	public void usingLength() {
		String x="manojram";
	int length= x.length();
	System.out.println(length);
		
	}
	public  void usingForEach()
	{
	String given="manojramc";
	
	
	char y[]= given.toCharArray();


	int count=0; 
	for (char c : y) {
		count++;
	}
	System.out.println(count);
}
}