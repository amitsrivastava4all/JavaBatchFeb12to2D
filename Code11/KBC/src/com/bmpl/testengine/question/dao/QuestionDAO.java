package com.bmpl.testengine.question.dao;

import com.bmpl.testengine.question.dto.QuestionDTO;

public class QuestionDAO {
	
	public QuestionDTO[] getAllQuestions(){
		
		QuestionDTO questionArray[] = new  QuestionDTO[2];
		// 1st Question
		QuestionDTO questionDTO = new QuestionDTO();
		questionDTO.setId(1);
		questionDTO.setQuestion("JVM Stands For");
		String options [] = {"a) Java Virtual Machine" , "b) Java Vital Machine","c) Java Virtual Mechanisum","d) None of These"};
		questionDTO.setOptions(options);
		questionDTO.setRightAnswer("a");
		questionDTO.setWeight(5);
		questionArray[0] = questionDTO;
		// Second Question
		questionDTO = new QuestionDTO();
		questionDTO.setId(2);
		questionDTO.setQuestion("JRE Stands For");
		String options2 [] = {"a) Java Run Enviornment" , "b) Java Runtime Enviornment","c) Both a and b","d) None of These"};
		questionDTO.setOptions(options2);
		questionDTO.setRightAnswer("b");
		questionDTO.setWeight(5);
		questionArray[1] = questionDTO;
		return questionArray;
	}

}
