package ${base_packge}.${type_service}.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import ${base_packge}.bean.Pager;
import ${base_packge}.dao.${table.entityName?cap_first}Mapper;
import ${base_packge}.entity.${table.entityName?cap_first};
import ${base_packge}.service.${table.entityName?cap_first}Service;

 /**   
* @Title: ${table.entityName?cap_first}ServiceImpl.java 
* @Package ${base_packge}.${type_service}
* @Description: ${table.table_description}
* @author ${author}
* @date ${current_now}
* @version V1.0   
* create by codeFactory
*/
@Service("${table.entityName?cap_first}ServiceImpl")
public class ${table.entityName?cap_first}ServiceImpl  extends BaseServiceImpl<${table.entityName?cap_first},Long> implements ${table.entityName?cap_first}Service{
	@Autowired
	private ${table.entityName?cap_first}Mapper ${table.entityName?uncap_first}Mapper;
	@Autowired
	public void setBaseMapper() {
		super.setBaseMapper(${table.entityName?uncap_first}Mapper);
	}
	
	@Override
	public ${table.entityName?cap_first}Pager findForPager(${table.entityName?cap_first} ${table.entityName?uncap_first}) {
		${table.entityName?cap_first}Pager pager = new ${table.entityName?cap_first}Pager();
		if (${table.entityName?uncap_first}.getPageSize() == 0) {
			${table.entityName?uncap_first}.setPageSize(pager.getPageSize());
		}
		if (${table.entityName?uncap_first}.getPageNumber() == 0) {
			${table.entityName?uncap_first}.setPageNumber(1);
		}
		List<${table.entityName?cap_first}> list = ${table.entityName?uncap_first}Mapper.getList(${table.entityName?uncap_first});
		int count = ${table.entityName?uncap_first}Mapper.getCount(${table.entityName?uncap_first});
		pager.setList(list);
		pager.setTotalCount(count);
		pager.setPageNumber(${table.entityName?uncap_first}.getPageNumber());
		return pager;
	}
	
}