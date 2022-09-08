package com.bankAppjdbc.com.bank;
//import java packages
import java.sql.*; 

public class bankCustomer{
	Connection con = null; //connection is null
	public void connect () throws Exception{
		//jdbc driver
		Class.forName("com.mysql.cj.jdbc.Driver");
	//  connection is established 
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Anudip","root","35ks@04"); 
		
	}
	
	public int CustomerRegistration(bankCustomer a1) throws Exception{
		
		String query = "bankCustomer(Id,Name,Password,Balance)";//inserting 
		
		PreparedStatement pst = con.prepareStatement(query);//for query execution 
		pst.setInt(1,a1.customerId);
		pst.setInt(4, a1.customerBalance);
		pst.setString(2,a1.customerName);
		pst.setString(3,a1.customerPassword);
		
		int count = pst.executeUpdate();
		
		return count;
	}
	public int Authentication(String userName, String password)throws Exception//method
	{
		String query ="select name = '"+userName+"'";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		if (rs.next()) {
			String cPassword = rs.getString(3);
			if(cPassword.equals(password) ) {
				int cId = rs.getInt(1);
				return cId;
			}
			else {
				return 0;
				}	
		}
		else {
			return -1;
		}
	}
	//authentication
	public int withdraw(int cId, int amount) throws Exception
	{
		String query ="select Id ="+cId;
		
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		
		int acBalance = rs.getInt(4);
		
		if (acBalance > amount) {
			acBalance-=amount;
			String query2 ="update="+acBalance+" where Id="+cId;
			Statement st2=con.createStatement();
			st2.executeUpdate(query2);
			return acBalance;
		}
		else {
			return -1;
		}
	}
	
	//checking id and amount
	public int deposit(int cId, int amount) throws Exception
	{
		String query ="select Id= "+cId;
		
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		
		int acBalance = rs.getInt(4);
		
			acBalance+=amount;
			String query2 = "update="+acBalance+" where Id="+cId;
			Statement st2=con.createStatement();
			st2.executeUpdate(query2);
			return acBalance;
	}
	
	public int checkBalance(int cId)throws Exception{
		
		String query="select Id="+cId;
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		int accBal=rs.getInt(4);
		return accBal;
		
	}
	//checking previous password and new password 
	public int pinChange(int cId, String oldPin,String newPin)throws Exception{
		String query="select Id="+cId;
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		String pwd=rs.getString(3);
		if(pwd.equals(oldPin)) {
			String query2="update="+newPin+" where Id="+cId;
			PreparedStatement pst=con.prepareStatement(query2);
			int count=pst.executeUpdate();
			return count;
		}
		return cId;
}
	}
	