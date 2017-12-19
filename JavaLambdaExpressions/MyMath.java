package JavaLambdaExpressions;

public class MyMath {
	public static boolean checker(PerformOperation p, int num) {
		  return p.check(num);
		  
		  
}
	
	public static PerformOperation isOdd(){
		return n -> n%2!=0;
	}
	public static PerformOperation isPrime(){
		return n -> (new java.math.BigInteger(String.valueOf(n))).isProbablePrime(100);
	}
	public static PerformOperation isPalindrome(){
		return n -> String.valueOf(n).equals((new StringBuilder(String.valueOf(n))).reverse().toString());
	}
	
}