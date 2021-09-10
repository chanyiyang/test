/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/ztech/auto">auto</a> All rights reserved.
 */
package com.ztech.universal.commons.sys.dao;

import java.util.List;

import com.ztech.framework.common.persistence.CrudDao;
import com.ztech.framework.common.persistence.annotation.MyBatisDao;
import com.ztech.universal.common.base.entity.Menu;
import org.apache.ibatis.annotations.Param;

/**
 * 菜单DAO接口
 * 
 * @author ztech
 * @version 2014-05-16
 */
@MyBatisDao
public interface MenuDao extends CrudDao<Menu> {

	public List<Menu> findByParentIdsLike(Menu menu);

	public List<Menu> findByUserId(Menu menu);

	public List<Menu> findListByRole(Menu menu);

	List<Menu> findListByRoleDefault(Menu menu);

	List<Menu> findJurisdictionList();

	public int updateParentIds(Menu menu);

	public int updateSort(Menu menu);
	
	public int getChildCount(Menu menu);

	public void batchDeleteMenu(Menu menu);

	public void batchInsertMenu(List<Menu> list);

	public List<Menu> getChildList(Menu menu);

	public List<Menu>  findShowList(Menu menu);
	
	/**
	 * 根据名字获取第一个菜单
	 * @param menu
	 * @return
	 */
	public Menu getFirstByName(Menu menu);
	
	/**
	 * 根据url获取第一个菜单
	 * @param menu
	 * @return
	 */
	public Menu getFirstByUrl(Menu menu);
	
	
	
	/**
	 * 找出角色是否拥有某个菜单
	 * @param menu
	 * @return
	 */
	public Integer findCountByRoleMenu(Menu menu);

	List<Menu> getAppRoleMenuPermission(@Param(value="roleId")Long roleId);
	
	List<Menu> getRoleByMenuPermission(Menu menu);


	void deleteJurisdictionMenu();

	void saveJurisdictionMenu(Menu menu);

	void batchInsertJurisdictionMenu(List<Menu> list);

	Integer getJurisdictionMenu(Long id);


}
