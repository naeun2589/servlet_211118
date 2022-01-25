package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/ex03")
public class GetMethodEx03 extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/plain");
		
		PrintWriter out = response.getWriter();
		//out.println("get method 호출");
		
		//JSON(Javascript Object Notation)으로 response 구성하기
		//{"user_id":"silverlining", "name":"여나은", "age":20} 이런 형태로 제이슨을 만들어서 응답값을 내려줄 것
		//따옴표 안에 따옴표 들어가면 이게 무슨 따옴표인지 모르니까 \"를 사용해준다.
		
		out.print("{\"user_id\":\""+ userId + "\", \"name\":\""+ name + "\", \"age\":" + age + "}");
		
		
		
	}

}
