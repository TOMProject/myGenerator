package ${base_packge}.bean;

import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
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
public class ${table.entityName}Pager extends Pager implements Serializable{
	@ApiModelProperty(value="分页List")
	private List<${table.entityName}> list;
	public List<${table.entityName}> getList() {
		return list;
	}

	public void setList(List<${table.entityName}> list) {
		this.list = list;
	}
}

