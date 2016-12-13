/**
 * 
 */
package com.leo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.leo.bean.Message;
import com.leo.util.DBConnction;
import com.leo.util.Page;

/**
 * @author liuxiaohui
 *
 */
public class MessageDAOImpl implements MessageDAO {

	@Override
	public void addMessage(Message message) {
		Connection connection = DBConnction.getConnection(); // 获取数据库连接对象
		String add_SQL = "insert into tb_message(messageTitle,messageContent,employeeID,publishTime)values(?,?,?,?)";
		PreparedStatement pstmt = null; // 声明预处理对象

		try {
			pstmt = connection.prepareStatement(add_SQL); // 获取预处理对象并赋值
			pstmt.setString(1, message.getMessageTitle()); // 存入消息标题，设置SQL语句第1个参数，即?
			pstmt.setString(2, message.getMessageContent()); // 存入消息内容，设置SQL语句第2个参数，即?
			pstmt.setInt(3, message.getEmployeeID()); // 存入消息发布人ID，设置SQL语句第3个参数，即?
			pstmt.setTimestamp(4, new Timestamp(message.getPublishTime().getTime())); // 存入消息发布时间，设置SQL语句第4个参数，即?
			pstmt.executeUpdate(); // 执行更新
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnction.close(pstmt); // 关闭预处理对象
			DBConnction.close(connection); // 关闭连接对象
		}
	}

	@Override
	public void updateMessage(Message message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteMessage(int messageID) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Message> findAllMessage(Page page) {
		Connection connection = DBConnction.getConnection(); // 获取数据库连接对象
		String findByID_SQL = "select * from tb_message order by  publishTime desc limit ?,?"; // SQL语句
		PreparedStatement pstmt = null; // 声明预处理对象
		ResultSet rs = null; // 声明结果集对象
		List<Message> messages = new ArrayList<Message>();

		try {
			pstmt = connection.prepareStatement(findByID_SQL); // 获取预处理对象并赋值
			pstmt.setInt(1, page.getBeginIndex()); // 设置SQL语句第1个参数，即?
			pstmt.setInt(2, page.getEveryPageCount()); // 设置SQL语句第2个参数，即?
			rs = pstmt.executeQuery(); // 执行查询

			while (rs.next()) {
				Message message = new Message();
				message.setMessageID(rs.getInt(1)); // 设置消息ID
				message.setMessageTitle(rs.getString(2)); // 设置消息标题
				message.setMessageContent(rs.getString(3)); // 设置消息内容
				message.setEmployeeID(rs.getInt(4)); // 设置员工ID
				message.setPublishTime(rs.getTimestamp(5)); // 设置发布时间
				messages.add(message); // 添加到消息列表
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 按以下顺序关闭
			DBConnction.close(rs); // 关闭结果集对象
			DBConnction.close(pstmt); // 关闭预处理对象
			DBConnction.close(connection); // 关闭连接对象
		}
		return messages;
	}

	@Override
	public Message findMessageById(int messageID) {
		Connection connection = DBConnction.getConnection(); // 获取数据库连接对象
		String findByID_SQL = "select * from tb_message where messageID = ?"; // SQL语句
		PreparedStatement pstmt = null; // 声明预处理对象
		ResultSet rs = null; // 声明结果集对象
		Message message = null;

		try {
			pstmt = connection.prepareStatement(findByID_SQL); // 获取预处理对象并赋值
			pstmt.setInt(1, messageID); // 设置SQL语句第1个参数，即?
			rs = pstmt.executeQuery(); // 执行查询

			if (rs.next()) {
				message = new Message();
				message.setMessageID(rs.getInt(1)); // 设置消息ID
				message.setMessageTitle(rs.getString(2)); // 设置消息标题
				message.setMessageContent(rs.getString(3)); // 设置消息内容
				message.setEmployeeID(rs.getInt(4)); // 设置员工ID
				message.setPublishTime(rs.getTimestamp(5)); // 设置发布时间
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 按以下顺序关闭
			DBConnction.close(rs); // 关闭结果集对象
			DBConnction.close(pstmt); // 关闭预处理对象
			DBConnction.close(connection); // 关闭连接对象
		}
		return message;
	}

	@Override
	public int findAllCount() {
		Connection connection = DBConnction.getConnection(); // 获取数据库连接对象
		String findByID_SQL = "select count(*) from tb_message"; // SQL语句
		PreparedStatement pstmt = null; // 声明预处理对象
		ResultSet rs = null; // 声明结果集对象
		int count = 0;

		try {
			pstmt = connection.prepareStatement(findByID_SQL); // 获取预处理对象并赋值
			rs = pstmt.executeQuery(); // 执行查询

			if (rs.next()) {
				count = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 按以下顺序关闭
			DBConnction.close(rs); // 关闭结果集对象
			DBConnction.close(pstmt); // 关闭预处理对象
			DBConnction.close(connection); // 关闭连接对象
		}
		return count;
	}

}
