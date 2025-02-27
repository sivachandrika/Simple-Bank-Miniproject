	package miniproject;
	
	import java.util.Scanner;
	
	public class Run1 {
		public static void main(String[] args) {
			Bank1 bank=new Bank1();
			int choice=0;
			bank.addCustomer("banthi",20000);
			bank.addCustomer("shiva", 300000);
			
//			System.out.println(bank.addCustomer(", amount));
//			System.out.println(bank.addCustomer("ashok",50000));
			
			Scanner sc=new Scanner(System.in);
			do{
				System.out.println("welcome to bank services");
				
//				System.out.println("1.add customer details");
				System.out.println("1.view details");
				System.out.println("2.deposit");
				System.out.println("3.view allcustomers");
				System.out.println("4.withdraw");
				System.out.println("Enter your choice ");
				choice =sc.nextInt();
				switch(choice){
 
				case 1:
					System.out.println("enter customerid");
					int customerid=sc.nextInt();
					
					bank.diplayCustomer(customerid);
					break;
				case 2:
					System.out.println("enter customerid");
					int customerid1=sc.nextInt();
					System.out.println("enter your amount");
					int depositamount=sc.nextInt();
					bank.diplayDeposit(customerid1,depositamount);
					break;
				case 3:
					System.out.println("all customers");
					bank.displayAll();
					break;
				case 4:
					System.out.println("enter customerid");
					int customerid2=sc.nextInt();
					System.out.println("enter withdraw amount");
					int withdrawamount=sc.nextInt();
					bank.withdraw(customerid2, withdrawamount);
					
					break;
					
				default:
					System.out.println("not valid");
					
					
					
					
				
					 
				}
				
			}while(choice<5);
			
		}
	
	}
