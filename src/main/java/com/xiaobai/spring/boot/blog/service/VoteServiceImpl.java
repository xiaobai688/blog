package com.xiaobai.spring.boot.blog.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiaobai.spring.boot.blog.domain.Vote;
import com.xiaobai.spring.boot.blog.repository.VoteRepository;

/**
 * Vote 服务.
 * 
 * @author <a href="http://fengwuxiaobai.com">xiaobai</a>
 */
@Service
public class VoteServiceImpl implements VoteService {

	@Autowired
	private VoteRepository voteRepository;



	@Override
	@Transactional
	public void removeVote(Long id) {
		voteRepository.delete(id);
	}
	@Override
	public Vote getVoteById(Long id) {
		return voteRepository.findOne(id);
	}

}
