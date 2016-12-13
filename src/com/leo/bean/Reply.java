package com.leo.bean;

import java.util.Date;

/**
 * @author liuxiaohui
 *
 */
public class Reply {
	private int replyID; //�ظ����
	private String replyContent; //�ظ�����
	private int employeeID; //�ظ��˱��
	private Date replyTime; //�ظ�ʱ��
	private int messageID; //��Ϣ���
	
	/**
	 * @return the replyID
	 */
	public int getReplyID() {
		return replyID;
	}
	/**
	 * @param replyID the replyID to set
	 */
	public void setReplyID(int replyID) {
		this.replyID = replyID;
	}
	/**
	 * @return the replyContent
	 */
	public String getReplyContent() {
		return replyContent;
	}
	/**
	 * @param replyContent the replyContent to set
	 */
	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
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
	 * @return the replyTime
	 */
	public Date getReplyTime() {
		return replyTime;
	}
	/**
	 * @param replyTime the replyTime to set
	 */
	public void setReplyTime(Date replyTime) {
		this.replyTime = replyTime;
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
