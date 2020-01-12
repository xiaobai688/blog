/**
 * 
 */
package com.xiaobai.spring.boot.blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiaobai.spring.boot.blog.domain.Authority;
import com.xiaobai.spring.boot.blog.repository.AuthorityRepository;

/**
 * Authority 服务.
 * 
 * @author <a href="http://fengwuxiaobai.com">xiaobai</a>
 */
@Service
public class AuthorityServiceImpl  implements AuthorityService {
	
	@Autowired
	private AuthorityRepository authorityRepository;


	/**
	 * 根据id获取Authority
	 * @param id
	 * @return
	 */
	@Override
	public Authority getAuthorityById(Long id) {
		return authorityRepository.findOne(id);
	}

}
