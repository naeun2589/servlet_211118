package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UrlMappingQuiz02 extends HttpServlet {

	@Override //부모에 있는 메소드를 오버라이드해서 재정의
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		//응답값 지정
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/plain");
		
		Date time = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("현재 시간은 H시 m분 s초 입니다.");
		
		PrintWriter out = response.getWriter();
		out.print(sdf.format(time));
	}
}
