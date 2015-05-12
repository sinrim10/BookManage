package com.buch.publisher.service;

import java.util.List;
import java.util.Map;

import com.buch.publisher.model.PublisherVo;

public interface PublisherService {
	public int insert(PublisherVo m ) ;
	public int count(boolean _search, String searchField, String searchString, String searchOper) ;
	public int count() ;
	public List<PublisherVo> listPublisher(boolean _search, int page, int rows,
			String sidx, String sord, String searchField, String searchString,
			String searchOper) ;
	public int goodsUpdate(PublisherVo m);
	public int update(PublisherVo vo);
	public List<PublisherVo> searchList(Map<String,Object> searchString,int ca);
}
