package miniproject;

public class Customer {
	private int id;
	private String name;
	private int amount;
	private static int count=10000;
	public Customer() {
//		super();
		// TODO Auto-generated constructor stub
	}
	public Customer( String name, int amount) {
		super();
		this.id = count++;
		this.name = name;
		this.amount = amount;
	}
	public int getId() {
		return id;
	}
	public int getamount(){
		return amount;
	}
	public String getName(){
		return name;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", amount=" + amount + "]";
	}
	
	
	

}
