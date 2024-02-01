package javaPractice2;

public class removeFirstAndLast {
	
	public static String removeFandL(String string) {
		
		string=string.substring(1,string.length()-1);
		return string;
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string="manojramachandran";
		System.out.print(removeFandL(string));
		
	}




}
