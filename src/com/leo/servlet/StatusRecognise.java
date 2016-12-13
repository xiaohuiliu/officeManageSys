package com.leo.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.leo.bean.Employee;
import com.leo.dao.EmployeeDAO;
import com.leo.dao.EmployeeDAOFactory;

/**
 * Servlet implementation class StatusRecognise
 */
@WebServlet("/StatusRecognise")
public class StatusRecognise extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StatusRecognise() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext servletContext = getServletContext();//获得ServletContext
		RequestDispatcher dispatcher = null;
		String employeeID = request.getParameter("employeeID"); //接收员工编号参数
		String password = request.getParameter("password"); //接收员工系统口令参数
		if (employeeID == null || "".equals("employeeID")) {
			request.setAttribute("error", "Please input your employeeID!");
			dispatcher = servletContext.getRequestDispatcher("/statusRecognise.jsp"); //如果没有输入员工编号，跳转
		} else {
			if (password == null || "".equals("password")) {
				request.setAttribute("error", "Please input your password!");
				dispatcher = servletContext.getRequestDispatcher("/statusRecognise.jsp"); //如果没有输入系统口令，跳转
			} else {
				EmployeeDAO employeeDAO = EmployeeDAOFactory.getEmployeeDAOInstance();
				Employee employee = employeeDAO.findEmployeeByID(Integer.parseInt(employeeID));
				if (employee == null) {
					request.setAttribute("error", "It's not exist!");
					dispatcher = servletContext.getRequestDispatcher("/statusRecognise.jsp"); //如果输入系统口令错误，跳转
				} else {
					if (password.equals(employee.getPassword())) {
						request.getSession().setAttribute("employee", employee);
						response.sendRedirect("index.jsp");
					} else {
						request.setAttribute("error", "password is wrong!");
						dispatcher = servletContext.getRequestDispatcher("/statusRecognise.jsp"); //如果输入系统口令错误，跳转
					}
				}
			}
		}
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
