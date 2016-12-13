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
		Connection connection = DBConnction.getConnection(); // ��ȡ���ݿ����Ӷ���
		String add_SQL = "insert into tb_message(messageTitle,messageContent,employeeID,publishTime)values(?,?,?,?)";
		PreparedStatement pstmt = null; // ����Ԥ�������

		try {
			pstmt = connection.prepareStatement(add_SQL); // ��ȡԤ������󲢸�ֵ
			pstmt.setString(1, message.getMessageTitle()); // ������Ϣ���⣬����SQL����1����������?
			pstmt.setString(2, message.getMessageContent()); // ������Ϣ���ݣ�����SQL����2����������?
			pstmt.setInt(3, message.getEmployeeID()); // ������Ϣ������ID������SQL����3����������?
			pstmt.setTimestamp(4, new Timestamp(message.getPublishTime().getTime())); // ������Ϣ����ʱ�䣬����SQL����4����������?
			pstmt.executeUpdate(); // ִ�и���
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnction.close(pstmt); // �ر�Ԥ�������
			DBConnction.close(connection); // �ر����Ӷ���
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
		Connection connection = DBConnction.getConnection(); // ��ȡ���ݿ����Ӷ���
		String findByID_SQL = "select * from tb_message order by  publishTime desc limit ?,?"; // SQL���
		PreparedStatement pstmt = null; // ����Ԥ�������
		ResultSet rs = null; // �������������
		List<Message> messages = new ArrayList<Message>();

		try {
			pstmt = connection.prepareStatement(findByID_SQL); // ��ȡԤ������󲢸�ֵ
			pstmt.setInt(1, page.getBeginIndex()); // ����SQL����1����������?
			pstmt.setInt(2, page.getEveryPageCount()); // ����SQL����2����������?
			rs = pstmt.executeQuery(); // ִ�в�ѯ

			while (rs.next()) {
				Message message = new Message();
				message.setMessageID(rs.getInt(1)); // ������ϢID
				message.setMessageTitle(rs.getString(2)); // ������Ϣ����
				message.setMessageContent(rs.getString(3)); // ������Ϣ����
				message.setEmployeeID(rs.getInt(4)); // ����Ա��ID
				message.setPublishTime(rs.getTimestamp(5)); // ���÷���ʱ��
				messages.add(message); // ��ӵ���Ϣ�б�
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// ������˳��ر�
			DBConnction.close(rs); // �رս��������
			DBConnction.close(pstmt); // �ر�Ԥ�������
			DBConnction.close(connection); // �ر����Ӷ���
		}
		return messages;
	}

	@Override
	public Message findMessageById(int messageID) {
		Connection connection = DBConnction.getConnection(); // ��ȡ���ݿ����Ӷ���
		String findByID_SQL = "select * from tb_message where messageID = ?"; // SQL���
		PreparedStatement pstmt = null; // ����Ԥ�������
		ResultSet rs = null; // �������������
		Message message = null;

		try {
			pstmt = connection.prepareStatement(findByID_SQL); // ��ȡԤ������󲢸�ֵ
			pstmt.setInt(1, messageID); // ����SQL����1����������?
			rs = pstmt.executeQuery(); // ִ�в�ѯ

			if (rs.next()) {
				message = new Message();
				message.setMessageID(rs.getInt(1)); // ������ϢID
				message.setMessageTitle(rs.getString(2)); // ������Ϣ����
				message.setMessageContent(rs.getString(3)); // ������Ϣ����
				message.setEmployeeID(rs.getInt(4)); // ����Ա��ID
				message.setPublishTime(rs.getTimestamp(5)); // ���÷���ʱ��
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// ������˳��ر�
			DBConnction.close(rs); // �رս��������
			DBConnction.close(pstmt); // �ر�Ԥ�������
			DBConnction.close(connection); // �ر����Ӷ���
		}
		return message;
	}

	@Override
	public int findAllCount() {
		Connection connection = DBConnction.getConnection(); // ��ȡ���ݿ����Ӷ���
		String findByID_SQL = "select count(*) from tb_message"; // SQL���
		PreparedStatement pstmt = null; // ����Ԥ�������
		ResultSet rs = null; // �������������
		int count = 0;

		try {
			pstmt = connection.prepareStatement(findByID_SQL); // ��ȡԤ������󲢸�ֵ
			rs = pstmt.executeQuery(); // ִ�в�ѯ

			if (rs.next()) {
				count = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// ������˳��ر�
			DBConnction.close(rs); // �رս��������
			DBConnction.close(pstmt); // �ر�Ԥ�������
			DBConnction.close(connection); // �ر����Ӷ���
		}
		return count;
	}

}
