package JavaStaticInitializerBlock;

import java.util.Scanner;

public class Solution {
	
	public static boolean flag = false ;
	public static int B ;
	public static int H ;
	
	static {
		 Scanner sc=new Scanner(System.in);
          B=sc.nextInt(); 
          H=sc.nextInt();
         if(H>0&&B>0) {
        	 flag = true;
         }else {
        	System.out.println("java.lang.Exception: Breadth and height must be positive"); 
         }
         sc.close();
	}

	public static void main(String[] args) {
		if(flag){
			int area=B*H;
			System.out.print(area);
		}

	}

}
