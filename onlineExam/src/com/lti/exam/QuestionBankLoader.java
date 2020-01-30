package com.lti.exam;

import java.util.ArrayList;
import java.util.List;

public class QuestionBankLoader {
	
	public List<Question> loadQuestionOnJava(){
		
		QuestionBank qb =new QuestionBank();
		qb.addSubject("Java");
		
		Question q=new Question("What is Java ?");
		List<Option> options=new ArrayList<Option>();
		
		options.add(new Option("Java is an OS",false));
		options.add(new Option("Java is Java",false));
		options.add(new Option("Java is Programming Language",true));
		options.add(new Option("Java is Island",false));
		q.setOption(options);
		qb.addQuestion("Java", q);
		
		
		q=new Question("What is Garbage Collector ?");
		options=new ArrayList<Option>();
		options.add(new Option("Gadi Vaala Bhaiya",false));
		options.add(new Option("Muncipal Corporation Cleaners",false));
		options.add(new Option("Space Clearer",true));
		options.add(new Option("Karo Kachra",false));
		q.setOption(options);
		qb.addQuestion("Java", q);
		
		
		q=new Question("What is Contract in Java ?");
		options=new ArrayList<Option>();
		options.add(new Option("Bond",false));
		options.add(new Option("James Bond",false));
		options.add(new Option("Bond Contract",false));
		options.add(new Option("Interface",true));
		q.setOption(options);
		qb.addQuestion("Java", q);
		
		
		q=new Question("What is Bean ?");
		options=new ArrayList<Option>();
		options.add(new Option("Java Bean",false));
		options.add(new Option("Coffee Bean",true));
		options.add(new Option("Java Standard Edition",false));
		options.add(new Option("Programming Language",false));
		q.setOption(options);
		qb.addQuestion("Java", q);
		
		return qb.getQuestionsFor("Java");
	}

}
