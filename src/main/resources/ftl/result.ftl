package ${base_packge}.bean;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import ${base_packge}.${type_model}.${table.entityName?cap_first};
<#if table.f_util == true>
import java.util.*;
</#if>
<#if table.f_sql == true>
import java.sql.*;
</#if>
<#if table.f_math == true>
import import java.math.*;
</#if>

/**
* @TableName: ${table.tablename} 
* @Package: ${base_packge}.${type_model}
* @Title:${table.entityName}.java 
* @Description: ${table.table_description} 
* @author: ${author}
* @date: ${current_now}
* @version V1.0    
* create by codeFactory
*/
@ApiModel 
public class ${table.entityName}Result extends AjaxResponse<Object> implements Serializable{
	
	public ${table.entityName}Result(String code, String message, ${table.entityName} data) {
		super(code, message, data);
	}
	public ${table.entityName}Result(String code, String message, ${table.entityName}Pager pager) {
		super(code, message, pager);
		this.pager = pager;
	}
	
	@ApiModelProperty(value = "${table.table_description}")  
	private ${table.entityName} data;
	@ApiModelProperty(value = "具体的分页数据")  
	private ${table.entityName}Pager pager;
	
	public ${table.entityName}Pager getPager() {
		return pager;
	}
	public void setPager(${table.entityName}Pager pager) {
		this.pager = pager;
	}
	
	public void setData(${table.entityName} ${table.entityName?uncap_first}){
		this.data=${table.entityName?uncap_first};
	}
	
	public ${table.entityName} getData(){
		return data;
	}
	
}

