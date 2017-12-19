package JavaEndofFile;

import java.util.Scanner;

public class Solution {
	
	public static void main(String [] args) {
		
		
		
		 Scanner in = new Scanner(System.in);
		 int numberOfLine = 1;
	      while(in.hasNext()) {
	    	  String token =  in.nextLine();
	    	  System.out.println( numberOfLine +" "+ token);
	    	  numberOfLine++;
	      }
	      
	      
	      
	}

}
