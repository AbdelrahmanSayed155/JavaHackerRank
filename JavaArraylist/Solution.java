package JavaArraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
	
	  public static void main(String[] args) {
	        
		  Scanner scan = new Scanner(System.in);
		  
		  ArrayList<ArrayList<Integer>> arr = new  ArrayList<ArrayList<Integer>>();
		  
		  int numberOfElement = scan.nextInt();
		  scan.nextLine();
		  for(int y=0;y<numberOfElement;y++) {
			  String line = scan.nextLine();
			  String [] str = line.split(" ");
			  ArrayList<Integer> temp = new ArrayList<Integer>();
			  for(int i=1;i<str.length;i++) {
				  temp.add(Integer.parseInt(str[i]));  
			  }
			  arr.add(temp);
		  }
		  
		  int numberOfquery = scan.nextInt();
		  for(int n=0;n<numberOfquery;n++) {
			  int x = scan.nextInt();
			  int y= scan.nextInt();
			  x -= 1;
			  y -= 1;
			//  System.out.println("x is "+x+" y is "+y);
			  if(x>-1&&y>-1) {
			  try {
				  System.out.println(arr.get(x).get(y).toString());
			  }catch (Exception e) {
				System.out.println("ERROR!");
			}
			  }else {
				  System.out.println("ERROR!"); 
			  }
		  }
		  
	    }

}
