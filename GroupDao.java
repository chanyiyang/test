package com.ztech.universal.commons.sys.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.ztech.framework.common.persistence.annotation.MyBatisDao;
import com.ztech.universal.common.base.entity.SysGroup;

/**
 * @作者 ztech
 * @创建时间 2018年1月8日
 * @功能
 */
@MyBatisDao
public interface GroupDao {
	/**
	 * 根据校区id获取名称
	 * 
	 * @param id
	 * @return
	 */
	public String getNameById(long id);

	/**
	 * 根据id列表获取校区列表
	 */
	public List<SysGroup> getListByIds(List<Long> ids);

	/**
	 * 获取所有校区列表
	 */
	public List<SysGroup> getAllList();
	
	/**
	 *app 获取所有校区列表
	 */
	public List<SysGroup> getAppAllList(@Param("q")  String q);
	/**
	 * app根据id列表获取校区列表
	 */
	public List<SysGroup> getListAppByIds(Map<String, Object> map);
}
