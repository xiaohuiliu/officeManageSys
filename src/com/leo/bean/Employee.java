package com.leo.bean;

import java.sql.Date;

/**
 * @author liuxiaohui
 *
 */
public class Employee {
	private int employeeID; // 员工编号
	private String employeeName; // 员工姓名
	private boolean employeeSex; // 员工性别
	private Date employeeBirthday; // 员工生日
	private String employeePhone; // 员工电话
	private String employeePlace; // 员工住址
	private Date joinTime; // 录入时间
	private String password; // 系统口令
	private boolean isLead; // 是否高层

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
