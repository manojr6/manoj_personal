package javaPractice;

public class verifyIntString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x="123";
		x=x.toUpperCase();
		System.out.println(x);
		char y[]= x.toCharArray();
		int size= y.length;
		int i=0;
		while (i!=size) 
		{
			if (y[i]>='1'&&y[i]<='9')
			{
				i++;
			}
			else {
				System.out.println("not integer string");
				break;
			}
			System.out.println("integer string");
			break;
	}
	}
	}


