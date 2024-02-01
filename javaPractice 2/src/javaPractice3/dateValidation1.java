package javaPractice3;

public class dateValidation1 {
	
	static int MAX_YR=2200;
	static int MIN_YR=1800;
	
	 static boolean checkLeap(int year) 
	{
			return (((year % 4 == 0) && 
					(year % 100 != 0)) || 
					(year % 400 == 0)); 
			
		
	}
	 
	 static boolean  checkValid(int d,int m,int y) {
		 if (y>MAX_YR||y<MIN_YR) 
		return false;
		 
		 if(m>12||m<1)
			 return false;
		 
		 if (d<1||d>31) 
			 return false;
		 
		 if(m==2) {
			 if (checkLeap(y)) {
				return d<=29;
			}
			 else
			 {
				 return d<=28;
			 }
		 }
		 
		 if (m==4||m==6||m==9||m==11) 
			 return d<=30;
		 
		 return true;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (checkValid(29,02,2024)) {
			System.out.println("yes");
		}
		else 
			System.out.println("no");

	}

}
