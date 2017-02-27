package com.bmpl.socialnetwork.users.view;

import java.util.Scanner;

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
				if(userDAO.isAuth(userDTO)){
					System.out.println("Welcome "+userid);
				}
				else
				{
					System.out.println("Invalid Userid or Password");
				}
				scanner.close();
				
				//return result;
	}

}
