package com.leo.dao;

/**
 * @author liuxiaohui
 *
 */
public class EmployeeDAOFactory {
	public static EmployeeDAO getEmployeeDAOInstance() { // 工厂方法
		return new EmployeeDAOImpl(); //返回DAO实现类实例
	}
}
