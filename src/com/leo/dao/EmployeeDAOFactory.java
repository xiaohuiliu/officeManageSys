package com.leo.dao;

/**
 * @author liuxiaohui
 *
 */
public class EmployeeDAOFactory {
	public static EmployeeDAO getEmployeeDAOInstance() { // ��������
		return new EmployeeDAOImpl(); //����DAOʵ����ʵ��
	}
}
