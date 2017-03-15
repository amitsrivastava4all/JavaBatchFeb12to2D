package com.bmpl.testengine.question.helper;

import com.bmpl.testengine.question.dao.QuestionDAO;
import com.bmpl.testengine.question.dto.QuestionDTO;

public class QuestionHelper {
	private int index;
	QuestionDTO questionArray[] ;
	
	public QuestionHelper(){
		index = -1;
		QuestionDAO questionDAO = new QuestionDAO();
		questionArray = questionDAO.getAllQuestions();
	}
	public QuestionDTO getQuestion(){
		QuestionDTO currentQuestion  = null;
		if(index<questionArray.length-1){
			index++;
			 currentQuestion =  questionArray[index];
		
		}
		else
		{
			return null;
		}
		return currentQuestion;
	}
	

}
