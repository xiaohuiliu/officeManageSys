package com.leo.bean;

import java.sql.Date;

/**
 * @author liuxiaohui
 *
 */
public class Employee {
	private int employeeID; // Ա�����
	private String employeeName; // Ա������
	private boolean employeeSex; // Ա���Ա�
	private Date employeeBirthday; // Ա������
	private String employeePhone; // Ա���绰
	private String employeePlace; // Ա��סַ
	private Date joinTime; // ¼��ʱ��
	private String password; // ϵͳ����
	private boolean isLead; // �Ƿ�߲�

	/**
	 * @return the employeeID
	 */
	public int getEmployeeID() {
		return employeeID;
	}

	/**
	 * @param employeeID
	 *            the employeeID to set
	 */
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	/**
	 * @return the employeeName
	 */
	public String getEmployeeName() {
		return employeeName;
	}

	/**
	 * @param employeeName
	 *            the employeeName to set
	 */
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	/**
	 * @return the employeeSex
	 */
	public boolean isEmployeeSex() {
		return employeeSex;
	}

	/**
	 * @param employeeSex
	 *            the employeeSex to set
	 */
	public void setEmployeeSex(boolean employeeSex) {
		this.employeeSex = employeeSex;
	}

	/**
	 * @return the employeeBirthday
	 */
	public Date getEmployeeBirthday() {
		return employeeBirthday;
	}

	/**
	 * @param employeeBirthday
	 *            the employeeBirthday to set
	 */
	public void setEmployeeBirthday(Date employeeBirthday) {
		this.employeeBirthday = employeeBirthday;
	}

	/**
	 * @return the employeePhone
	 */
	public String getEmployeePhone() {
		return employeePhone;
	}

	/**
	 * @param employeePhone
	 *            the employeePhone to set
	 */
	public void setEmployeePhone(String employeePhone) {
		this.employeePhone = employeePhone;
	}

	/**
	 * @return the employeePlace
	 */
	public String getEmployeePlace() {
		return employeePlace;
	}

	/**
	 * @param employeePlace
	 *            the employeePlace to set
	 */
	public void setEmployeePlace(String employeePlace) {
		this.employeePlace = employeePlace;
	}

	/**
	 * @return the joinTime
	 */
	public Date getJoinTime() {
		return joinTime;
	}

	/**
	 * @param joinTime
	 *            the joinTime to set
	 */
	public void setJoinTime(Date joinTime) {
		this.joinTime = joinTime;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the isLead
	 */
	public boolean isLead() {
		return isLead;
	}

	/**
	 * @param isLead
	 *            the isLead to set
	 */
	public void setLead(boolean isLead) {
		this.isLead = isLead;
	}

}
