package PrimeChecker;

public class Prime {
	
	public void checkPrime(int... a) {
		
		
		for(int num:a) {
			if(num >1) {
			boolean isPrime = true;
			if(num ==2) {
				System.out.print(num+" ");
			}else {
			for( int i=2;i<num;i++) {
				if(num%i==0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.print(num+" ");
			}
			}
	
		}
			
	}
		
		System.out.println();
	}

}
