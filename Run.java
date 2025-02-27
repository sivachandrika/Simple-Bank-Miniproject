package miniproject;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Bank bank =new Bank();
		int choice =0;
		Scanner sc=new Scanner(System.in);
		do{
			System.out.println("welcome to bank services");
			System.out.println("1.Add customer");
			System.out.println("2.view customer details");
			System.out.println("3.view all customers");
			System.out.println("4.show deposit amount");
			System.out.println("enter your choice");
			choice =sc.nextInt();
			switch(choice){
			case 1:
				System.out.println("enter customer name");
				String name=sc.next();
				System.out.println("enter amount");
				int amount =sc.nextInt();
				String result=bank.addCustomer(name, amount);
				System.out.println(result);
				break;
			case 2:
				System.out.println("enter id");
				int customerid=sc.nextInt();
				 bank.displayCustomer(customerid);
				 break;
			case 3:
				System.out.println("all customers");
				bank.displayAllCustomers();
				break;
			case 4:
				 System.out.println("enter the customerid for deposit");
				 int customerid1=sc.nextInt();
				bank.displayDeposit(customerid1);
				break;
			case 5:
				System.out.println("Exiting");
				break;
			default:
				System.out.println("no data exist");
				
			}
		}while(choice<5);
		
	}
	
	

}
