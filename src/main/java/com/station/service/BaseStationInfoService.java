package com.station.service;

import com.station.bean.Pager;
import com.station.entity.BaseStationInfo;

public interface BaseStationInfoService extends BaseService<BaseStationInfo,Long>{
	/**
	 * 	分页方法
	 * @param t 分页对象
	 * @return
	 */
	Pager findForPager(BaseStationInfo t);
}