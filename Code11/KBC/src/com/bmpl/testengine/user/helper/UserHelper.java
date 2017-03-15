package com.bmpl.testengine.user.helper;

import com.bmpl.testengine.user.dao.UserDAO;
import com.bmpl.testengine.user.dto.UserDTO;

public class UserHelper {
	public String doLogin(UserDTO userDTO){
		// Call DAO 
		UserDAO userDAO = new UserDAO();
		// Get The Array From the DAO
		UserDTO userArray[]  = userDAO.getUsers();
		// Search Userid/Password in Array 
		for(UserDTO currentUser : userArray){
			if(currentUser.getUserid().equals(userDTO.getUserid()) 
					&& currentUser.getPassword().equals(userDTO.getPassword())){
				return "Welcome "+userDTO.getUserid();
			}
			
		}
		return "Invalid Userid or Password ";
		
		
	}
}
