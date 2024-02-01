package javaPractice2;

public class countCharofAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countCharofAlphabets();

	}

	public static void countCharofAlphabets() {
		String a="manoj's focus";
		int vowelsCount=0;
		int consonantsCount=0;
		int splCharCount=0;
		//a=a.toUpperCase();
		a=a.replaceAll(" ","");
		System.out.println(a);
		char c[]=a.toCharArray();
		int i=0;
		for (char d : c) {
			if ((c[i]>='A'&&c[i]<='Z')||(c[i]>='a'&&c[i]<='z')) {
				if (c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U'||c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u') 
				{
					vowelsCount++;

				} else {
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
