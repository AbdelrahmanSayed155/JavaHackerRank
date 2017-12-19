package JavaExceptionHandlingTrycatch;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {
	
	public static void main(String [] args) {
		
		  Scanner scan = new Scanner(System.in);

		  try {
			  int x =  scan.nextInt();
			  int y = scan.nextInt();
			  int res = x/y;
			  System.out.println(res);
		  }catch (InputMismatchException ex) {
		     System.out.println(ex.getClass().getName());
	     }catch (ArithmeticException ex) {
	     	System.out.println(ex.getClass().getName() +": / by zero");
	     }
		  
		
	}

}
