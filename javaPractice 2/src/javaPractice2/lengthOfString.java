package javaPractice2;

public class lengthOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		defaultMethod();
		//usingForEach();
		//usingWhile();


	}


	public static void defaultMethod() {
		String s = "sophia is a girl";
		s=s.replaceAll(" ","");
		System.out.println(s);
		int size=s.length();
		System.out.println(size);
	}

	public static void usingForEach() {
		String s = "sophiaz";
		char c[]=s.toCharArray();
		int occurence=0;
		for (char d : c) {
			occurence++;
		}
		System.out.println(occurence);
	}

	public static void usingWhile() {
		String s = "sophiazy";
		s=s.concat("\0");
		System.out.println(s);
		char c[]=s.toCharArray();
		int occurence=0;
		int i=0;
		while (c[i]!='\0') {
			occurence++;
			i++;
		}

		System.out.println(occurence);
	}
}
