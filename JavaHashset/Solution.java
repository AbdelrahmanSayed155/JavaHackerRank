package JavaHashset;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        int t = s.nextInt();
	        String [] pair_left = new String[t];
	        String [] pair_right = new String[t];
	        
	        for (int i = 0; i < t; i++) {
	            pair_left[i] = s.next();
	            pair_right[i] = s.next();
	        }
	        
	       Map<String, ArrayList<String>> hashMap =  new HashMap<String, ArrayList<String>>();
	       int count = 0; 
	        for(int y=0;y<pair_left.length;y++) {
	        	if(!hashMap.containsKey(pair_left[y])) {
	        		count++;
	        		ArrayList<String> values = new ArrayList<String>();
	        		values.add(pair_right[y]);
	        		 hashMap.put(pair_left[y], values);
	        	}else if(hashMap.containsKey(pair_left[y]) && !hashMap.get(pair_left[y]).contains(pair_right[y])) {
	        		count++;
	        		ArrayList<String> values = hashMap.get(pair_left[y]);
	        		values.add(pair_right[y]);
	        		 hashMap.put(pair_left[y], values);
	        	}
	        	System.out.println(count);
	        }
	        
	        
//	        for (Map.Entry<String, ArrayList<String>> entry : hashMap.entrySet()) {
//	        	System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue().size());
//	        }
	        

	        
//	        int count = 0;
//	        for(int i=0;i<pair_left.length;i++) {
//	        	boolean found = false;
//	        	for(int x=0;x<i;x++) {
//	        	if(pair_left[i].equals(pair_left[x])) {
//	        		if(pair_right[x].equals(pair_right[i])) {
//	        			found = true;
//	        			break;
//	        		}
//	        	}
//	        	}
//	        	if(!found) {
//	        		count++;
//	        	}
//	        	System.out.println(count);
//	        }
	        
	}

}
