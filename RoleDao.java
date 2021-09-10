/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/ztech/auto">auto</a> All rights reserved.
 */
package com.ztech.universal.commons.sys.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.ztech.framework.common.persistence.CrudDao;
import com.ztech.framework.common.persistence.annotation.MyBatisDao;
import com.ztech.universal.common.base.entity.Role;
import com.ztech.universal.common.base.entity.RoleMenu;
import com.ztech.universal.common.base.entity.User;

/**
 * 角色DAO接口
 * @author ztech
 * @version 2013-12-05
 */
@MyBatisDao
public interface RoleDao extends CrudDao<Role> {

	public Role getByName(Role role);
	
	public Role getByEnname(Role role);

	/**
	 * 维护角色与菜单权限关系
	 * @param role
	 * @return
	 */
	public int deleteRoleMenu(Role role);

	/**
	 * 删除预设角色菜单关联
	 * @param role
	 * @return
	 */
	int deleteRoleMenuDefault(Role role);

	public int deleteShowRoleMenu(Role role);

	public int deleteRoleOperationMenu(Role role);

	public int insertRoleMenu(Role role);

	/**
	 * 插入系统预设角色菜单关联
	 * @param role
	 * @return
	 */
	int insertRoleMenuDefault(Role role);

	/**
	 * 查询角色的操作菜单权限
	 * @param role
	 * @return
	 */
	public  List<Long> getRoleOperationMenu(Role role);
	/**
	 * 维护角色与公司部门关系
	 * @param role
	 * @return
	 */
	public int deleteRoleOffice(Role role);

	public int insertRoleOffice(Role role);

	
	public RoleMenu getRoleMenu(@Param(value="roleId")Long roleId,@Param(value="menuId")Long menuId);
	
	public List<RoleMenu> findRoleMenuList(RoleMenu roleMenu);
	
	
	
	
	public void insertRoleShop(@Param(value="roleId")Long roleId,@Param(value="shopId")Long shopId);
	
	public void deleteRoleShop(@Param(value="roleId")Long roleId);
	
	
	public List<Role> findAllListByGroup(Role role);
	
	public Role getRoleByUser(User user );
	
	
	/**
	 * 判断名称是否重复
	 * 
	 * @param Role
	 * @return
	 */
	public List<Role> validateSameName(Role role);
	
	
	
	public List<Role> findRoleList(Role role);
	
	/**
	 * 查询角色关联用户数目
	 * @param role
	 * @return
	 */
	public Long findUserCountByRole(Role role);
	
	/**
	 * 删除角色时也要删除角色全局设置
	 * @param role
	 * @return
	 */
	public int deleteSysRoleGlobal(Role role);

	public void deleteRoleBusiness(Role role);

	public void insertRoleBusiness(Role role);

	Role getByRelationId(@Param(value="relationIds")String relationIds,@Param(value="groupId")Long groupId);

	String getSysRoleRelation(String roleId);

	int editSysRoleRelation(@Param(value="roleId")String roleId,@Param(value="roleIds")String roleIds);

	List<Map> findSysUserRoleByRoleId(@Param(value="roleId")Long roleId,@Param(value="roleIds")List<Long> roleIds);
}
