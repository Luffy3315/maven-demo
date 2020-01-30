package com.lti.exam.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lti.exam.Option;
import com.lti.exam.Question;

import sun.print.resources.serviceui_es;

@WebServlet("/CalculatorScoreServlet")
public class CalculatorScoreServlet extends HttpServlet {
	//private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//=====================Http Session=====================
		HttpSession session=request.getSession();
		Question q=(Question)session.getAttribute("currentQs");
		
		//=====================Integer Object===================
		int opNo =Integer.parseInt(request.getParameter("op"));
		
		Option selected=q.getOption().get(opNo);
		Integer score=(Integer)session.getAttribute("score");
		
		//=====================If Block==========================
		if(score==null)
			score=0;
		
		if(selected.isRightAnswer())
			score++;
		session.setAttribute("score", score);
		
		response.sendRedirect("LoadQuestionServlet");
	}

}
