package com.leo.dao;

import java.util.List;

import com.leo.bean.Employee;

/**
 * @author liuxiaohui
 *
 */
public interface EmployeeDAO {
	/**
	 * 定义添加员工信息的方法
	 * @param employee
	 */
	public void addEmployee(Employee employee);
	
	
	/**
	 * 定义更新员工信息的方法
	 * @param employee
	 */
	public void updateEmployee(Employee employee);
	
	
	/**
	 * 定义删除员工信息的方法
	 * @param employeeID
	 */
	public void deleteEmplyee(int employeeID);
	
	
	/**
	 * 定义查询所有员工信息的方法
	 * @return	所有员工信息列表
	 */
	public List<Employee> findAllEmployee();
	
	
	/**
	 * 定义根据ID查询员工信息
	 * @param employeeID
	 * @return	员工信息
	 */
	public Employee findEmployeeByID(int employeeID);
}
