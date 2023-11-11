package fooddelivery;

import java.util.Scanner; //nested package/ hierarchical package
import java.util.ArrayList;

public class delivery {

	public static void main(String[] args) {
		
	
		ArrayList<Food> foods = new ArrayList<Bus>();
		ArrayList<Ordering> orderings = new ArrayList<Booking>();
		
		foods.add(new Food(1,true,2));
		foods.add(new Food(2,false,50));
		foods.add(new Food(3,true,48));
		
		int userOpt = 1;
		Scanner scanner = new Scanner(System.in);
		
		for(Food b:foods) {
			b.displayFoodInfo();
		}
		
		while(userOpt==1) {
			System.out.println("Enter 1 to Order and 2 to exit");
			userOpt = scanner.nextInt();
			if(userOpt == 1) {
				Ordering ordering = new Ordering();
				if(ordering.isAvailable(ordering,foods)) {
					orderings.add(ordering);
					System.out.println("Your ordered is confirmed");
				}
				else
					System.out.println("Sorry. Food is fully selled. Try another food or date.");
			}
		}
	}

}
