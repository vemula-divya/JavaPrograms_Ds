package Recursion;

import java.util.ArrayList;

public class Dice {

	public static void main(String[] args) {
		int digit=4;

		ArrayList<String> t=combination("",digit);
	 System.out.println(t);
	}
	
    
    public static ArrayList<String> combination(String p, int t){
        
        if(t==0){
          ArrayList<String> str = new ArrayList<>();
          str.add(p);
          return str;
        }
        
        ArrayList<String> str = new ArrayList<>();

        
        for(int i=1; i<=t && i<=6 ; i++){
        	str.addAll(combination(p+i,t-i));
            
        }
		return str;
      
    }
}











