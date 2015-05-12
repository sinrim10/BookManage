package com.buch.publisher.dao;

import java.util.List;
import java.util.Map;

import com.buch.publisher.model.PublisherVo;

public interface PublisherDao {
	
	public int insert(PublisherVo vo ) ;
	public int count(Map<String, String> map);
	public int count();
	public List<PublisherVo> listPublisher(Map<String, Object> maps);
	public int goodsUpdate(PublisherVo vo);
	public int update(PublisherVo vo);
	public List<PublisherVo>searchList(Map<String,Object>maps);

}
