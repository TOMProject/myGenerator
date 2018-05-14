package com.station.service.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.station.mapper.BaseMapper;
import com.station.service.BaseService;
@Service
public  abstract class BaseServiceImpl<T, TID extends Serializable> implements BaseService<T, TID> {

	@Autowired
	private BaseMapper<T, TID> baseMapper;
	
	
	public BaseMapper<T, TID> getBaseMapper() {
		return baseMapper;
	}

	public void setBaseMapper(BaseMapper<T, TID> baseMapper) {
		this.baseMapper = baseMapper;
	}
	
	public int insert(T record) {
		
		return baseMapper.insert(record);
	}

	public int insertSelective(T record) {
		
		return baseMapper.insertSelective(record);
	}

	public T selectByPrimaryKey(TID pk) {
		return baseMapper.selectByPrimaryKey(pk);
	}

	public int updateByPrimaryKeySelective(T record) {
		return baseMapper.updateByPrimaryKey(record);
	}

	public int updateByPrimaryKey(T record) {
		return baseMapper.updateByPrimaryKey(record);
	}

	public int deleteSelective(T record) {
		
		return baseMapper.deleteSelective(record);
	}

	public int deleteByPrimaryKey(TID pk) {
		
		return baseMapper.deleteByPrimaryKey(pk);
	}

	public int deleteByPKs(TID[] pks) {
		
		return baseMapper.deleteByPKs(pks);
	}

	public List<T> selectListSelective(T record) {
		
		return baseMapper.selectListSelective(record);
	}

	public List<T> getListPageing(T record) {
		return baseMapper.getListPageing(record);
	}

	public int getPageCount(T record) {
		return baseMapper.getPageCount(record);
	}

	
}
