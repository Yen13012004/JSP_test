package servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AccountDAOImpl;
import entities.Account;

/**
 * Servlet implementation class UpdateAccount
 */
@WebServlet("/UpdateAccount")
public class UpdateAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateAccount() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		Integer id = Integer.parseInt(request.getParameter("id"));
		 String password = request.getParameter("password"); 
		String fullName = request.getParameter("name");
		boolean gender = Boolean.parseBoolean(request.getParameter("gender"));
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		Date birthday = null;
		try {
			birthday = sf.parse(request.getParameter("birthday"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		
		Account a = new Account();
		a.setId(id);
		 a.setPassword(password); 
		a.setFullName(fullName);
		a.setGender(gender);
		a.setBirthday(birthday);
		a.setAddress(address);
		a.setEmail(email);
		a.setPhone(phone);
		
		boolean bl = new AccountDAOImpl().updateAccount(a);
		if(bl) {
			request.setAttribute("success", "Update successfuly!");
			List<Account> account = new AccountDAOImpl().getAccount();
			request.setAttribute("list", account);
			request.getRequestDispatcher("listAccount.jsp").forward(request, response);
		}else {
			request.setAttribute("err", "Insert failed!");
			request.getRequestDispatcher("updateAccount.jsp").forward(request, response);
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
