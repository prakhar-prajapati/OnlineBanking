

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.MyDao;
import bean.beanBank;

/**
 * Servlet implementation class CreateAccount
 */
@WebServlet("/CreateAccount")
public class CreateAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateAccount() {
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
		String name=request.getParameter("cname");
		String address=request.getParameter("caddress");
		String mob=request.getParameter("cmobile");
		String email=request.getParameter("cemail");
		String acc=request.getParameter("caccount");
		     int account=Integer.parseInt(acc);
		String password=request.getParameter("cpassword");
		String bal=request.getParameter("cbalance");
			double balance=Double.parseDouble(bal);

			
			beanBank e=new beanBank();
			e.setName(name);
			e.setAddress(address);
			e.setMobile(mob);
			e.setEmail(email);
			e.setAccount(account);
			e.setPassword(password);
			e.setBalance(balance);
			
			
			MyDao obj=new MyDao();
			//int x=obj.insert(name,address,mob,email,account,password,balance);
			int x=obj.insert(e);
			if (x==1) 
			{
		         String msg="<h1>Data Inserted Successfully....</h1>";
			     RequestDispatcher rd=request.getRequestDispatcher("CreateAccount.jsp");
			    request.setAttribute("m", msg);
			     rd.forward(request, response);
			}							
				else
				out.println("<h1>FAILED....</h1> ");
			
	}

}
