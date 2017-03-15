package com.bmpl.testengine.user.dao;

import com.bmpl.testengine.user.dto.UserDTO;

public class UserDAO {

	// Prepare 5 Records and Return to Helper
	public UserDTO[] getUsers(){
		
		// Array of Objects
		UserDTO [] userArray = new UserDTO[5];
		
		for(int i = 0 ; i<userArray.length; i++){
			UserDTO userDTO = new UserDTO();
			userDTO.setUserid("amit"+i);
			userDTO.setPassword("12"+i);
			userArray[i]= userDTO;
		}
		return userArray;
		
//		UserDTO userDTO = new UserDTO();
//		userDTO.setUserid("amit");
//		userDTO.setPassword("123");
//		userArray[0] = userDTO;
//		
//		UserDTO userDTO2 = new UserDTO();
//		userDTO2.setUserid("ram");
//		userDTO2.setPassword("123");
//		userArray[1] = userDTO2;
		
		
	}
	
}
