	package miniproject;

//import java.util.Scanner;

public class Bank1 {
	Customer1[] customerList=new Customer1[50];
	 
	private static int index=0;
	public String addCustomer(String name,int amount){
		Customer1 customer=new Customer1(name,amount);
		customerList[index]=customer;
		index++;
		return "account created successfully";
		
		
		
		
	}
	public void diplayCustomer(int customerid){
		for(int i=0;i<index;i++){
			if(customerList[i].getId()==customerid){
				System.out.println(customerList[i]);
			}
		}
	}
	public void diplayDeposit(int customerid,int depositamount){
		for(int i=0;i<index;i++){
			if(customerList[i].getId()==customerid){
				System.out.println("enter deposit amount");
//				int depositamount=sc.nextInt();
				int deposit=customerList[i].getAmount()+depositamount;
				customerList[i].setAmount(deposit);
				System.out.println(deposit);
			}
		}
		
		
	}
	public void displayAll(){
		for(int i=0;i<index;i++){
			System.out.println(customerList[i]);
		}
	}
	public void withdraw(int customerid,int withdrawamount){
		for(int i=0;i<index;i++){
			if(customerList[i].getId()==customerid){
				int withdraw=customerList[i].getAmount()-withdrawamount;
				customerList[i].setAmount(withdraw);
				System.out.println(withdraw);
				
			}
		}
		
	}
	

}
