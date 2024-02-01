package javaPractice2;

import java.util.Scanner;

public class occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
findOccurence();
	}

	public static void findOccurence() {
		System.out.println("Enter input");
		Scanner scanner=new Scanner(System.in);
		String x= scanner.next();
		char y[]=x.toCharArray();
		System.out.println("tofind1");
		char toFind1= scanner.next().charAt(0);
		System.out.println("tofind2");
		char toFind2= scanner.next().charAt(0);
		System.out.println("tofind3");
		char toFind3= scanner.next().charAt(0);
		
		//int size=y.length;



		//int i=1;
		int occurenceA=0;
		int occurenceB=0;
		int occurenceC=0;
		for (char z : y) {
			if (z==toFind1) {
				occurenceA++;
			} else {
				if (z==toFind2) {
					occurenceB++;
				} else {
					if (z==toFind3) {
						occurenceC++;
					}

				}

			}
		}
	
		
		System.out.println(toFind1+""+occurenceA+""+toFind2+""+occurenceB+""+toFind3+""+occurenceC);
	}



}


