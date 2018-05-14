package com.station.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.station.bean.Pager;
import com.station.entity.BaseStationInfo;
import com.station.mapper.BaseStationInfoMapper;
import com.station.service.BaseStationInfoService;

 /**   
* @Title: BaseStationInfoServiceImpl.java 
* @Package com.station.service
* @Description: 
* @author yeweigang
* @date 2018-05-11 10:01:09
* @version V1.0   
* create by codeFactory
*/
@Service("BaseStationInfoServiceImpl")
public class BaseStationInfoServiceImpl  extends BaseServiceImpl<BaseStationInfo,Long> implements BaseStationInfoService{
	@Autowired
	private BaseStationInfoMapper baseStationInfoMapper;

	
	@Override
	public Pager findForPager(BaseStationInfo baseStationInfo) {
		Pager pager = new Pager();
		if (baseStationInfo.getPageSize() == 0) {
			baseStationInfo.setPageSize(pager.getPageSize());
		}
		if (baseStationInfo.getPageNumber() == 0) {
			baseStationInfo.setPageNumber(1);
		}
		List<BaseStationInfo> listPageing = baseStationInfoMapper.getListPageing(baseStationInfo);
		int count = baseStationInfoMapper.getPageCount(baseStationInfo);
		pager.setListPageing(listPageing);;//返回数据
		pager.setTotalCount(count);//总数据
		pager.setPageNumber(baseStationInfo.getPageNumber());//当前页
		return  pager;
	}

	
	
}