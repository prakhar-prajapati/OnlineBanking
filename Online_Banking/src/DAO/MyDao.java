package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.beanBank;

public class MyDao {
	// Mysql Connection Code
	public Connection start()
	{
		Connection con=null;
		try {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OnlineBanking", "root", "root");
	}
	catch(Exception e) {
	  System.out.println(e);}
	return con;
	}
	
	
	// insert detail
	public int insert(beanBank e)
	{
		int x= 0; 
		try {
			Connection con=start();
			PreparedStatement ps =con.prepareStatement("insert into Account_details(cname,caddress,cmobile,cemail,caccount,cpassword,cbalance)values(?,?,?,?,?,?,?)");
			ps.setString(1,e.getName());
			ps.setString(2, e.getAddress());
			ps.setString(3,e.getMobile());
			ps.setString(4, e.getEmail());
			ps.setInt(5, e.getAccount());
			ps.setString(6, e.getPassword());
			ps.setDouble(7, e.getBalance());
			
			x =ps.executeUpdate();
			con.close();
		}
		catch(Exception s)
		{
			System.out.println(s);
		}
		return x;
   }
	
	
	//Display data
	public ArrayList<beanBank> ShowData()
	{
		ArrayList<beanBank> list=new ArrayList<>();

		try {
               Connection con=start();
		  PreparedStatement ps=con.prepareStatement("select * from account_details");
		  
		  ResultSet rs=ps.executeQuery();
		while(rs.next())
		  { 
			beanBank o=new beanBank();
			o.setCid(rs.getInt("cid"));
			 o.setName(rs.getString("cname"));
			o.setAddress(rs.getString("caddress"));
			o.setMobile(rs.getString("cmobile"));
			o.setEmail(rs.getString("cemail"));
			o.setAccount(rs.getInt("caccount"));
			o.setPassword(rs.getString("cpassword"));
			  o.setBalance(rs.getDouble("cbalance"));
			  list.add(o);
			  
		 }
				}catch(Exception e)
		{
			System.out.println(e);
		}
    return list;

	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
