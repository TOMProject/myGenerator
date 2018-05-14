package com.station.bean;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.station.entity.BaseStationInfo;
import java.util.*;

/**
* @TableName: base_station_info 
* @Package: com.station.entity
* @Title:BaseStationInfo.java 
* @Description:  
* @author: yeweigang
* @date: 2018-05-11 10:01:09
* @version V1.0    
* create by codeFactory
*/
@ApiModel 
public class BaseStationInfoResult extends AjaxResponse<Object> implements Serializable{
	
	public BaseStationInfoResult(String code, String message, BaseStationInfo data) {
		super(code, message, data);
	}
	public BaseStationInfoResult(String code, String message, BaseStationInfoPager pager) {
		super(code, message, pager);
		this.pager = pager;
	}
	
	@ApiModelProperty(value = "")  
	private BaseStationInfo data;
	@ApiModelProperty(value = "具体的分页数据")  
	private BaseStationInfoPager pager;
	
	public BaseStationInfoPager getPager() {
		return pager;
	}
	public void setPager(BaseStationInfoPager pager) {
		this.pager = pager;
	}
	
	public void setData(BaseStationInfo baseStationInfo){
		this.data=baseStationInfo;
	}
	
	public BaseStationInfo getData(){
		return data;
	}
	
}

