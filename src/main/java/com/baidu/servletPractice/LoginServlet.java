package com.baidu.servletPractice;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		//设置编码格式
		
		//以utf-8的方式去解码request的信息
		request.setCharacterEncoding("utf-8");
		//以utf-8的方式去编码response的信息
		response.setCharacterEncoding("utf-8");

		//所有的获取客户端传过来的参数都是通过这个方式去获取的
		//可以认为客户端传送过来的是n个key-value的键值对
		//request.getParameter("");中的输入的参数就是key的值，返回的是这个key对应的value
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		//与数据库进行交互，查看管理员表中的用户名密码是否可以对应上
		//如果对应上就直接跳到home.jsp
		//如果没有对应上就跳到error.jsp
		
		
		//跳转的实例代码如下
		request.getRequestDispatcher("home.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
