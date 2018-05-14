package com.station.bean;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
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
public class BaseStationInfoPager extends Pager implements Serializable{

	private static final long serialVersionUID = 1L;
	/**
	 * 分页ListPageing
	 */
	private List<BaseStationInfo> listPageing;
	public List<BaseStationInfo> getListPageing() {
		return listPageing;
	}

	public void setList(List<BaseStationInfo> listPageing) {
		this.listPageing = listPageing;
	}
}

