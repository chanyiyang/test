/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/ztech/ztadmin">Ztadmin</a> All rights reserved.
 */
package com.ztech.education.modules.base.dao;

import com.ztech.education.modules.base.entity.BasePackageDetail;
import com.ztech.framework.common.persistence.CrudDao;
import com.ztech.framework.common.persistence.annotation.MyBatisDao;

/**
 * 套餐明细DAO接口
 * @author czs
 * @version 2021-04-14
 */
@MyBatisDao
public interface BasePackageDetailDao extends CrudDao<BasePackageDetail> {
	
	/**
	 * 删除套餐的明细
	 * @param basePackageDetail
	 */
	void deleteByPackage(BasePackageDetail basePackageDetail);
	
	
	/**
	 * 获取课程的使用数量
	 * @param basePackageDetail
	 * @return
	 */
	Integer getUsedCount(BasePackageDetail basePackageDetail);
	
	
	/**
	 * 获取课程里,某条定价的使用数量
	 * @param ordConsumerDetail
	 * @return
	 */
	Integer getCourseWayUsedCount(BasePackageDetail basePackageDetail);
}