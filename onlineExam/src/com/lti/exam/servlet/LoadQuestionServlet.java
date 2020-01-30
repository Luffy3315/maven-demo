package com.lti.exam.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lti.exam.Option;
import com.lti.exam.Question;
import com.lti.exam.QuestionBankLoader;

/**
 * Servlet implementation class LoadQuestionServlet
 */
@WebServlet("/LoadQuestionServlet")
public class LoadQuestionServlet extends HttpServlet {
	//private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		QuestionBankLoader qbl=new QuestionBankLoader();
		List<Question> questions=qbl.loadQuestionOnJava();
		HttpSession session=request.getSession();
		
		//=============Integer Object========================
		Integer qNo=(Integer)session.getAttribute("qNo");
		
		//=============If Else Block=========================
		if(qNo==null)
			qNo=0;
		 
		if(qNo < questions.size()){
			Question q= questions.get(qNo++);
			session.setAttribute("currentQs", q);
			session.setAttribute("qNo", qNo);
			response.sendRedirect("showQuestion.jsp");
		}
		else
			response.sendRedirect("score.jsp");
		
	}

	
}
