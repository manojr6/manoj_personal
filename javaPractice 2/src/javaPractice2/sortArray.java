package javaPractice2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class sortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sortArray1();
		sortArrayZeroEnd();
	}


	public static void sortArray1() {

		{
			// TODO Auto-generated constructor stub
			int ch[]= {1,-1, 3,0,0,0,0, 2,  -7,  -5, 11, 6};

			Arrays.sort(ch);

			for (int c : ch) {
				System.out.print(c);
			}

		}

	}

	public static void sortArrayZeroEnd() {
		////INCOMPLETE

		{
			// TODO Auto-generated constructor stub
			int ch[]= {1,-1, 3,0,0,0,0, 2,  -7,  -5, 11, 6};

 Arrays.sort(ch);
int n=ch.length;
int count =0;

for (int i = 0; i < ch.length; i++) {
	if (ch[i]!=0) {
		ch[count]=ch[i];
		count++;
	}
}

while (count<n) {
	ch[count]=0;
	count++;

	
	
}

for (int i = 0; i < ch.length; i++) {
	System.out.print(ch[i]+" ");
}

		}

	}
}
