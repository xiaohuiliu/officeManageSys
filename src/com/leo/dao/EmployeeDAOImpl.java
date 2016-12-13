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
		Connection connection = DBConnction.getConnection(); // ��ȡ���ݿ����Ӷ���
		String add_SQL = "insert into tb_Employee(employeeName,employeeSex,employeeBirthday,employeePhone,employeePlace,joinTime,password,isLead)values(?,?,?,?,?,?,?,?)";
		PreparedStatement pstmt = null; // ����Ԥ�������

		try {
			pstmt = connection.prepareStatement(add_SQL); // ��ȡԤ������󲢸�ֵ
			pstmt.setString(1, employee.getEmployeeName()); // ����Ա��������SQL����1������
			pstmt.setBoolean(2, employee.isEmployeeSex()); // ����Ա���Ա�SQL����2������
			pstmt.setDate(3, employee.getEmployeeBirthday()); // ����Ա���������ڣ�SQL����3������
			pstmt.setString(4, employee.getEmployeePhone()); // ����Ա���绰��SQL����4������
			pstmt.setString(5, employee.getEmployeePlace()); // ����Ա��סַ��SQL����5������
			pstmt.setDate(6, employee.getJoinTime()); // ����Ա������ʱ�䣬SQL����6������
			pstmt.setString(7, employee.getPassword()); // ����Ա��ϵͳ���SQL����7������
			pstmt.setBoolean(8, employee.isLead()); // ����Ա������SQL����8������
			pstmt.executeQuery(); // ִ�и���
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnction.close(pstmt); // �ر�Ԥ�������
			DBConnction.close(connection); // �ر����Ӷ���
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
		Connection connection = DBConnction.getConnection(); // ��ȡ���ݿ����Ӷ���
		String findByID_SQL = "select * from tb_employee where employeeID = ?"; // SQL���
		PreparedStatement pstmt = null; // ����Ԥ�������
		ResultSet rs = null; // �������������
		Employee employee = null;

		try {
			pstmt = connection.prepareStatement(findByID_SQL); // ���Ԥ������󲢸�ֵ
			pstmt.setInt(1, employeeID); // SQL����һ����������?
			rs = pstmt.executeQuery(); // ִ�в�ѯ

			if (rs.next()) {
				employee = new Employee();
				employee.setEmployeeID(rs.getInt(1)); // ����employeeID��ȡ����Ա��ID
				employee.setEmployeeName(rs.getString(2)); // ����employeeID��ȡ����Ա������
				employee.setEmployeeSex(rs.getBoolean(3)); // ����employeeID��ȡ����Ա���Ա�
				employee.setEmployeeBirthday(rs.getDate(4)); // ����employeeID��ȡ����Ա����������
				employee.setEmployeePhone(rs.getString(5)); // ����employeeID��ȡ����Ա���绰
				employee.setEmployeePlace(rs.getString(6)); // ����employeeID��ȡ����Ա��סַ
				employee.setJoinTime(rs.getDate(7)); // ����employeeID��ȡ����Ա������ʱ��
				employee.setPassword(rs.getString(8)); // ����employeeID��ȡ����Ա��ϵͳ����
				employee.setLead(rs.getBoolean(9)); // ����employeeID��ȡ����Ա���Ƿ�߲�
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// ������˳��ر�
			DBConnction.close(rs); // �رս��������
			DBConnction.close(pstmt); // �ر�Ԥ�������
			DBConnction.close(connection); // �ر����Ӷ���
		}
		return employee;
	}

}
