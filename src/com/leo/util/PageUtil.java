package com.leo.util;

/**
 * @author liuxiaohui
 *
 */
public class PageUtil {
	public static Page createPage(int everyPageCount, int totalCount, int currentPage) {
		everyPageCount = getEveryPageCount(everyPageCount);
		currentPage = getCurrentPage(currentPage);
		int totalPage = getTotalPage(everyPageCount, totalCount);
		int beginIndex = getBeginIndex(everyPageCount, currentPage);
		boolean hasPrePage = getHasPrePage(currentPage);
		boolean hasNextPage = getHasNextPage(currentPage, totalPage);
		return new Page(everyPageCount, totalPage, totalCount, currentPage, beginIndex, hasPrePage, hasNextPage);
	}

	/**
	 * 获取每页显示记录数
	 * 
	 * @param everyPageCount
	 * @return
	 */
	public static int getEveryPageCount(int everyPageCount) {
		return everyPageCount == 0 ? 10 : everyPageCount;
	}

	/**
	 * 获取当前页
	 * 
	 * @param currentPage
	 * @return
	 */
	public static int getCurrentPage(int currentPage) {
		return currentPage == 0 ? 1 : currentPage;
	}

	/**
	 * 获取总页数
	 * 
	 * @param everyPageCount
	 * @param totalCount
	 * @return
	 */
	public static int getTotalPage(int everyPageCount, int totalCount) {
		return (totalCount % everyPageCount > 0) ? (totalCount / everyPageCount) : (totalCount / everyPageCount + 1);
	}

	/**
	 * 获取起始查询点
	 * 
	 * @param everyPageCount
	 * @param currentPage
	 * @return
	 */
	public static int getBeginIndex(int everyPageCount, int currentPage) {
		return (currentPage - 1) * everyPageCount;
	}

	/**
	 * 获取是否有上页
	 * 
	 * @param currentPage
	 * @return
	 */
	public static boolean getHasPrePage(int currentPage) {
		return currentPage == 1 ? false : true;
	}

	/**
	 * 
	 * 获取是否有下页
	 * 
	 * @param currentPage
	 * @param totalPage
	 * @return
	 */
	public static boolean getHasNextPage(int currentPage, int totalPage) {
		return currentPage == totalPage || totalPage == 0 ? false : true;
	}
}
