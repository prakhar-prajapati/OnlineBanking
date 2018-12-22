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
 * Servlet implementation class CheckBalance
 */
@WebServlet("/CheckBalance")
public class CheckBalance extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckBalance() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		Integer s=(Integer)session.getAttribute("msg");
		// jdbc code

		try{
               Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/OnlineBanking","root","root");
		  PreparedStatement ps=con.prepareStatement("select cname,caccount,cbalance from Account_details where caccount=?");
		  ps.setInt(1, s);
		  ResultSet rs=ps.executeQuery();

		  
          out.println("<h1>WELLCOME="+s+"</h1>");
		  
		  
		  out.println("<table border=1>");
		out.println("<tr><th>NAME</th><th>ACCOUNT NO.</th><th>BALANCE</th></tr>");
		while(rs.next())
		  {   out.println("<tr>");
		  out.println("<td>"+rs.getString("cname")+"</td>");
		    out.println("<td>"+rs.getInt("caccount")+"</td>");
			  out.println("<td>"+rs.getDouble("cbalance")+"</td>");
			  out.println("</tr>");
		 }
		out.println("</table>");
		}catch(Exception e)
		{
			out.println(e);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
