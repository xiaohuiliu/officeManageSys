package com.leo.util;
import java.sql.Connection;			//数据库连接类
import java.sql.DriverManager;		//驱动管理类
import java.sql.PreparedStatement;	//预处理类
import java.sql.ResultSet;			//结果集类	
import java.sql.SQLException;		//SQL异常类

/**
 * @author liuxiaohui
 *
 */
public class DBConnction {
	
	/**
	 * 驱动类类名
	 * */
	private static final String DBDRIVER = "com.mysql.jdbc.Driver";
	
	/**
	 * 连接数据库用户名
	 * */
	private static final String DBUSER = "";
	
	/**
	 * 连接数据库密码
	 * */
	private static final String DBPASSWORD = "";
	
	private static final String DBURL = "";
	
	/**
	 * 创建获得数据库连接方法
	 * static修饰：为了调用时不用新建DBConnction对象
	 * */
	public static Connection getConnection() {	
		
		Connection conn = null;						//声明一个连接对象 conn
				
		try {			
			Class.forName(DBDRIVER);				//注册驱动			
			conn = DriverManager.getConnection(DBURL,DBUSER,DBPASSWORD);		//获得数据库连接对象
		} catch (ClassNotFoundException e) {
			e.printStackTrace();					//捕捉驱动类无法找到异常
		} catch (SQLException e) {
			e.printStackTrace();					//捕捉SQL异常
		}
		return conn;		
	}
	
	/**
	 * 创建关闭数据库连接方法
	 * */
	public static void close(Connection conn) {
		if (conn != null) {			//如果数据库连接对象不为空，即关闭
			try {
				conn.close();		//关闭conn对象
			} catch (SQLException e) {
				e.printStackTrace();	//捕获SQL异常
			}
		}
	}
	
	/**
	 * 创建关闭预处理对象方法
	 * */
	public static void close(PreparedStatement pstmt) {
		if (pstmt != null) {			//如果pstmt不为空，即关闭
			try {
				pstmt.close();		//关闭pstmt对象
			} catch (SQLException e) {
				e.printStackTrace();	//捕获SQL异常
			}
		}
	}
	
	/**
	 * 创建关闭结果集对象方法
	 * */
	public static void close(ResultSet rs) {
		if (rs != null) {			//如果rs不为空，即关闭
			try {
				rs.close();		//关闭rs对象
			} catch (SQLException e) {
				e.printStackTrace();	//捕获SQL异常
			}
		}
	}

}
