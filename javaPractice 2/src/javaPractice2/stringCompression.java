package javaPractice2;
//---------------------INCOMPLETE
public class stringCompression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringCompress("aabbccdeeee");
		

	}

	public static String stringCompress(String str) {
		char[] ch=str.toCharArray();
		int count=1;
		String ans="";

		for (int i = 1; i < str.length(); i++) 
		{
			if (ch[i-1]!=ch[i])
			{
				ans=ans+ch[i]+count;
				count=1;

			} else {
				count++;
			}

		}
	return ans;
	}

}
