/**
 * 
 */
package com.leo.dao;


import java.util.List;

import com.leo.bean.Message;
import com.leo.util.Page;

/**
 * @author liuxiaohui
 *
 */
public interface MessageDAO {	
	/**
	 * ����������Ϣ�ķ���
	 * @param message
	 */
	public void addMessage(Message message);
	/**
	 * ���������Ϣ�ķ���
	 * @param message
	 */
	public void updateMessage(Message message);
	/**
	 * ����ɾ����Ϣ�ķ���
	 * @param messageID
	 */
	public void deleteMessage(int messageID);
	/**
	 * ���尴��ҳ��ѯ��Ϣ�ķ���
	 * @param page
	 * @return
	 */
	public List<Message> findAllMessage(Page page);
	/**
	 * ���尴ID��ѯ��Ϣ�ķ���
	 * @param messageID
	 * @return
	 */
	public Message findMessageById(int messageID);
	/**
	 * �����ѯ��Ϣ�ļ�¼��
	 * @return
	 */
	public int findAllCount();
}
