package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/ex02") //web.xml에 안하고 이 클래스에서 안에서 바로 하는 방법, 쓰고 임포트 해줘야함(annotation)
public class UrlMappingEx02 extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html"); //플레인이 아니고 html이다. content타입에 따라 브라우저가 해석해서 보여준다
		
		PrintWriter out = response.getWriter();
		
		//1~10까지의 합계: 1+2+3+...+10
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		
		out.print("<html><head><title>합계</title></head><body>");
		//여기가 바디구간
		out.print("합계: <strong>" + sum + "</strong>");
		out.print("</body></html>");
		
	}
}
