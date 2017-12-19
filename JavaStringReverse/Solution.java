package JavaStringReverse;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
	     String A=sc.next();
	     boolean isPlandrom = true;
	     for(int index=0;index<A.length()/2+1;index++) {
	    	// System.out.println("forward : " + (char)A.charAt(index) );
	    	// System.out.println("backward : " + (char) A.charAt(A.length()-1-index) );
	    	 if(A.charAt(index) != A.charAt(A.length()-1-index)) {
	    		 isPlandrom = false;
	    		 break;
	    	 }
	     }
	     
	     if(isPlandrom)
	         System.out.println("Yes");
	     else
	    	 System.out.println("No");

	}

}
