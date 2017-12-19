package JavaBitSet;

import java.util.BitSet;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int numbersElement= scan.nextInt();
		int numberOpration = scan.nextInt();
		BitSet s1 = new BitSet(numbersElement);
		BitSet s2 = new BitSet(numbersElement);
		for(int i=0;i<numberOpration;i++) {
			String op = scan.next();
			int fristNumber = scan.nextInt();
			int seconNumber = scan.nextInt();

			if(op.equalsIgnoreCase("and")) {
				if(fristNumber==1&&seconNumber==2) {
					 s1.and(s2);
					 System.out.println(s1.cardinality()+" "+s2.cardinality());
				}else {
					s2.and(s1);
					System.out.println(s1.cardinality()+" "+s2.cardinality());
				}
				
			}else if(op.equalsIgnoreCase("or")) {
				if(fristNumber==1&&seconNumber==2) {
					 s1.or(s2);
					 System.out.println(s1.cardinality()+" "+s2.cardinality());
				}else {
					s2.or(s1);
					System.out.println(s1.cardinality()+" "+s2.cardinality());
				}
				
			}else if(op.equalsIgnoreCase("xor")) {
				if(fristNumber==1&&seconNumber==2) {
					 s1.xor(s2);
					 System.out.println(s1.cardinality()+" "+s2.cardinality());
				}else {
					s2.xor(s1);
					System.out.println(s1.cardinality()+" "+s2.cardinality());
				}
				
			}else if(op.equalsIgnoreCase("flip")) {
				if(fristNumber==1) {
				 s1.flip(seconNumber);
				 System.out.println(s1.cardinality()+" "+s2.cardinality());
			}else {
				s2.flip(seconNumber);
				System.out.println(s1.cardinality()+" "+s2.cardinality());
			}
				
			}else if(op.equalsIgnoreCase("set")) {
				if(fristNumber==1) {
					 s1.set(seconNumber);
					 System.out.println(s1.cardinality()+" "+s2.cardinality());
				}else {
					s2.set(seconNumber);
					System.out.println(s1.cardinality()+" "+s2.cardinality());
				}
			}else {
				
			}
			
		}
		

	}

}
