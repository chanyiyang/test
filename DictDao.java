/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/ztech/auto">auto</a> All rights reserved.
 */
package com.ztech.universal.commons.sys.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.ztech.framework.common.persistence.CrudDao;
import com.ztech.framework.common.persistence.annotation.MyBatisDao;
import com.ztech.universal.common.base.entity.Dict;
import com.ztech.universal.modules.payment.entity.PayPaymentMethod;

/**
 * 字典DAO接口
 * 
 * @author ztech
 * @version 2014-05-16
 */
@MyBatisDao
public interface DictDao extends CrudDao<Dict> {

	public List<Dict> findTypeList(Dict dict);
	
	/**
	 * 获取字典
	 * @param param
	 * @return
	 */
	public List<Dict> findListByType(Map<String, String> param);
	
	public int findCountByType(Dict dict);

	public List<Dict> findGroupPage(Dict dict);

	public Long getMaxSort(Dict dict);

	public List<Dict> findListByIds(@Param("list")List<Long> list);

	public int getUsageTimes(@Param("list")List<String> list,@Param("flag")int flag);
	
	/**
	 * 根据类型,删除指定的类型
	 * @param type 字典类型
	 */
	public void batchDeleteByType(String type);
	
	/**
	 * 删除卡图片字典数据
	 * @param type
	 */
	public void batchDeleteCardImageTempalte(String type);
	
	/**
	 * 批量导入
	 * @param list
	 */
	void batchInsert(List<Dict> list);
	void deleteByType(@Param("type") String type);
	
	Dict findFirstByParams(Map<String,String> params);
	
	
	public List<Dict> cusTypeGridData(Dict dict);
	
	public Dict getCusTypeBeforeSort(Dict dict);
	
	void deleteAllCusType(Dict dict);
	
	Integer cusTypeUsedCount(Dict dict);
}
