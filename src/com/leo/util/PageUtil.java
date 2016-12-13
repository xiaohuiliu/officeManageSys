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
	 * ��ȡÿҳ��ʾ��¼��
	 * 
	 * @param everyPageCount
	 * @return
	 */
	public static int getEveryPageCount(int everyPageCount) {
		return everyPageCount == 0 ? 10 : everyPageCount;
	}

	/**
	 * ��ȡ��ǰҳ
	 * 
	 * @param currentPage
	 * @return
	 */
	public static int getCurrentPage(int currentPage) {
		return currentPage == 0 ? 1 : currentPage;
	}

	/**
	 * ��ȡ��ҳ��
	 * 
	 * @param everyPageCount
	 * @param totalCount
	 * @return
	 */
	public static int getTotalPage(int everyPageCount, int totalCount) {
		return (totalCount % everyPageCount > 0) ? (totalCount / everyPageCount) : (totalCount / everyPageCount + 1);
	}

	/**
	 * ��ȡ��ʼ��ѯ��
	 * 
	 * @param everyPageCount
	 * @param currentPage
	 * @return
	 */
	public static int getBeginIndex(int everyPageCount, int currentPage) {
		return (currentPage - 1) * everyPageCount;
	}

	/**
	 * ��ȡ�Ƿ�����ҳ
	 * 
	 * @param currentPage
	 * @return
	 */
	public static boolean getHasPrePage(int currentPage) {
		return currentPage == 1 ? false : true;
	}

	/**
	 * 
	 * ��ȡ�Ƿ�����ҳ
	 * 
	 * @param currentPage
	 * @param totalPage
	 * @return
	 */
	public static boolean getHasNextPage(int currentPage, int totalPage) {
		return currentPage == totalPage || totalPage == 0 ? false : true;
	}
}
