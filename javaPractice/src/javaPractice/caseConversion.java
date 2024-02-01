package javaPractice;

public class caseConversion {

	public static void main(String[] args) {
		caseConversion conv= new caseConversion();
		conv.lowerToUpper();
		conv.upperToLower();
		conv.withBlankSpaces();
		conv.convertFirstLetter();
	}

	public void lowerToUpper() {


		// TODO Auto-generated method stub
		String x="rasakili";
		char y[]=x.toCharArray();
		int size=y.length;

		int i=0;
		while (i!=size) {
			y[i]=(char) (y[i]-32);
			i++;
		}
		System.out.println(y);
	}

	public void upperToLower() {


		// TODO Auto-generated method stub
		String x="MUTHAZHAGU";
		char y[]=x.toCharArray();
		int size=y.length;

		int i=0;
		while (i!=size) {
			y[i]=(char) (y[i]+32);
			i++;
		}
		System.out.println(y);
	}

	public void withBlankSpaces() {


		// TODO Auto-generated method stub
		String x="all in all azhagu raja";
		char y[]=x.toCharArray();
		int size=y.length;

		int i=0;
		while (i!=size) {
			y[i]=(char) (y[i]-32);
			i++;
		}
		System.out.println(y);
	}

	public void convertFirstLetter() {


		// TODO Auto-generated method stub
		String x="all in all azhagu raja";
		char y[]=x.toCharArray();
		int size=y.length;
		y[0]=(char) (y[0]-32);
		int i=1;
		while (i!=size) {
			if (y[i]==' ')
			{	

				y[i+1]=(char) (y[i+1]-32);

			}
			i++;


		}
		System.out.println(y);


	}

}
