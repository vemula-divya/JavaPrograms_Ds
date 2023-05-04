package Hash;

import java.util.HashMap;
import java.util.Map;

public class Itinerary {

	  public static String printPath(HashMap < String, String > hm) {
	    HashMap < String, String > revMap=new HashMap < String, String >();
	    String start = " ";

	    for (Map.Entry < String, String > m: hm.entrySet()) {
	      if (!revMap.containsKey(m.getKey())) {
	        start = m.getKey();

	      }
	    }

	   return start;

	  }

	    public static void main (String[] args) {
	        
	    HashMap < String, String > hm = new HashMap<>();
	    hm.put("Chennai", "Bengaluru");
	    hm.put("Mumbai", "Delhi");
	    hm.put("Goa", "Chennai");
	    hm.put("Delhi", "Goa");
	    
	   
	    
	   String start = printPath(hm);
	   while(hm.containsKey(start))
	   {
	       System.out.print(start+"--->");
	       start=hm.get(start);
	   }
	          System.out.print(start);
	        
	    }
	}
