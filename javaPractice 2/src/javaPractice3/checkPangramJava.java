package javaPractice3;

public class checkPangramJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
checkPangram();
	}
	
	public static void checkPangram() {
		String a="The quick brown fox jumpk over the lazy dog";
		a=a.replaceAll(" ", "");
		a=a.toUpperCase();
		
char b[]=a.toCharArray();
int size=b.length;

int x[]= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

int i=0;
while (i!=size) {
	int index=x[i]-65;
	x[index]=1;
	i++;
}

for (int j = 0; j <26; j++) {
	if (x[j]!=1) {
		System.out.println("not pangram");
		System.exit(j);
	} else {

	}
	
	System.out.println("pangram");
	
}

	}

}
