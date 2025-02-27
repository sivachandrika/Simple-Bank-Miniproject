package miniproject;

import java.util.Scanner;

public class Bank {
	 Customer[] customerList=new Customer[50];
	 private static int index=0;
	 Scanner sc=new Scanner(System.in);
	 public String addCustomer(String name,int amount){
		 Customer customer=new Customer(name,amount);
		 customerList[index]=customer;
		 index++;
		 return "Account created successfuly";
	 }
	 public void displayCustomer(int customerid){
		 for(int i=0;i<index;i++){
			 if(customerList[i].getId()==customerid){
				 System.out.println(customerList[i]);
			 }
		 }
		 
	 }
	 public void displayAllCustomers(){
		 for(int i=0;i<index;i++){
			 System.out.println(customerList[i]);
		 }
	 }
	 public void displayDeposit(int customerid){
		
//		 int deposit=0;
		 
		  
		 for(int i=0;i<index;i++){
			 if(customerList[i].getId()==customerid){
				 System.out.println("Enter amount to be deposited");
				 
				 int depositamount=sc.nextInt();
				 int deposit=customerList[i].getamount()+depositamount;
				 customerList[i] = new Customer(customerList[i].getName(), deposit);
				 System.out.println("deposited amount"+deposit);
				 
				 
			 }
//			 else{
//				 System.out.println("customer not found");
//			 }
			 
			 
		 }
		
		 
		 
		  
		 
	 }

}
