package com.bmpl.socialnetwork.users.dao;

import java.util.Date;

import com.bmpl.socialnetwork.common.dto.MessageDTO;
import com.bmpl.socialnetwork.users.dto.UserDTO;

/*
 * DAO - Data Access Object
 * this will contains only DB Related Stuff
 */
public class UserDAO {
	
	private UserDTO[] prepare(){
//		5 Users (Array)
		//String users[] = new String[5];
		//String pwd[] = new String[5];
		//String [][] userpwd = new String[5][3];
		UserDTO userArray[] = new UserDTO[5];
		for(int i = 0 ; i<userArray.length; i++){
		UserDTO userDTO = new UserDTO();
		userDTO.setUserid("amit"+(i+1));
		userDTO.setPassword("123"+i);
		userArray[i] = userDTO;
		}
		return userArray;
	}
	
	public MessageDTO isAuth(UserDTO userDTO){
		MessageDTO messageDTO =new MessageDTO();
		UserDTO userArray[] = prepare();
		//boolean isFound = false;
		for(UserDTO userDTOObject : userArray){
			if(userDTO.getUserid().equals(userDTOObject.getUserid()) 
					&& userDTO.getPassword()
					.equals(userDTOObject.getPassword())){
				//isFound = true;
				Date date = new Date();
				messageDTO.setLoginDate(date);
				messageDTO.setMessage("Welcome ");
				messageDTO.setStatus("SUCCESS");
				messageDTO.setUserid(userDTO.getUserid());
				return messageDTO;
				//break;
				//return true;
			
		}
		}
		
		messageDTO.setMessage("Invalid Userid or Password ");
		messageDTO.setStatus("FAIL");
		
		return messageDTO;
		//return false;
//		if(userDTO.getUserid().equals(userDTO.getPassword())){
//			return true;
//		}
//		else
//		{
//			return false;
//		}
	}
	

}
