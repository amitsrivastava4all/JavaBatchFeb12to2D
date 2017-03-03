package com.bmpl.socialnetwork.post.view;

import com.bmpl.socialnetwork.post.dao.PostDAO;
import com.bmpl.socialnetwork.post.dto.PostDTO;

public class PostView {
	private void line(){
		System.out.println("******************************************");
	}
	public void printPost(String userid){
		PostDAO postDAO = new PostDAO();
		PostDTO postArray[] = postDAO.getAllPost(userid);
		for(PostDTO postDTO : postArray){
			line();
			System.out.println(postDTO.getMessage());
			System.out.println("userid "+postDTO.getUserid());
			System.out.println(postDTO.getLikes()+" likes");
			System.out.println(postDTO.getViews()+" views");
			System.out.println(postDTO.getDate());
			line();
		}
	}
}
