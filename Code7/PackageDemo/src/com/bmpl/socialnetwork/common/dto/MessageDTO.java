package com.bmpl.socialnetwork.common.dto;

import java.util.Date;
/**
 * <p>this class contains the Message Information 
 * this will include the status of a message , the message english (text)
 * , contains the login date and time</p>
 * @author amit
 *@since March 2017
 *@version 0.0.1
 */
public class MessageDTO {
	
	private String status;
	
	private String message;
	/**
	 * this field contains userid 
	 */
	private String userid;
	/**
	 * this field contains login date and time
	 */
	private Date loginDate;
	public String getStatus() {
		return status;
	}
	/**
	 * this field contains the status like SUCCESS, FAIL
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	/*
	 * this is comment , not generated in javadoc
	 */
	/**
	 * this field contains the result message
	 * @param message java.lang.String
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public Date getLoginDate() {
		return loginDate;
	}
	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}
	
	
	

}
