package JavaSubstringComparisons;

import java.util.Scanner;

public class Solution {
	//welcometojava
	 public static String getSmallestAndLargest(String s, int k) {
		// System.out.println("Starting function String is " + s+" s length is " +s.length()+ " k is "+k);
	        String smallest = "";
	        String largest = "";
	        String subst ="";
	        for(int y=0;y<s.length()-k+1;y++) {
	        	 subst =  new String(s.substring(y, k+y));
	        	//System.out.println("subString " + subst );
	        	//System.out.println("FullString " + s + " y is"+ y +" k is "+k);
	        	
	        	if(smallest.equals("")&&largest.equals("")) {
	        		smallest = subst;
	        		largest  = subst;
	        	}else if(largest.compareTo(subst) < 0) {
	        		largest = subst;
	        	}else if(smallest.compareTo(subst) > 0) {
	        		smallest = subst;
	        	}
	        	s =s;
	        	
	        }
	        
	        return smallest + "\n" + largest;
	    }

	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String s = scan.next();
	        int k = scan.nextInt();
	        scan.close();
	      
	        System.out.println(getSmallestAndLargest(s, k));
	    }

}
