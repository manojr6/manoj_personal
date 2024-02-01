package javaPractice;

public class findOccOfCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stubt s
		findOccOfCharInString find = new findOccOfCharInString();
		find.usingForEach();
		
	}
	
	public static void withIteration() {
		
	
String a="altasanasnsad";
char toFind='s';
int occurence=0;
int size=a.length();
int i=0;
while (i!=size) {
	if (a.charAt(i)==toFind) {
		occurence++;
	}
	i++;
}
System.out.println(occurence);

	}

	public void usingForEach() {
		String a="altasanasssnsad";
		char b[]=a.toCharArray();
		char toFind='s';
		int occurence=0;
	for (char c : b ) {
		if (c ==toFind) {
			occurence++;
		}
		
	}
	System.out.println(occurence);
	}


public static void withoutIteration() {
	String a= "salanasaravanas";
	char toFind='s';
	
	String b= Character.toString(toFind);
	
	int size=a.length();
	System.out.println(size);
	a=a.replace(b,"");
	
	int sizeAftReplace=a.length();
	System.out.println(sizeAftReplace);
	
	System.out.println(size-sizeAftReplace);
	
}
}
