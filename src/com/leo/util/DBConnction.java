package com.leo.util;
import java.sql.Connection;			//���ݿ�������
import java.sql.DriverManager;		//����������
import java.sql.PreparedStatement;	//Ԥ������
import java.sql.ResultSet;			//�������	
import java.sql.SQLException;		//SQL�쳣��

/**
 * @author liuxiaohui
 *
 */
public class DBConnction {
	
	/**
	 * ����������
	 * */
	private static final String DBDRIVER = "com.mysql.jdbc.Driver";
	
	/**
	 * �������ݿ��û���
	 * */
	private static final String DBUSER = "";
	
	/**
	 * �������ݿ�����
	 * */
	private static final String DBPASSWORD = "";
	
	private static final String DBURL = "";
	
	/**
	 * ����������ݿ����ӷ���
	 * static���Σ�Ϊ�˵���ʱ�����½�DBConnction����
	 * */
	public static Connection getConnection() {	
		
		Connection conn = null;						//����һ�����Ӷ��� conn
				
		try {			
			Class.forName(DBDRIVER);				//ע������			
			conn = DriverManager.getConnection(DBURL,DBUSER,DBPASSWORD);		//������ݿ����Ӷ���
		} catch (ClassNotFoundException e) {
			e.printStackTrace();					//��׽�������޷��ҵ��쳣
		} catch (SQLException e) {
			e.printStackTrace();					//��׽SQL�쳣
		}
		return conn;		
	}
	
	/**
	 * �����ر����ݿ����ӷ���
	 * */
	public static void close(Connection conn) {
		if (conn != null) {			//������ݿ����Ӷ���Ϊ�գ����ر�
			try {
				conn.close();		//�ر�conn����
			} catch (SQLException e) {
				e.printStackTrace();	//����SQL�쳣
			}
		}
	}
	
	/**
	 * �����ر�Ԥ������󷽷�
	 * */
	public static void close(PreparedStatement pstmt) {
		if (pstmt != null) {			//���pstmt��Ϊ�գ����ر�
			try {
				pstmt.close();		//�ر�pstmt����
			} catch (SQLException e) {
				e.printStackTrace();	//����SQL�쳣
			}
		}
	}
	
	/**
	 * �����رս�������󷽷�
	 * */
	public static void close(ResultSet rs) {
		if (rs != null) {			//���rs��Ϊ�գ����ر�
			try {
				rs.close();		//�ر�rs����
			} catch (SQLException e) {
				e.printStackTrace();	//����SQL�쳣
			}
		}
	}

}
