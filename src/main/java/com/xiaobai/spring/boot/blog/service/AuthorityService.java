package com.xiaobai.spring.boot.blog.service;

import com.xiaobai.spring.boot.blog.domain.Authority;

/**
 * Authority 服务接口.
 * 
 * @author <a href="http://fengwuxiaobai.com">xiaobai</a>
 */
public interface AuthorityService {
	 
	
	/**
	 * 根据id获取 Authority
	 * @param id
	 * @return
	 */
	Authority getAuthorityById(Long id);
}
