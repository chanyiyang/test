/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/ztech/ztadmin">Ztadmin</a> All rights reserved.
 */
package com.ztech.education.modules.base.dao;

import java.util.Map;

import com.ztech.education.modules.base.entity.BaseClassification;
import com.ztech.framework.common.persistence.CrudDao;
import com.ztech.framework.common.persistence.annotation.MyBatisDao;
import com.ztech.education.modules.base.entity.BaseClassroom;

/**
 * 教室DAO接口
 * @author czs
 * @version 2021-04-14
 */
@MyBatisDao
public interface BaseClassroomDao extends CrudDao<BaseClassroom> {

    /**
     * 批量删除教室信息
     * @param baseClassroom
     */
    void deleteAll(BaseClassroom baseClassroom);
    
    
    BaseClassroom findFirstByParams(Map<String,Object> params);
}