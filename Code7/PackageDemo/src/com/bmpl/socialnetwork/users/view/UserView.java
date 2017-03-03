package com.bmpl.socialnetwork.users.view;

import java.util.Scanner;

import com.bmpl.socialnetwork.common.dto.MessageDTO;
import com.bmpl.socialnetwork.post.view.PostView;
import com.bmpl.socialnetwork.users.dao.UserDAO;
import com.bmpl.socialnetwork.users.dto.UserDTO;

public class UserView {

	public void isAuth(){
		boolean result = false;
			Scanner scanner = new Scanner(System.in);
				System.out.println("Enter the Userid");
				String userid = scanner.next();
				System.out.println("Enter the Password");
				String password = scanner.next();
				UserDTO userDTO = new UserDTO();
				userDTO.setUserid(userid);
				userDTO.setPassword(password);
				UserDAO userDAO = new UserDAO();
				MessageDTO messageDTO = userDAO.isAuth(userDTO);
				if(messageDTO.getStatus().equals("SUCCESS")){
					System.out.println(messageDTO.getMessage()
							+" "+messageDTO.getUserid()+
							messageDTO.getLoginDate());
				// Calling Post
					PostView postView = new PostView();
					postView.printPost(userid);
					
				}
				else
				{
					System.out.println(messageDTO.getMessage());
				}
				scanner.close();
				
				//return result;
	}

}
