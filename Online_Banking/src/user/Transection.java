package user;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Transection
 */
@WebServlet("/Transection")
public class Transection extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Transection() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		int ammount=sc.nextInt();
			}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//Session get
		HttpSession session=request.getSession();
		Integer get=(Integer)session.getAttribute("uid");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		//String r=request.getParameter("raccount");
		String s=request.getParameter("saccount");
		String a=request.getParameter("ammount");
		try {
			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OnlineBanking", "root", "root");
			PreparedStatement ps3=con.prepareStatement("Select cbalance from account_details where caccount=?");
			PreparedStatement ps4=con.prepareStatement("Select cbalance from account_details where caccount=?");
			ps3.setInt(1,get);
			ps4.setInt(1, Integer.parseInt(s));
			ResultSet rs=ps3.executeQuery();
			rs.next();
			ResultSet rs1=ps4.executeQuery();
			rs1.next();
			int temp=(rs.getInt("cbalance")+rs1.getInt("cbalance"));
			out.println(temp);
			PreparedStatement ps1=con.prepareStatement("update account_details set cbalance=cbalance-? where caccount=?");
			PreparedStatement ps2=con.prepareStatement("update account_details set cbalance=cbalance+? where caccount=?");
		     
		     ps1.setInt(1,Integer.parseInt(a));
		     ps1.setInt(2,get);
		     ps2.setInt(1,Integer.parseInt(a));
		     ps2.setInt(2,Integer.parseInt(s));
		     con.setAutoCommit(false);
		     ps1.executeUpdate();
		     ps2.executeUpdate();
		     
		    PreparedStatement ps5=con.prepareStatement("Select cbalance from account_details where caccount=?");
		 	PreparedStatement ps6=con.prepareStatement("Select cbalance from account_details where caccount=?");
		 	ps5.setInt(1, get);
			ps6.setInt(1, Integer.parseInt(s));
			ResultSet rs2=ps5.executeQuery();
			rs2.next();
			ResultSet rs3=ps6.executeQuery();
			rs3.next();
			int temp1=(rs2.getInt("cbalance")+rs3.getInt("cbalance"));
			out.println(temp1); 
		     if(temp==temp1)
		     { con.commit();
		     out.println("<h1>transection completed...</h1>");
//		     String mesg="TRNASECTION COMPLETED";
//		     RequestDispatcher rd=request.getRequestDispatcher("Transection.html");
//		     request.setAttribute("message", mesg);
//		     rd.forward(request, response);
		     }else
		    	 out.println("<h1>Transection failed..</h1>");
		     con.close();
		     
			}catch(Exception e)
			{
				//System.out.println(e);
				e.printStackTrace();
				
			}


	}

}
