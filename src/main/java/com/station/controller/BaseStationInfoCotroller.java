package com.station.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.station.bean.AjaxResponse;

import com.station.bean.Pager;
import com.station.common.Constant;
import com.station.entity.BaseStationInfo;
import com.station.service.BaseStationInfoService;

@RequestMapping(value="/stationInfo")
@Controller
public class BaseStationInfoCotroller extends BaseController{
	
	@Autowired
	BaseStationInfoService BaseStationInfoSer;
	
	@RequestMapping(value="/listPageing",method=RequestMethod.POST)
	@ResponseBody
	public AjaxResponse<Pager> getStationInfoPageing(@RequestBody BaseStationInfo baseStationInfo){
		AjaxResponse<Pager> ajaxResponse = new AjaxResponse<Pager>(Constant.RS_CODE_SUCCESS,"获取分页数据成功");		
		try {
			Pager listPageing = BaseStationInfoSer.findForPager(baseStationInfo);
			if(listPageing != null) {			
				ajaxResponse.setData(listPageing);
			}
		}catch(Exception e) {
			ajaxResponse.setCode(Constant.RS_CODE_ERROR);
			ajaxResponse.setMsg("获取分页数据失败");
		}
		return ajaxResponse;		
	}
}
