package com.test.lesson01;

import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/ex05")
public class PostMethodEx05 extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		
		
		String userId = request.getParameter("userId");
		
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>회원 정보</title></head><body>");
		
		out.print("</body></html>");
	}
}
