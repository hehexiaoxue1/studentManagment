package com.baidu.servletPractice;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListStuedentServlet
 */
@WebServlet("/ListStuedentServlet")
public class ListStuedentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListStuedentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置编码
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		//与数据库进行交互，把所有的学生都查询出来
		//并把所有查询出来的学生放到一个学生列表里面
		
		//部分示例代码如下
		
		/**
		 * List<Student> studentList = new ArrayList<Student>();
		 * ResuletSet rs = stmt.executeQuery("select * from students");
		 * while(rs.next()){
		 * 		Student s = new Student();
		 * 		s.setId(rs.getInt(1));
		 * 		s.setName(rs.getString(2));
		 * 		s.setSex(rs.getByte(3));
		 * 		rs.add(s);
		 * }
		 */
		
		//把studentList传递给studentList.jsp
//		request.setAttribute("students", studentList);
		
		//把请求传递给studentList.jsp，让它去完成html的编写工作
		
		request.getRequestDispatcher("studentList.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
