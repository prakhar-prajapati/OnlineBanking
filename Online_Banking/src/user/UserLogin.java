package user;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class UserLogin
 */
@WebServlet("/UserLogin")
public class UserLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String u=request.getParameter("uid");
		String p=request.getParameter("upass");
		
		//Session create
		
		
		// jdbc code
				try {
					Class.forName("com.mysql.jdbc.Driver");

					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OnlineBanking", "root", "root");
		
					// prepared Statement
					PreparedStatement ps = con.prepareStatement("Select * from account_details where caccount=? and cpassword=?");
					ps.setString(1, u);
					ps.setString(2, p);
					ResultSet rs=ps.executeQuery();
					int x = 0;
					if (rs.next())
						x = 1;
					if (x == 1) 
					{  
						HttpSession session=request.getSession();
						session.setAttribute("msg", Integer.parseInt(u));
//
//						out.println("<h1>Login ... </h1>");
//						
//						out.println("<a href=CheckBalance >SHOW ACCOUNT BALANCE</a>");
//						out.println("<br/>");
//						out.println("<a href=Transection.html >TANSFER MONEY</a>");
                        response.sendRedirect("UserHome.jsp");
						}
						else
							{
							HttpSession session=request.getSession();
							session.setAttribute("msg","WRONG PASSWORD...TRY AGAIN.");
							response.sendRedirect("index.jsp");
							}	
					}catch(ClassNotFoundException | SQLException e)
					{
						out.println(e);
					}
				
	}

}
