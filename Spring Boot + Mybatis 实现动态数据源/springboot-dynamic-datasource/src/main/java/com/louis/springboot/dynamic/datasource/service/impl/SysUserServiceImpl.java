package com.louis.springboot.dynamic.datasource.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.louis.springboot.dynamic.datasource.dao.SysUserMapper;
import com.louis.springboot.dynamic.datasource.model.SysUser;
import com.louis.springboot.dynamic.datasource.service.SysUserService;

@Service
public class SysUserServiceImpl  implements SysUserService {

	@Autowired
	private SysUserMapper sysUserMapper;

	/**
	 * 查找全部用户信息
	 * @return
	 */
	public List<SysUser> findAll() {
		return sysUserMapper.findAll();
	}
	
}
