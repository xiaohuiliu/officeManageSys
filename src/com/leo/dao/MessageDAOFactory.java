/**
 * 
 */
package com.leo.dao;

/**
 * @author liuxiaohui
 *
 */
public class MessageDAOFactory {
	/**
	 * @return
	 */
	public static MessageDAO getMessageDAOInstance() {
		return new MessageDAOImpl();
	}
}
