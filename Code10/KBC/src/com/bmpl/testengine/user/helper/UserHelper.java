package com.bmpl.testengine.user.helper;

import com.bmpl.testengine.user.dao.UserDAO;
import com.bmpl.testengine.user.dto.UserDTO;

public class UserHelper {
	public String doLogin(UserDTO userDTO){
		UserDAO userDAO = new UserDAO();
		UserDTO userArray[]  = userDAO.getUsers();
		for(UserDTO currentUser : userArray){
			if(currentUser.getUserid().equals(userDTO.getUserid()) 
					&& currentUser.getPassword().equals(userDTO.getPassword())){
				return "Welcome "+userDTO.getUserid();
			}
			
		}
		return "Invalid Userid or Password ";
		
		
	}
}
