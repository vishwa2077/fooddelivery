package fooddelivery;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat; 
public class order {
	String Food_Name;
	int order_No;
	Date date;
	
	Booking(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name of Food: ");
		passengerName = scanner.next();
		System.out.println("Enter order number: ");
		busNo = scanner.nextInt();
		System.out.println("Enter date dd-mm-yyyy");
		String dateInput = scanner.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		
		try {
			date = dateFormat.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public boolean isAvailable(ArrayList<Ordering> orderings, ArrayList<Food> foods) {
		int limit = 0;
		for(Food food:foods) {
			if(food.getFoodNo() == FoodNo)
				limit = food.getLimit();
		}
		
		int ordered = 0;
		for(ordering o:orderings) {
			if(b.foodNo == busNo && b.date.equals(date)) {
				ordered++;
			}
		}
		
		return ordered<limit?true:false;
		
	}
}