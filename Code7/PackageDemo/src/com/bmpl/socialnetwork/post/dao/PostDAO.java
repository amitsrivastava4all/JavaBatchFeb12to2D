package com.bmpl.socialnetwork.post.dao;

import java.util.Date;

import com.bmpl.socialnetwork.post.dto.PostDTO;

public class PostDAO {
	public PostDTO[] getAllPost(String userid){
		PostDTO postArray[] = new PostDTO[5];
		for(int i = 0; i<postArray.length; i++){
		PostDTO postDTO =new PostDTO();
		
		String feeling ="";
		switch(i){
		case 0 :
			feeling="awesome";
			break;
		case 1:
			feeling ="happy";
			break;
		case 2:
			feeling = "sad";
			break;
		case 3:
			feeling = "tired";
			break;
		case 4:
			feeling = "great";
			break;
		}
		postDTO.setMessage("Feeling "+feeling);
		postDTO.setDate(new Date());
		postDTO.setLikes(3+i);
		postDTO.setViews(10+i);
		postDTO.setUserid(userid);
		postArray[i] = postDTO;
		}
		return postArray;
	}
}
