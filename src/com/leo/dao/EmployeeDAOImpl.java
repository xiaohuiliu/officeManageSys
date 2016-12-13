package com.leo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.leo.bean.Employee;
import com.leo.util.DBConnction;

/**
 * @author liuxiaohui
 *
 */
public class EmployeeDAOImpl implements EmployeeDAO {

	@Override
	public void addEmployee(Employee employee) {
		Connection connection = DBConnction.getConnection(); // 获取数据库连接对象
		String add_SQL = "insert into tb_Employee(employeeName,employeeSex,employeeBirthday,employeePhone,employeePlace,joinTime,password,isLead)values(?,?,?,?,?,?,?,?)";
		PreparedStatement pstmt = null; // 声明预处理对象

		try {
			pstmt = connection.prepareStatement(add_SQL); // 获取预处理对象并赋值
			pstmt.setString(1, employee.getEmployeeName()); // 存入员工姓名，SQL语句第1个参数
			pstmt.setBoolean(2, employee.isEmployeeSex()); // 存入员工性别，SQL语句第2个参数
			pstmt.setDate(3, employee.getEmployeeBirthday()); // 存入员工出生日期，SQL语句第3个参数
			pstmt.setString(4, employee.getEmployeePhone()); // 存入员工电话，SQL语句第4个参数
			pstmt.setString(5, employee.getEmployeePlace()); // 存入员工住址，SQL语句第5个参数
			pstmt.setDate(6, employee.getJoinTime()); // 存入员工加入时间，SQL语句第6个参数
			pstmt.setString(7, employee.getPassword()); // 存入员工系统口令，SQL语句第7个参数
			pstmt.setBoolean(8, employee.isLead()); // 存入员工级别，SQL语句第8个参数
			pstmt.executeQuery(); // 执行更新
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnction.close(pstmt); // 关闭预处理对象
			DBConnction.close(connection); // 关闭连接对象
		}
	}

	@Override
	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteEmplyee(int employeeID) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Employee> findAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee findEmployeeByID(int employeeID) {
		Connection connection = DBConnction.getConnection(); // 获取数据库连接对象
		String findByID_SQL = "select * from tb_employee where employeeID = ?"; // SQL语句
		PreparedStatement pstmt = null; // 声明预处理对象
		ResultSet rs = null; // 声明结果集对象
		Employee employee = null;

		try {
			pstmt = connection.prepareStatement(findByID_SQL); // 获得预处理对象并赋值
			pstmt.setInt(1, employeeID); // SQL语句第一个参数，即?
			rs = pstmt.executeQuery(); // 执行查询

			if (rs.next()) {
				employee = new Employee();
				employee.setEmployeeID(rs.getInt(1)); // 根据employeeID获取到的员工ID
				employee.setEmployeeName(rs.getString(2)); // 根据employeeID获取到的员工姓名
				employee.setEmployeeSex(rs.getBoolean(3)); // 根据employeeID获取到的员工性别
				employee.setEmployeeBirthday(rs.getDate(4)); // 根据employeeID获取到的员工出生日期
				employee.setEmployeePhone(rs.getString(5)); // 根据employeeID获取到的员工电话
				employee.setEmployeePlace(rs.getString(6)); // 根据employeeID获取到的员工住址
				employee.setJoinTime(rs.getDate(7)); // 根据employeeID获取到的员工加入时间
				employee.setPassword(rs.getString(8)); // 根据employeeID获取到的员工系统口令
				employee.setLead(rs.getBoolean(9)); // 根据employeeID获取到的员工是否高层
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 按以下顺序关闭
			DBConnction.close(rs); // 关闭结果集对象
			DBConnction.close(pstmt); // 关闭预处理对象
			DBConnction.close(connection); // 关闭连接对象
		}
		return employee;
	}

}
