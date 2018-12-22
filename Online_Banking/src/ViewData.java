

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.MyDao;
import bean.beanBank;

/**
 * Servlet implementation class ViewData
 */
@WebServlet("/ViewData")
public class ViewData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		//PrintWriter out=response.getWriter();
//
//		try {
//               Class.forName("com.mysql.jdbc.Driver");
//			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/OnlineBanking","root","root");
//		  PreparedStatement ps=con.prepareStatement("select * from Account_details");
//		  
//		  ResultSet rs=ps.executeQuery();
//		out.println("<table border=1>");
//		out.println("<tr><th>CID</th><th>NAME</th><th>ADDRESS</th><th>MOBILE NO.</th><th>EMail</th><th>ACCOUNT NO.</th><th>PASSWORD</th><th>BALANCE</th></tr>");
//		while(rs.next())
//		  {   out.println("<tr>");
//		  out.println("<td>"+rs.getInt("cid")+"</td>");
//		  out.println("<td>"+rs.getString("cname")+"</td>");
//		  out.println("<td>"+rs.getString("caddress")+"</td>");
//			  out.println("<td>"+rs.getString("cmobile")+"</td>");
//			  out.println("<td>"+rs.getString("cemail")+"</td>");
//			  out.println("<td>"+rs.getInt("caccount")+"</td>");
//			  out.println("<td>"+rs.getString("cpassword")+"</td>");
//			  out.println("<td>"+rs.getDouble("cbalance")+"</td>");
//			  out.println("</tr>");
//		 }
//		out.println("</table>");
//		}catch(Exception e)
//		{
//			System.out.println(e);
//		}
//

        MyDao obj=new MyDao();
        
        ArrayList<beanBank> list=obj.ShowData();
        
        RequestDispatcher rd=request.getRequestDispatcher("ViewData.jsp");
        request.setAttribute("List", list);
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
