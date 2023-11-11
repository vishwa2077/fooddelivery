package fooddelivery;

public class food {
	private int foodNo;
	private boolean ac;
	private int limit; //get and set
	
	Bus(int no,boolean ac,int lim){
		this.foodNo = no;
		this.ac = ac;
		this.limit = lim;
	}
	
	public int getfoodNo(){ //accessors
		return foodNo;
	}
	
	public boolean isAc(){
		return ac;
	}
	public int getLimit(){ //accessor method
		return limit;
	}
	
	public void setAc(boolean val) { //mutators
		ac = val;
	}
	
	public void setLimit(int lim) { //mutator
		limit = lim;
	}
	
	public void displayFoodInfo(){
		System.out.println("Food No:" + foodNo + " Ac:" + ac + " Total Limit: " + limit);
	}
}
