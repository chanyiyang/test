/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/ztech/ztadmin">Ztadmin</a> All rights reserved.
 */
package com.ztech.education.modules.base.dao;

import java.util.List;
import java.util.Map;

import com.ztech.education.modules.base.entity.BaseClassroom;
import com.ztech.education.modules.base.entity.BaseGrade;
import com.ztech.framework.common.persistence.CrudDao;
import com.ztech.framework.common.persistence.annotation.MyBatisDao;

/**
 * 基础资料-年级DAO接口
 * @author czs
 * @version 2021-04-13
 */
@MyBatisDao
public interface BaseGradeDao extends CrudDao<BaseGrade> {
	
	/**
	 * 删除所有
	 * @param baseGrade
	 */
	void deleteAll(BaseGrade baseGrade);
	
	
	BaseGrade getById(BaseGrade baseGrade);
	
	
	BaseGrade findFirstByParams(Map<String,Object> params);
}