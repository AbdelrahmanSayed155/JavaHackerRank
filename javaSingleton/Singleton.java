package javaSingleton;

public class Singleton {
	
	
	private Singleton() {	
	}
	public String str;

	 private static Singleton instance = null;
	 
	 static Singleton getSingleInstance() {
				synchronized (Singleton.class) {
					if (instance == null) {
						instance = new Singleton();
					}
				}
			return instance;
		}
	 
}
