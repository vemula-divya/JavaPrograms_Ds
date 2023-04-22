

import java.util.Scanner;

public class PalindromeSubString {



	public static void main(String[] args) {
	// to find the sub-string from the given string that is the samw when read 
		//forwards and backwards
      Scanner in =new Scanner(System.in);
      String is=in.nextLine();
      String result = funSubString(is);
      System.out.println(result);
	}

	private static String funSubString(String s) {
		String result="";
		int n = s.length();
		int len =0;
		
		boolean[][] ispali = new boolean[n][n];

		for (int i=n-1; i>=0; i--) {
			for (int j=1; j<n; j++) {
				if(s.charAt(i)==s.charAt(j) && (j-i<2 || ispali[i+1][j-1]))
				{
					ispali[i][j] =true;
					if(j-i+1>len) {
						String d=s.substring(i,j+1);
						if(d.length()<=1)
							result="None";
						else {
							result=d;
							len=j-i+1;
						}
					}
				}
			}
		}

		return result;
		//YABCCBAZ    ABCCBA
		//ABC None
	}


	
	
	


}