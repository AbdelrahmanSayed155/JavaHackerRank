import java.util.Scanner;

public class Java_stdin_stout2 {
	public static void main(String []args) {
		
		Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d =scan.nextDouble();
      //  we must using new scanner for read string after int 
        // or using  nextLine for read string after Integer 
        scan.nextLine();
        String s = scan.nextLine();
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        
	}

}
