package ee.itcollege.i377.praktikum1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReloadCounterServlet
 */
public class ReloadCounterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ReloadCounterServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getOutputStream().write("Hello smth else".getBytes());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
