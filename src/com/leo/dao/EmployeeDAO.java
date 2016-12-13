package com.leo.dao;

import java.util.List;

import com.leo.bean.Employee;

/**
 * @author liuxiaohui
 *
 */
public interface EmployeeDAO {
	/**
	 * �������Ա����Ϣ�ķ���
	 * @param employee
	 */
	public void addEmployee(Employee employee);
	
	
	/**
	 * �������Ա����Ϣ�ķ���
	 * @param employee
	 */
	public void updateEmployee(Employee employee);
	
	
	/**
	 * ����ɾ��Ա����Ϣ�ķ���
	 * @param employeeID
	 */
	public void deleteEmplyee(int employeeID);
	
	
	/**
	 * �����ѯ����Ա����Ϣ�ķ���
	 * @return	����Ա����Ϣ�б�
	 */
	public List<Employee> findAllEmployee();
	
	
	/**
	 * �������ID��ѯԱ����Ϣ
	 * @param employeeID
	 * @return	Ա����Ϣ
	 */
	public Employee findEmployeeByID(int employeeID);
}
