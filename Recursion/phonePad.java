package Recursion;

import java.util.ArrayList;

public class phonePad {

	public static void main(String[] args) {
		String digits="2";

		ArrayList<String> t=combination("",digits);
		System.out.println(t);
	}
	
    
    public static ArrayList<String> combination(String p, String up){
        
        if(up.isEmpty()){
            ArrayList<String> str = new ArrayList<>();
            str.add(p);
            return str;
        }
        
        int num = up.charAt(0) - '0';
        int s = (num-2) * 3;
        int e =  s + 2;
        
        if(num == 7){
            e = e+1;
        }else if( num ==8){
            s =s+1;
            e = e+1;
        }else if(num == 9){
            s=s+1;
            e=e+2;
        }
        
        ArrayList<String> ans = new ArrayList<>();
        for(int i=s; i<=e; i++){
            char c =(char) ('a' + i);
            ans.addAll(combination(p+c,up.substring(1)));
        }
        return ans;
    }
}











