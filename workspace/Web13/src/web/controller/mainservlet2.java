package web.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/main")
public class mainservlet2 extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}
	
	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String sign=request.getParameter("sign");
		PrintWriter out=response.getWriter();
		
		if(sign==null) {
			return ;
		}else if(sign.equals("login")) {
			System.out.println("로그인창 진입 성공");
			String id=request.getParameter("id");
			String pw=request.getParameter("pw");
			out.write(id+":"+pw);
		}else if(sign.equals("memberInsert")) {
			System.out.println("맴버 인설트 진입 성공");
			String id=request.getParameter("id");
			String pw=request.getParameter("pw");
			String name=request.getParameter("name");
			String [] all_subject=request.getParameterValues("subject");
			out.write(id+":"+pw+":"+name+"<br>");
			for(String s:all_subject) {
				out.write(s+" &nbsp; ");
			}
		}else if(sign.equals("memberInsert2")) {
			Enumeration totalNames=request.getParameterNames();
			String name=(String)totalNames.nextElement();
			String []values=request.getParameterValues(name);
			for(String value:values) {
				out.append(name+" : " +value);
			}
		}
	}
}
}