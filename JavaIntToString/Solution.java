package JavaIntToString;

import java.util.Calendar;
import java.util.Scanner;


public class Solution {
	
    @SuppressWarnings("deprecation")
	public static String getDay(String day, String month, String year) {
     // Calendar cal = new GregorianCalendar(Integer.parseInt(year) , Integer.parseInt(month)+1, Integer.parseInt(day));
        Calendar cal = Calendar.getInstance();  
        cal.set(Calendar.YEAR, Integer.parseInt(year)); // set the year
        /// jan is 0 and dec is 11
		cal.set(Calendar.MONTH, Integer.parseInt(month)-1); // set the month
		cal.set(Calendar.DAY_OF_MONTH, Integer.parseInt(day));
//		
//		 System.out.println("year "+Integer.parseInt(year) ); 
//		 System.out.println( "month" +Integer.parseInt(month) ); 
//		 System.out.println("day" + Integer.parseInt(day) ); 
//		
      
      int daynumber = cal.getTime().getDay();
     // System.out.println( cal.getTime() + "day number "+ daynumber );  
      String DayName ="";
      switch (daynumber) {
	        case 0:
	        	DayName = "Sunday";
	        	break;
	        case 1:
	        	DayName= "Monday";
	        	break;
	        case 2:
	        	DayName= "Tuesday";
	        	break;
	        case 3:
	        	DayName= "Wednesday";
	        	break;
	        case 4:
	        	DayName= "Thursday";
	        	break;
	        case 5:
	        	DayName= "Friday";
	        	break;
	        case 6:
	        	DayName= "Saturday";
	        	break;
	        default:
		       DayName="";
	           break;
	}
    	return DayName.toUpperCase();
    }

	
	  public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String month = in.next();
	        String day = in.next();
	        String year = in.next();
	        
	        System.out.println(getDay(day, month, year));
	    }

}
