package servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AccountDAOImpl;
import entities.Account;

/**
 * Servlet implementation class InsertAccount
 */
@WebServlet("/InsertAccount")
public class InsertAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertAccount() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
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
		a.setPassword(password);
		a.setFullName(fullName);
		a.setGender(gender);
		a.setBirthday(birthday);
		a.setAddress(address);
		a.setEmail(email);
		a.setPhone(phone);
		
		boolean bl = new AccountDAOImpl().insertAccount(a);
		if(bl) {
			request.setAttribute("success", "Insert successfuly!");
			List<Account> account = new AccountDAOImpl().getAccount();
			request.setAttribute("list", account);
			request.getRequestDispatcher("listAccount.jsp").forward(request, response);
		}else {
			request.setAttribute("err", "Insert failed!");
			request.getRequestDispatcher("insertAccount.jsp").forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
