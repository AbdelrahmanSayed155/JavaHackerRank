package JavaList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		Scanner  scan = new Scanner(System.in);
		int numberElement = scan.nextInt();
		for(int y=0;y<numberElement;y++) {
			list.add(scan.nextInt());
		}
		int queriesNumber = scan.nextInt();
		for(int y=0;y<queriesNumber;y++) {
			String query = scan.next();
			if(query.toLowerCase().equals("Delete".toLowerCase())) {
				int indexWillDeleted = scan.nextInt();
				list.remove(indexWillDeleted);
			}else {
				int indexWillInserted = scan.nextInt();
				int numberWillInserted = scan.nextInt();
				list.add(indexWillInserted, numberWillInserted);
			}
		}
		for(int y=0;y<list.size();y++) {
			System.out.print(list.get(y)+" ");
		}
		
	}

}
