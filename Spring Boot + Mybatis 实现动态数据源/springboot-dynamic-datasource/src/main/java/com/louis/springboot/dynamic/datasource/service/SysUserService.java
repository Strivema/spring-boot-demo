package com.louis.springboot.dynamic.datasource.service;

import java.util.List;

import com.louis.springboot.dynamic.datasource.model.SysUser;

/**
 * 用户管理
 * @author Louis
 * @date Oct 31, 2018
 */
public interface SysUserService {

	/**
	 * 查找全部用户信息
	 * @return
	 */
	List<SysUser> findAll();
}
