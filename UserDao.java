/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/ztech/auto">auto</a> All rights reserved.
 */
package com.ztech.universal.commons.sys.dao;

import java.util.HashMap;
import java.util.List;

import com.ztech.framework.common.persistence.CrudDao;
import com.ztech.framework.common.persistence.annotation.MyBatisDao;
import com.ztech.universal.common.base.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * 用户DAO接口
 * @author ztech
 * @version 2014-05-16
 */
@MyBatisDao
public interface UserDao extends CrudDao<User> {
	
	/**
	 * 根据登录名称查询用户
	 * @param loginName
	 * @return
	 */
	public User getByLoginName(User user);

	/**
	 * 根据登录名称查询用户列表
	 * @param loginName
	 * @return
	 */
	public List<User> findUserByLoginName(User user);

	/**
	 * 通过OfficeId获取用户列表，仅返回用户id和name（树查询用户时用）
	 * @param user
	 * @return
	 */
	public List<User> findUserByOfficeId(User user);
	
	/**
	 * 查询全部用户数目
	 * @return
	 */
	public long findAllCount(User user);
	
	/**
	 * 更新用户密码
	 * @param user
	 * @return
	 */
	public int updatePasswordById(User user);
	
	/**
	 * 更新登录信息，如：登录IP、登录时间
	 * @param user
	 * @return
	 */
	public int updateLoginInfo(User user);

	/**
	 * 删除用户角色关联数据
	 * @param user
	 * @return
	 */
	public int deleteUserRole(User user);
	
	/**
	 * 插入用户角色关联数据
	 * @param user
	 * @return
	 */
	public int insertUserRole(User user);
	
	/**
	 * 更新用户信息
	 * @param user
	 * @return
	 */
	public int updateUserInfo(User user);
	/**
	 * 所有可用用户下拉框
	 * @return
	 */
	public List<HashMap<Long, String>> all();
	
	
	/**
	 * 删除跨校区用户角色
	 * @param user
	 * @return
	 */
	public int deleteUserRoleOther(User user);
	
	/**
	 * 删除本校区用户角色
	 * @param user
	 * @return
	 */
	public int deleteUserRoleMyself(User user);
	
	/**
	 * 插入跨校区用户角色关联数据
	 * @param user
	 * @return
	 */
	public int insertUserRoleOther(User user);

	/**
	 * 查询系统管理以上的帐号
	 * @param user
	 * @return
	 */
	List<User> findAdminUserList(User user);


	/**
	 * 更新用户所属校区
	 * @param user
	 * @return
	 */
	 int updateUserGroupId(User user);


	void deleteSysUserRole(@Param(value="roleId")Long roleId, @Param(value="userId")Long userId);

}
