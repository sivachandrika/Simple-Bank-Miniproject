package miniproject;

public class Customer1 {
	private int id;
	private String name;
	private int amount;
	private static int count=1000;
	public Customer1() {
//		super();
		// TODO Auto-generated constructor stub
	}
	public Customer1(String name, int amount) {
		super();
		this.id = count++;
		this.name = name;
		this.amount = amount;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Customer1 [id=" + id + ", name=" + name + ", amount=" + amount + "]";
	}
	
	

}
