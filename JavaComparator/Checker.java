package JavaComparator;

import java.util.Comparator;

public class Checker implements Comparator {
	
	@Override
	public int compare(Object o1, Object o2) {
		if(((Player)o1).score >((Player)o2).score )
			return -1;
		else if(((Player)o1).score < ((Player)o2).score )
			return 1;
		else {
			return ((Player)o1).name.compareTo(((Player)o2).name );
				
	}
}
}