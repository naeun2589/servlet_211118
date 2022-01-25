package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UrlMappingQuiz01 extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//한글값 깨짐 방지를 위해 응답값을 지정
		response.setCharacterEncoding("utf-8");
		//request -> 가공(서블릿) -> response 의 흐름으로 간다
		response.setContentType("text/plain");
		
		Date today = new Date();
		//임포트 할 때 둘 중에 유틸로 선택
		SimpleDateFormat sdf = new SimpleDateFormat("오늘의 날짜는 yyyy년 MM월 dd일");
		
		PrintWriter out = response.getWriter();
		out.print(sdf.format(today));
	}
}
