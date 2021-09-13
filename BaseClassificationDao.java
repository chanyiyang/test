/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/ztech/ztadmin">Ztadmin</a> All rights reserved.
 */
package com.ztech.education.modules.base.dao;

import java.util.Map;

import com.ztech.education.modules.base.entity.BaseClassification;
import com.ztech.framework.common.persistence.CrudDao;
import com.ztech.framework.common.persistence.annotation.MyBatisDao;

/**
 * 班级分类DAO接口
 * @author czs
 * @version 2021-04-14
 */
@MyBatisDao
public interface BaseClassificationDao extends CrudDao<BaseClassification> {
	/**
	 * 删除所有
	 * @param baseGrade
	 */
	void deleteAll(BaseClassification baseClassification);
	
	
	BaseClassification findFirstByParams(Map<String,Object> params);
}