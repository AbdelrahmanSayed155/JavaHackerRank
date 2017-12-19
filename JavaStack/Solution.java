package JavaStack;

import java.util.Scanner;
import java.util.Stack;

public class Solution{
	   
	   public static void main(String []argh)
	   {
	      Scanner sc = new Scanner(System.in);
	      
	      
	      
	      while (sc.hasNext()) {
	         String input=sc.next();
	    	  Stack<String> element = new Stack<String>();
	        for(int y=0;y<input.length();y++){
	        	if(element.size()>0) {
	        		String head = element.peek();
		        	if((input.charAt(y)=='}' &&head.equals("{"))||(input.charAt(y)==')' &&head.equals("("))||(input.charAt(y)==']' &&head.equals("["))) {
		                  element.pop();
		        	}else {
		        		element.push(input.charAt(y)+"");
		        	}
	        	}else {
	        		   element.push(input.charAt(y)+"");
	        	}
	        	
	      }
	        if(element.size()==0) {
	        	System.out.println("true");
	        }else {
	        	System.out.println("false");
	        }
	        
	     
	      
	   }
	}
}