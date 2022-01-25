package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//어떤 주소로 들어왔을 때 수행을 할거냐
@WebServlet("/servlet/quiz05")
public class GetMethodQuiz05 extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html"); //이렇게 정의하는 건 브라우저에게 html로 내려갈거니까 해석해라 이런 뜻
		
		int number = Integer.valueOf(request.getParameter("number")); //이렇게 꺼내는 값은 스트링으로 받을 수 있다.
		PrintWriter out = response.getWriter();
		out.print("<html><head><title>구구단</title></head><body><ul>");
		
		for (int i = 1; i <= 9; i++) {
			//<li>5 X 1 = 5</li>
			out.print("<li>" + number + " X " + i + " = " + (number * i) + "</li>");
		}
		
		out.print("</ul></body></html>");
		
		
	}
}
