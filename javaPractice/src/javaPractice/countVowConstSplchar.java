package javaPractice;

public class countVowConstSplchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countVowConstSplchar test1= new countVowConstSplchar();
		test1.usingWhile();

	}
	public void usingForEach() {
		
		int vowelsCount=0;
		int consonantsCount=0;
		int splCharCount=0;
		String x="manoj's alien";
		x=x.toUpperCase();
		System.out.println(x);
		char y[]= x.toCharArray();
		//int size= y.length;
		int i=0;
		for (char c : y) {
			if (y[i]>='A'&&y[i]<='Z')
			{
				if (y[i]=='A'||y[i]=='E'||y[i]=='I'||y[i]=='O'||y[i]=='U')
				{
					vowelsCount++;
				} 
				else
				{
					consonantsCount++;

				}
				
				
			} else {
				splCharCount++;

			}
		i++;
		}
	
		System.out.println(vowelsCount);
		System.out.println(consonantsCount);
		System.out.println(splCharCount);

	}

	
public void usingWhile() {
		
		int vowelsCount=0;
		int consonantsCount=0;
		int splCharCount=0;
		String x="manoj's alien";
		x=x.toUpperCase();
		System.out.println(x);
		char y[]= x.toCharArray();
		int size= y.length;
		int i=0;
		while (i!=size) 
		{
			if (y[i]>='A'&&y[i]<='Z')
			{
				if (y[i]=='A'||y[i]=='E'||y[i]=='I'||y[i]=='O'||y[i]=='U')
				{
					vowelsCount++;
				} 
				else
				{
					consonantsCount++;

				}
				
				
			} else {
				splCharCount++;

			}
		i++;
		}
	
		System.out.println(vowelsCount);
		System.out.println(consonantsCount);
		System.out.println(splCharCount);

	}

}
