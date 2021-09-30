package by.itacademy.javaenterprise.knyazev;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "secondServlet", value = "/second" )
public class SecondCalculator extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	private long postQuantity = 0;
	private long getQuantity = 0;
	private String threadName;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		getQuantity++;
		
		addAttribute(req);
		req.getRequestDispatcher("/WEB-INF/tmpl/secondCalculator.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		postQuantity++;				
		
		addAttribute(req);
		req.getRequestDispatcher("/WEB-INF/tmpl/secondCalculator.jsp").forward(req, resp);
	}
	
	private long calculate() {
		return postQuantity + getQuantity;
	}
	
	private void addAttribute(HttpServletRequest req) {
		threadName = Thread.currentThread().getName();
		
		req.setAttribute("threadName", threadName);
		req.setAttribute("allQuantity", calculate());
		req.setAttribute("postQuantity", postQuantity);
		req.setAttribute("getQuantity", getQuantity);
	}
	
}
