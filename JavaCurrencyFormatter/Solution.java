package JavaCurrencyFormatter;

import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
    	
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setGroupingSeparator(',');
        String pattern = "$#,##0.##";
        String pattern2 = "#,##0.##";
        String pattern3 = "￥#,##0.##";
        String pattern4 = "#,##0.## €";

        DecimalFormat decimalFormat = new DecimalFormat(pattern, symbols); 
        String us = decimalFormat.format(payment);
        
         decimalFormat = new DecimalFormat(pattern2, symbols); 
         String india = decimalFormat.format(payment);
         india = "Rs."+ india;
         decimalFormat = new DecimalFormat(pattern3, symbols); 
         String china = decimalFormat.format(payment);
         
         symbols.setGroupingSeparator(' ');
         decimalFormat = new DecimalFormat(pattern4, symbols); 
         String france = decimalFormat.format(payment);
         france = france.replace(".", ",");
       System.out.println("US: " + us);
       System.out.println("India: " +india);
       System.out.println("China: " + china);
       System.out.println("France: " + france);
    }
    
    
    
}
