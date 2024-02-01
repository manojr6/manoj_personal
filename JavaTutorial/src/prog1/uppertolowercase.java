package prog1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class uppertolowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		uppertolowercase caseconv=new uppertolowercase();
		caseconv.uptolowAll();
	}


	public void uptolowAll() {


		{
			String name="MANOJ";
			char[] charname=name.toCharArray();
			int size=charname.length;

			int i=0;
			while (i!=size) {
				charname[i]=(char)(charname[i]+32);
				i++;
			}

			System.out.println(charname);

		}
	}


	public void lowtoupFirstusingFor() {


		String name="manoj ramachandran k";
		char[] charname=name.toCharArray();

		//int j=1;
		int size=charname.length;

		charname[0]=(char)(charname[0]-32); 
		System.out.println(charname);


		for (int j = 1; j < size; j++)
		{
			if (charname[j]==' ')
			{

				charname[j+1]=(char)(charname[j+1]-32);
			}
		}
		System.out.println(charname);


	}
	
	//using while loop --- not working
	public void lowtoupFirstusingWhile() {


		String name="manoj ramachandran k";
		char[] charname=name.toCharArray();

		int j=1;
		int size=charname.length;

		charname[0]=(char)(charname[0]-32); 
		System.out.println(charname);


		while(j!=size)
		{
			if (charname[j]==' ')
			{

				charname[j+1]=(char)(charname[j+1]-32);
				j++;
			}
		}
		for ( j = 0; j < charname.length; j++) {
			
		
		System.out.println(charname);

		}
	}
}



/*
 * alphabets=alphabets.replace("", " "); String[]
 * alphabetsArray=alphabets.split("");
 * 
 * HashSet<String> set1= new HashSet<String>(Arrays.asList(alphabetsArray));
 * System.out.println(set1);
 */



