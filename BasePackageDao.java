/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/ztech/ztadmin">Ztadmin</a> All rights reserved.
 */
package com.ztech.education.modules.base.dao;

import java.util.Map;

import com.ztech.education.modules.base.entity.BasePackage;
import com.ztech.framework.common.persistence.CrudDao;
import com.ztech.framework.common.persistence.annotation.MyBatisDao;

/**
 * 套餐管理DAO接口
 * @author czs
 * @version 2021-04-14
 */
@MyBatisDao
public interface BasePackageDao extends CrudDao<BasePackage> {
	BasePackage getById(BasePackage basePackage);
	
	BasePackage findFirstByParams(Map<String,String> params);
}