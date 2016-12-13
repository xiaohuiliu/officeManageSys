package com.leo.bean;

import java.util.Date;

/**
 * @author liuxiaohui
 *
 */
public class Criticism {
	private int criticismID; //批复编号
	private String criticismContent; //批复内容
	private int employeeID; //批复人编号
	private Date criticismTime; //批复时间
	private int messageID; //消息ID
	
	/**
	 * @return the criticismID
	 */
	public int getCriticismID() {
		return criticismID;
	}
	/**
	 * @param criticismID the criticismID to set
	 */
	public void setCriticismID(int criticismID) {
		this.criticismID = criticismID;
	}
	/**
	 * @return the criticismContent
	 */
	public String getCriticismContent() {
		return criticismContent;
	}
	/**
	 * @param criticismContent the criticismContent to set
	 */
	public void setCriticismContent(String criticismContent) {
		this.criticismContent = criticismContent;
	}
	/**
	 * @return the employeeID
	 */
	public int getEmployeeID() {
		return employeeID;
	}
	/**
	 * @param employeeID the employeeID to set
	 */
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	/**
	 * @return the criticismTime
	 */
	public Date getCriticismTime() {
		return criticismTime;
	}
	/**
	 * @param criticismTime the criticismTime to set
	 */
	public void setCriticismTime(Date criticismTime) {
		this.criticismTime = criticismTime;
	}
	/**
	 * @return the messageID
	 */
	public int getMessageID() {
		return messageID;
	}
	/**
	 * @param messageID the messageID to set
	 */
	public void setMessageID(int messageID) {
		this.messageID = messageID;
	}
}
