package com.leo.util;

/**
 * @author liuxiaohui
 *
 */
public class Page {
	private int everyPageCount; // ÿҳ��ʾ��¼��
	private int totalPage; // ��ҳ��
	private int totalCount; // �ܼ�¼��
	private int currentPage; // ��ǰҳ
	private int beginIndex; // ��ʼ��ѯ��
	private boolean hasPrePage; // �Ƿ�����ҳ
	private boolean hasNextPage; // �Ƿ�����ҳ

	/**
	 * @param everyPageCount
	 * @param totalPage
	 * @param totalCount
	 * @param currentPage
	 * @param beginIndex
	 * @param hasPrePage
	 * @param hasNextPage
	 */
	public Page(int everyPageCount, int totalPage, int totalCount, int currentPage, int beginIndex,
			boolean hasPrePage, boolean hasNextPage) {
		this.everyPageCount = everyPageCount;
		this.totalPage = totalPage;
		this.totalCount = totalCount;
		this.currentPage = currentPage;
		this.beginIndex = beginIndex;
		this.hasPrePage = hasPrePage;
		this.hasNextPage = hasNextPage;
	}

	/**
	 * @return the everyPageCount
	 */
	public int getEveryPageCount() {
		return everyPageCount;
	}

	/**
	 * @param everyPageCount the everyPageCount to set
	 */
	public void setEveryPageCount(int everyPageCount) {
		this.everyPageCount = everyPageCount;
	}

	/**
	 * @return the totalPage
	 */
	public int getTotalPage() {
		return totalPage;
	}

	/**
	 * @param totalPage the totalPage to set
	 */
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	/**
	 * @return the totalCount
	 */
	public int getTotalCount() {
		return totalCount;
	}

	/**
	 * @param totalCount the totalCount to set
	 */
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	/**
	 * @return the currentPage
	 */
	public int getCurrentPage() {
		return currentPage;
	}

	/**
	 * @param currentPage the currentPage to set
	 */
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	/**
	 * @return the beginIndex
	 */
	public int getBeginIndex() {
		return beginIndex;
	}

	/**
	 * @param beginIndex the beginIndex to set
	 */
	public void setBeginIndex(int beginIndex) {
		this.beginIndex = beginIndex;
	}

	/**
	 * @return the hasPrePage
	 */
	public boolean isHasPrePage() {
		return hasPrePage;
	}

	/**
	 * @param hasPrePage the hasPrePage to set
	 */
	public void setHasPrePage(boolean hasPrePage) {
		this.hasPrePage = hasPrePage;
	}

	/**
	 * @return the hasNextPage
	 */
	public boolean isHasNextPage() {
		return hasNextPage;
	}

	/**
	 * @param hasNextPage the hasNextPage to set
	 */
	public void setHasNextPage(boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}
}
