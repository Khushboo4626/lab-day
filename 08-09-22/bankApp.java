package com.bankAppjdbc.com.bank;
//importing packages
 import java.util.*;
    	
 public class bankApp {

		
		public static void main(String[] args) throws Exception{
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			customer c_dao = new customer ();
			bankCustomer b1 = new bankCustomer();
			
			
			System.out.println("-------Welcome to Bank---------");
			
			System.out.println("Choose Operation : \n1 to create new account \n2  To login to account");
			int op= sc.nextInt();
			
			switch(op) {
				case 1-> {
					System.out.println("enter customer ID : ");
					int id = sc.nextInt();
					System.out.println("enter customer name : ");
					String name = sc.next();
					System.out.println("enter password : ");
					String pwd = sc.next();
					System.out.println("enter account balance ");
					int balance = sc.nextInt();
					
					b1.customerId=id;
					b1.customerName=name;
					b1.customerPassword=pwd;
					b1.customerBalance= balance;
				
					c_dao.connect();// connect to jdbc
				
					int check = c_dao.CustomerRegistration(b1);
					
					if (check>0) {
						System.out.println("sucessfully registered");
					}
					else {
						System.out.println("invalid details");
					}
			}
				case 2->{
					
					System.out.println("enter customer name :  ");
					String name = sc.next();
					System.out.println("enter password : ");
					String pwd = sc.next();
					c_dao.connect();
					// calling method
					int check = c_dao. Authentication(name,pwd);
					 if(check == 0) {
						System.out.print("wrong details");
					}
					 else if (check == -1) {
						System.out.print("invalid");
					}
					
					else{
						System.out.print("login successfully ");
						
						int op2 = 0;
						while(op2<5) {
							System.out.println("\nChoose options : \n1 withdraw\n2 deposit \n3 enter pin "
									+ "\n4 balance \n5 exit");
							op2=sc.nextInt();
							
							switch(op2) {
							case 1->
							{
								System.out.print("enter amount to withdraw");
								int amount = sc.nextInt();
								 int result = c_dao.withdraw(check, amount);
								 if (result<=0) {
									 System.out.print("wrong input");
								 }
								 else {System.out.print("\t\twithdrawl sucessfully"+result);}
							}
							case 2->
							{
								System.out.print("enter amount to deposit");
								int amount = sc.nextInt();
								 int result = c_dao.deposit(check, amount);
								 if (result<=0) {
									 System.out.print("wrong input");
								 }
								 else {System.out.print("\t\tamount deposited"+result);
								 }
							}
							case 3->
							{
								System.out.println("enter password");
								String paswd=sc.next();
								int count=c_dao.pwd(check, paswd);

							if(count<=0)
							{
								System.out.println("invalid password");
							}
							else {
								System.out.println("opening......");
							}
							}
							case 4->{
								System.out.print("current balance is "+c_dao.checkBalance(check));
							}
							
							case 5->{
								System.exit(0);
							}
							}
							}
					}
					
				}
				
			
			}
			sc.close();
		}
}
}
