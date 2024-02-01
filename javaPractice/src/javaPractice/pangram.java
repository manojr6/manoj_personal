package javaPractice;

public class pangram {

	public static void main(String[] args) {
		pangram pangram=new pangram();
		pangram.pangram2();

	}

	public void pangram1() 
	{
		// TODO Auto-generated method stub
		String x="abcdefghijklmnopqrstuvxyzw";
		x=x.toUpperCase();
		char y[]=x.toCharArray();

		int size=y.length;

		int a[]= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

		int i=0;
		while (i!=size) {
			int index=y[i]-65;
			a[index]=1;
			i++;
		}

		i=0;
		while (i!=26) {
			if (a[i] == 1) {
				i++;
			} 		

			else 
			{
				System.out.println("not pangram");
				System.exit(0);
			}
		}
		System.out.println("pangram");

	}

	public void pangram2() {
		String x="abcdefghijklmnopqrstuvwxyz";
		x=x.toUpperCase();
		char y[]=x.toCharArray();
		int size=y.length;

		int z[]= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};

		int i=0;
		while (i!=size) {
			int index=y[i]-65;
			z[index]=1;
			i++;

		}

		i=0;
		while (i!=26) {
			if (z[i]==1) {
				i++;
			} else {
				System.out.println("not pangram");
				System.exit(i);
			}
			
		}
		System.out.println("pangram");	
	}

}


