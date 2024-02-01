package seleniumPractice;

public class duplicateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x="manojkumar";

		char y[]=x.toCharArray();

		int size=y.length;

		for(int i=0;i<size;i++)
		{
		for(int j=i+1;j<size;j++)
		{
		if(y[i]==y[j])
		{
		System.out.println(y[j]);
		}
		}
		}

	}

}
