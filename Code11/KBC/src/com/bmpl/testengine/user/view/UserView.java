package com.bmpl.testengine.user.view;

import java.util.Scanner;

import com.bmpl.testengine.question.view.QuestionView;
import com.bmpl.testengine.user.dto.UserDTO;
import com.bmpl.testengine.user.helper.UserHelper;

public class UserView {
	
	public void doLogin(){
		// Step - 1 
		
		// Step 1.1 Take Input
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Userid");
		String userid = scanner.next();
		System.out.println("Enter the Password");
		String password = scanner.next();
		
		// Step - 1.2 Fill the DTO with Input
		UserDTO userDTO = new UserDTO();
		userDTO.setUserid(userid);
		userDTO.setPassword(password);
		
		// Step 1.3 Call the Helper and Pass the DTO
		UserHelper userHelper = new UserHelper();
		String message = userHelper.doLogin(userDTO); // Pass Reference of DTO
		System.out.println(message);
		if(message.toLowerCase().startsWith("welcome")){
			startTest();
		}
		
		
	}
	
	public void startTest(){
		QuestionView questionView = new QuestionView();
		questionView.askQuestion();
		
		
	}

}
