package com.test.lesson01;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UrlMappingEx01 extends HttpServlet {
	//동작하려면 서브릿으로 반드시 상속받아야 함
	//오버라이드 어노테이션 반드시 해주기
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//한글 깨짐 방지
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/plain");
		
		PrintWriter out = response.getWriter();
		//빨간줄 뜨면 예외처리 첫번째 있는거 클릭해서 위로 익셉션 위로 던져버림..에러나면 시스템에서 알아서 해
		out.println("안녕하세요");
		
		//자바코드 만질 때는 서버를 항상 꺼줘야함.
		
		Date now = new Date();
		out.println(now);
		
		//내가 원하는 형태로 출력하고 싶으면 formater 라는 걸 사용해야 함
		//formater : jdk에 들어있음
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
		out.println(sdf.format(now));
	}
}
