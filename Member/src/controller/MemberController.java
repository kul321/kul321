package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.face.MemberService;
import service.impl.MemberServiceImpl;


@WebServlet("/member/joinForm")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private MemberService memberservice = new MemberServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("MemberController [GET] - 요청 성공");
		
	req.getRequestDispatcher("/WEB-INF/views/member/joinForm.jsp")
		.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("요청성공");
	req.getRequestDispatcher("/WEB-INF/views/member/result.jsp")
		.forward(req, resp);
	}
}
