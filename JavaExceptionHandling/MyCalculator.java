package JavaExceptionHandling;

public class MyCalculator {
	
	public  long power(int n, int p) throws Exception  {
		
		if(n==0 && p==0) {
			throw  new  Exception("n and p should not be zero.");
		}else if(n<0||p<0) {
			throw  new  Exception("n or p should not be negative.");
		}
		long res = 1;
		for(int y = 0;y<p;y++) {
			res *= n;
		}
		return res ; 
	}

}
