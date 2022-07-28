/* Write a java program  to create a customer class to print information regarding deposit and withdrawal from an account
by Khushboo Sharma                                                                                      */
import java.util.Scanner;//impoting scanner                                                                   
class customerInfor
{
    public static void main(String args[])                                                   
    {
         // creating main method
        int amt=7000,accountNum = 672446,accountBal=10000;
        String customerName="Nitish";
        customerInformation c1 = new customerInformation();
	    c1.setAccountInfor(accountNum,customerName,accountBal);
	    c1.getAmt();

       //calling getaccount method............
	    c1.depositAmt(amt);                                       
	    c1.getAmt();
	    c1.withdrawAmt(amount);
	    c1.getAmt();

    }
}

//creating subclass
class customerInfo                                                         
{
    private int accNum, accBal;
    private String accHolderName;

    //creating method to set information of a customer
    public void setAccountInformation(int accountNum,String customerName,int accountBal)
    {
        accnumber = accountNum ;
        accHolderName = customerName;
        accBalance = accountBal;

    }

    //creating method to add amt in account
    public void depositAmt(int amt)
    {   
        System.out.println("depositing amt is "+amt);
        accBalance += amt;
    }

    //creating method to withdraw some amt
     public void withdrawAmt(int Amt)
    {
	     System.out.println("withdrawing amt is "+amt);	
 	     accBalance -= amount;

    }

    //creating get method to display amt
    public void getAmt()
    {
	System.out.println(accHolderName+", you have "+accBalance+" amount in your account");
    }
}