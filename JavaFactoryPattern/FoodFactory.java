package JavaFactoryPattern;

public class FoodFactory {

	public Food getFood(String order) {
		
		if(order.equalsIgnoreCase("cake")) {
			return new Cake();
		}else if(order.equalsIgnoreCase("pizza")) {
			return new Pizza();
		}else
			return null;
	}
	
}
