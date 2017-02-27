package com.bmpl.socialnetwork.users.dao;

import com.bmpl.socialnetwork.users.dto.UserDTO;

/*
 * DAO - Data Access Object
 * this will contains only DB Related Stuff
 */
public class UserDAO {
	
//	private void prepare(){
//		5 Users (Array)
//		
//	}
	
	public boolean isAuth(UserDTO userDTO){
		if(userDTO.getUserid().equals(userDTO.getPassword())){
			return true;
		}
		else
		{
			return false;
		}
	}
	

}
