package com.station.bean;

import java.util.List;

/**
 * 使用分页bean
 * @author 
 *
 */
public class Pager {
	
	/**
	 * value="每页最大记录数限制"
	 */
	public static final int MAX_PAGE_SIZE = 500;// 每页最大记录数限制
	/**
	 * value =当前页码
	 */
	private int pageNumber = 1;
	/**
	 * value=每页记录数
	 */
	private int pageSize = 15;
	/**
	 * value="总记录数"
	 */
	private int totalCount = 0;
	/**
	 * value="总页数"
	 */
	private int pageCount = 0;
	/**
	 * value=分页ListPageing
	 */
	private List<?> listPageing;

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		if (pageNumber < 1) {
			pageNumber = 1;
		}
		this.pageNumber = pageNumber;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		if (pageSize < 1) {
			pageSize = 1;
		} else if(pageSize > MAX_PAGE_SIZE) {
			pageSize = MAX_PAGE_SIZE;
		}
		this.pageSize = pageSize;
	}
	
	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public int getPageCount() {
		pageCount = totalCount / pageSize;
		if (totalCount % pageSize > 0) {
			pageCount ++;
		}
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public List<?> getListPageing() {
		return listPageing;
	}

	public void setListPageing(List<?> listPageing) {
		this.listPageing = listPageing;
	}


}
