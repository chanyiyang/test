/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/ztech/ztadmin">Ztadmin</a> All rights reserved.
 */
package com.ztech.education.modules.base.dao;

import java.util.List;
import java.util.Map;

import com.ztech.education.modules.base.entity.BaseFee;
import com.ztech.framework.common.persistence.CrudDao;
import com.ztech.framework.common.persistence.annotation.MyBatisDao;

/**
 * 费用管理DAO接口
 * @author czs
 * @version 2021-04-14
 */
@MyBatisDao
public interface BaseFeeDao extends CrudDao<BaseFee> {
	
	BaseFee findFirstByParams(Map<String,String> params);
	
	BaseFee getById(BaseFee baseFee);
	
	
	/**
	 * 获取课程绑定的费用
	 * @param baseFee
	 * @return
	 */
	List<BaseFee> findCourseFees(BaseFee baseFee);
}