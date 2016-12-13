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
	 * 定义增加消息的方法
	 * @param message
	 */
	public void addMessage(Message message);
	/**
	 * 定义更新消息的方法
	 * @param message
	 */
	public void updateMessage(Message message);
	/**
	 * 定义删除消息的方法
	 * @param messageID
	 */
	public void deleteMessage(int messageID);
	/**
	 * 定义按分页查询消息的方法
	 * @param page
	 * @return
	 */
	public List<Message> findAllMessage(Page page);
	/**
	 * 定义按ID查询消息的方法
	 * @param messageID
	 * @return
	 */
	public Message findMessageById(int messageID);
	/**
	 * 定义查询消息的记录数
	 * @return
	 */
	public int findAllCount();
}
