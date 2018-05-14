package ${base_packge}.${type_service};

import ${base_packge}.${type_model}.${table.entityName?cap_first};

public interface ${table.entityName?cap_first}Service extends BaseService<${table.entityName?cap_first},Long>{
	/**
	 * 	分页方法
	 * @param t 分页对象
	 * @return
	 */
	${table.entityName?cap_first}Pager findForPager(${table.entityName?cap_first} t);
}