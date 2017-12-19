package JavaAnagrams;

import java.util.Scanner;

public class Solution {

	
	  static boolean isAnagram(String a, String b) {
	   // System.out.println("frist String : "+a+" second String : "+b);
	    a = a.toLowerCase();
	    b = b.toLowerCase();
		 while(a.length()>0 || b.length()> 0) {
			  char c1 ;
			  if(a.length()>0) {
				  c1 = a.charAt(0);
			  }else {
				  c1 = b.charAt(0);
			  }
			  /// frist loop for frist String
			  int freq1 =0;
			  for(int y=0;y<a.length();y++) {
				  if(c1==a.charAt(y))
					  freq1++;
			  }
			/// frist loop for frist String
			  int freq2 =0;
			  for(int y=0;y<b.length();y++) {
				  if(c1==b.charAt(y))
					  freq2++;
			  }
			  if(freq1 != freq2) {
				  return false;
			  }
			 a=a.replaceAll(c1+"", "");
			 b=b.replaceAll(c1+"", "");
			//  System.out.println("after searching at char ("+c1+") frist String : "+a+" second String : "+b);
		  }
		  
		  return true;
	    }
	  
	  
	 public static void main(String[] args) {
		    
	        Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    }
}
