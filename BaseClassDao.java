/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/ztech/ztadmin">Ztadmin</a> All rights reserved.
 */
package com.ztech.education.modules.base.dao;

import java.util.List;
import java.util.Map;

import com.ztech.education.modules.base.entity.BaseClass;
import com.ztech.education.modules.customer.entity.CusStudentCourse;
import com.ztech.framework.common.persistence.CrudDao;
import com.ztech.framework.common.persistence.annotation.MyBatisDao;
import org.apache.ibatis.annotations.Param;

/**
 * 班级管理DAO接口
 * @author czs
 * @version 2021-04-14
 */
@MyBatisDao
public interface BaseClassDao extends CrudDao<BaseClass> {
	BaseClass findFirstByParams(Map<String,Object> params);
	
	/**
	 * 获取课程的使用数量
	 * @param baseClass
	 * @return
	 */
	Integer getCourseUsedCount(BaseClass baseClass);
	
	
	
	/**
	 * 删除订单号产生的班级
	 * @param cusStudentCourse
	 */
	void deleteByOrder(BaseClass baseClass);

	List<Map> getStudentCourseClass(@Param("studentId")Long studentId,@Param("courseId")Long courseId,@Param("classId")Long classId);

	Map getAddStudentCount(@Param("classId")Long classId,@Param("count")Long count,@Param("scheduleId")Long scheduleId);

	Map getAddStudentCount1(@Param("classId")Long classId,@Param("count")Long count,@Param("scheduleId")Long scheduleId);
	
	
	/**
	 * 获取班级使用的数量
	 * @param baseClass
	 * @return
	 */
	Integer getClassRoomUsedCount(BaseClass baseClass);

}