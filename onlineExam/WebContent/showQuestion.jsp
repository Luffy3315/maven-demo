<%@page import="com.lti.exam.Option"%>
<%@page import="java.util.List"%>
<%@page import="com.lti.exam.Question"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>UniPune</title>
</head>
<body>

<form action="LoadQuestionServlet" method="get">
<%
	Question q=(Question) session.getAttribute("currentQs");
	
%>

<h3>Q.<%= session.getAttribute("qNo") %> <%= q.getQuestion() %></h3>

<%
	List<Option> ops=q.getOption();
	int opNo=0;
	for(Option op : ops){
%>

	<input type="radio" name="option" value="<%= opNo++ %>"><h5><%= op.getOption() %></h5>

<%
	}
%>
<button type="Submit">Submit</button>
<!--<a href="LoadQuestionServlet">continue</a>-->
</form>
</body>
</html>