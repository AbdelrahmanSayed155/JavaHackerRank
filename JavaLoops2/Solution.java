package JavaLoops2;

import java.util.Scanner;

public class Solution {

	
	/**
	 * @param args
	 */
	public static void main(String []args) {
		
		 Scanner in = new Scanner(System.in);
		 
	        int t=in.nextInt();
	        for(int i=0;i<t;i++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	           // System.out.println(a +"   " +b+"    "+n);
	            int result  = 0;
	            String StringReslut ="";
	            for(int ii=0;ii<n;ii++) {
	           if(ii==0)
	            result  = result + (int) (a + (Math.pow(2, ii) * b));
	           else
	        	   result  = result + (int) ((Math.pow(2, ii) * b));
	            //System.out.println(result);
	            StringReslut  += result +" ";
	            }
	            System.out.println(StringReslut.trim());
	        }
	        in.close();
	}
}
