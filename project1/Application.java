package firstproject.bankapp;
//importing packages
import java.util.Scanner;
import com.bankapp.controller.bankappController;
import com.bankapp.model.bankappModel;

public class Application 
{
    public static void main( String[] args ) throws Exception
    {
    	//for validation
    	bankappController bc=new bankappController();
    	//for passing data
    	bankappModel bm=new bankappModel();
		Scanner sc = new Scanner(System.in); 
		{
			System.out.println("\t\t\t\t\t\t-----Banking Application----");
			System.out.println("Enter Customer Name");//account holder name
			String customerName=sc.next();
			bm.setCustomerName(customerName);
			
			System.out.println("Enter Customer Id");// account holder Id
			String customerId=sc.next();
			bm.setCustomerId(customerId);
			
				
					System.out.println("Enter password");
					String accPassword=sc.next();
					bm.setAccPassword(accPassword);
			try {
				//validating password
				if(bc.checkAccountPassword(bm))
				{
			              System.out.println("Enter Cutomer Account Number");
			              int accNumber=sc.nextInt();
			              bm.setAccNumber(accNumber);
			              System.out.println("Enter account balance");
			              int accBalance=sc.nextInt();
			              bm.setAccBalance(accBalance);
			              System.out.println("customer account detail is given below ");
			              System.out.println(bm.toString());//performing banking operations
			              int operation = 0;
			              while(operation<3)
			              {
			            	System.out.println("select operation \n press 1 for deposit\n press 2 for withdraw\n  press 3 for exit ");
			            	operation=sc.nextInt();
			              
			            	switch(operation)
			            	{
			            	  case 1->
			            	  {
			            		 System.out.println("Enter password to deposit amount");
			            		 String pwd=sc.next();
			            		 try {
			            			if(bc.checkDeposit(bm,pwd))
			            			{
			                         System.out.println("Enter amount to deposit");
			                         int newDepositAmount=sc.nextInt();
			                         bm.setDepositAmount(newDepositAmount);
			                         System.out.println("balance of your account is:"+bm.getAccBalance());
			            			}
			            		 }
			            		 catch(Exception e)
			            		 {
			            			 System.out.println(e.getMessage());
			            		 }
			            	  }
			            	  
			                      //withdraw method
			            		 case 2->
				            	  {
				            		 System.out.println("Enter password to withdraw amount");
				            		 String pwd2=sc.next();
				            		 System.out.println("Enter amount to withdraw");
			                         int newWithdrawAmount=sc.nextInt();
			                         
				            		 try {
				            			if(bc.checkWithdraw(bm,pwd2,newWithdrawAmount))
				            			{
				                         bm.setWithdrawAmount(newWithdrawAmount);
				                         System.out.println("Sucessfullly withdraw now balance of your account is:"+bm.getAccBalance());
				            			}
				            		 }
				            		 catch(Exception e)
				            		 {
				            			 System.out.println(e.getMessage());
				            		 }
				            	  }
			            		 default->
			            			 System.exit(0);
				            	  }
			            	  }
			              }
				}
			              
				
				catch(Exception e)
       		 {
       			 System.out.println(e.getMessage());
       		 }	
		}
			              }
    }

