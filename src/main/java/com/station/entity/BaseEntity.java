package com.station.entity;

import java.io.Serializable;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * entity 基本信息
 * @author 
 *
 */

public class BaseEntity implements Serializable {


	/**
	 *  pageNumber当前页
	 */
	private int pageNumber;
	/**
	 * pageSize 每页条数
	 */
	private int pageSize;
	
	

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	

}
