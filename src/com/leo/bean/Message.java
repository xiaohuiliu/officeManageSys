package com.leo.bean;

import java.sql.Timestamp;

/**
 * @author liuxiaohui
 *
 */
public class Message {
	private int messageID; //消息编号
	private String messageTitle; //消息标题
	private String messageContent; //消息内容
	private int employeeID; //发布人编号
	private Timestamp publishTime; //发布时间
	
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
	/**
	 * @return the messageTitle
	 */
	public String getMessageTitle() {
		return messageTitle;
	}
	/**
	 * @param messageTitle the messageTitle to set
	 */
	public void setMessageTitle(String messageTitle) {
		this.messageTitle = messageTitle;
	}
	/**
	 * @return the messageContent
	 */
	public String getMessageContent() {
		return messageContent;
	}
	/**
	 * @param messageContent the messageContent to set
	 */
	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
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
	 * @return the publishTime
	 */
	public Timestamp getPublishTime() {
		return publishTime;
	}
	/**
	 * @param publishTime the publishTime to set
	 */
	public void setPublishTime(Timestamp publishTime) {
		this.publishTime = publishTime;
	}
}
