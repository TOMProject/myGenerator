package com.station.mapper;

import java.io.Serializable;
import java.util.List;

public interface BaseMapper<T, TID extends Serializable> {

	/**
	 * 根据对象新增
	 */
	int insert(T record);

	/**
	 * 根据对象新增不为null的属性
	 */
	int insertSelective(T record);

	/**
	 * 根据pk查找对象
	 */
	T selectByPrimaryKey(TID pk);

	/**
	 * 根据pk更新对象不为null的属性
	 */
	int updateByPrimaryKeySelective(T record);

	/**
	 * 根据pk更新所有属性
	 */
	int updateByPrimaryKey(T record);

	/**
	 * 根据不为null的属性删除对象
	 */
	int deleteSelective(T record);

	/**
	 * 根据主键删除
	 */
	int deleteByPrimaryKey(TID pk);

	/**
	 * 根据主键数组删除
	 * @param pks
	 * @return
	 */
	int deleteByPKs(TID[] pks);

	/**
	 * 根据对象不为null的属性获取对象集合
	 */
	List<T> selectListSelective(T record);
	
	/**
	 * 根据条件查询分页列表
	 * @param params
	 * @return
	 */
	public List<T> getListPageing(T t);
	
	/**
	 * 根据条件查询分页总条数
	 * @param params
	 * @return
	 */
	public int getPageCount(T t);


}
