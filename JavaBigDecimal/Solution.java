package JavaBigDecimal;

import java.math.BigDecimal;
import java.util.Scanner;
class Solution{
    public static void main(String []args){
        //Input
//    	
//    	BigDecimal d1 = new BigDecimal("0.0");
//    	BigDecimal d2 = new BigDecimal("00.00");
//    	BigDecimal bigZero =  new BigDecimal("0");
//    	System.out.println("less "+d1.compareTo(bigZero));
//    	System.out.println("equal "+d2.compareTo(bigZero));
//    	System.out.println("larger " +d2.compareTo(bigZero));
    	
    	
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();
        
        BigDecimal bigZero =  new BigDecimal("0");
        
        
        
        
        for(int i=0;i<n;i++){
        	 BigDecimal currentNum = new BigDecimal(s[i]);
        	for(int y=0;y<n;y++){
        		BigDecimal nexttNum = new BigDecimal(s[y]);
        		
        		if(currentNum.compareTo(nexttNum)>0) {
        			String temp = s[y];
        			s[y]=s[i];
        			s[i]=temp;
        			currentNum = new BigDecimal(s[i]);
        		}
        		else if(currentNum.compareTo(nexttNum)==0 && s[i].length()>s[y].length()) {
        	                 if(currentNum.compareTo(bigZero)>0&&nexttNum.compareTo(bigZero)>0) {
        	                ///	System.out.println(" > 0 ase equality  frist num : " + currentNum +"second num : "+nexttNum);
        			            String temp = s[y];
        			            s[y]=s[i];
       			                s[i]=temp;
       			             currentNum = new BigDecimal(s[i]);
        			         }else if(currentNum.compareTo(bigZero)==0&&nexttNum.compareTo(bigZero)==0 &&y>i){
         	                	//System.out.println(" < 0 case equality  frist num : " + currentNum +"second num : "+nexttNum);
         	                	String temp = s[i];
         			            s[i]=s[y];
        			            s[y]=temp;
        			            currentNum = new BigDecimal(s[y]);
        			        }
       		}
        		
            }
        }        
                
        
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}