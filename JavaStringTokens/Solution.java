package JavaStringTokens;

import java.util.Scanner;

public class Solution {
//He is a very very good boy, isn't he?
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
      //  System.out.println(s);
        s = s.replace("!", " ");
        s = s.replace(".", " ");
        s = s.replace("'", " ");
        s = s.replace("_", " ");
        s = s.replace("@", " ");
        s = s.replace("?", " ");
        s = s.replace(",", " ");
        s = s.replace("   ", " ");
        s = s.replace("    ", " ");
        while(s.contains("  ")) {
        	s = s.replace("  ", " ");
        }
        
        
        while(s.charAt(0)==' '&&s.length()>1) {
        	if(s.charAt(0)!=' ') {
        	//	System.out.println(s.length() +"s "+s);
        		break;
        	}else {
        		//System.out.println(s.length() +"s ("+s+")");
        		s = s.trim();
        	}
        }
        
        if(!s.equals(" ")) {
        s = s.trim();
        String [] allToken = s.split(" ");
        System.out.println(allToken.length);
        for(int y=0;y<allToken.length;y++) {
        System.out.println(allToken[y]);	
        }
       // System.out.println(allToken.length);
        }else {
        	 System.out.println(0);
        }
        scan.close();
    }

}
