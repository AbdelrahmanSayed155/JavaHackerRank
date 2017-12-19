package JavaMD5;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class Solution {
	
	public static void main(String []args) {
				
		Scanner scan = new  Scanner(System.in);

		String original = scan.next();
		MessageDigest md = null;;
		try {
			md = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		md.update(original.getBytes());
		byte[] digest = md.digest();
		StringBuffer sb = new StringBuffer();
		for (byte b : digest) {
			sb.append(String.format("%02x", b & 0xff));
		}

		//System.out.println("original:" + original);
		System.out.println(sb.toString());
	}
	
		
		
		
}


