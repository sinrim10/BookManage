package com.buch.publisher.dao.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.buch.publisher.dao.PublisherDao;
import com.buch.publisher.model.PublisherVo;

@Repository(value="publisherDao")
public class PublishDaoImpl implements PublisherDao{

	@Autowired
	private SqlSession session;
	
	@Override
	public int insert(PublisherVo vo) {
		return session.insert("SqlPublisherMapper.publisherInsert", vo);
	}

	@Override
	public int count(Map<String, String> map) {
		return session.selectOne("SqlPublisherMapper.publisherCount",map);
	}

	@Override
	public List<PublisherVo> listPublisher(Map<String, Object> map) {		
		return session.selectList("SqlPublisherMapper.publisherList", map);
	}

	@Override
	public int goodsUpdate(PublisherVo vo) {
		return session.update("SqlPublisherMapper.publisherUpdate", vo);
	}

	@Override
	public int update(PublisherVo vo) {
		// TODO Auto-generated method stub
		return session.update("SqlPublisherMapper.publisherUpdate", vo);
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return session.selectOne("SqlPublisherMapper.publisherCount1");
	}

	@Override
	public List<PublisherVo> searchList(Map<String, Object> maps) {
		// TODO Auto-generated method stub
		return session.selectList("SqlPublisherMapper.searchList", maps);
	}

}
