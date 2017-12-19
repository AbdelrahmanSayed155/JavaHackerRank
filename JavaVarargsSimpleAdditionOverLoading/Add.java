package JavaVarargsSimpleAdditionOverLoading;

public class Add {

	public void add(int... a){
		int res = 0;
	for(int y=0;y<a.length-1;y++) {
		System.out.print(a[y]+"+");
		res +=a[y];
	}
	
	System.out.println(a[a.length-1]+"="+(res+a[a.length-1]));
	}
	
	
}
