package com.bmpl.testengine.question.view;

import java.util.Scanner;

import com.bmpl.testengine.question.dto.QuestionDTO;
import com.bmpl.testengine.question.dto.ReportDTO;
import com.bmpl.testengine.question.helper.QuestionHelper;

public class QuestionView {
	QuestionHelper helper = new QuestionHelper();
	int totalScore = 0;
	int index = 0;
	ReportDTO reportArray [] = new ReportDTO[2];
	public void askQuestion(){
		int currentScore = 0;
		QuestionDTO currentQuestion = helper.getQuestion();
		if(currentQuestion==null){
			System.out.println("Quiz Over...");
			printQuizReport();
			System.exit(0);
		}
		else
		{
			System.out.println("Q"+currentQuestion.getId()+" "+currentQuestion.getQuestion());
			for(String option : currentQuestion.getOptions()){
				System.out.println(option);
			}
			System.out.println("Enter Your Answer...");
			Scanner scanner = new Scanner(System.in);
			String yourAns= scanner.next();
			if(yourAns.equals(currentQuestion.getRightAnswer())){
				currentScore = currentQuestion.getWeight();
				totalScore = totalScore + currentScore;
				System.out.println("Correct Answer...");
			}
			else
			{
				System.out.println("Incorrect Answer");
			}
			ReportDTO reportDTO = new ReportDTO();
			reportDTO.setQid(currentQuestion.getId());
			reportDTO.setQname(currentQuestion.getQuestion());
			reportDTO.setRans(currentQuestion.getRightAnswer());
			reportDTO.setYourAns(yourAns);
			reportDTO.setScore(currentScore);
			reportArray[index ]= reportDTO;
			index++;
			//System.out.println("Total Score is "+totalScore);
			
			askQuestion();
		}
	}
	private void printQuizReport(){
		int totalScore =0;
		System.out.println("QUIZ SUMMARY REPORT .....................");
		System.out.println("*****************************************");
		for(ReportDTO reportDTO : reportArray){
			totalScore = totalScore + reportDTO.getScore();
			System.out.println("Q" +reportDTO.getQid()+" "+reportDTO.getQname()
			+"\nRight Answer "+reportDTO.getRans()+"\nYour Answer "+reportDTO.getYourAns()
			+"\nScore "+reportDTO.getScore());
			System.out.println("**********************************************");
		}
		System.out.println("TOTAL SCORE IS :: "+totalScore);
	}
}
