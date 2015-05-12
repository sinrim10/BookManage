package com.buch.publisher.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.buch.publisher.dao.PublisherDao;
import com.buch.publisher.model.PublisherVo;
import com.buch.publisher.service.PublisherService;

@Service(value="publisherService")
public class PublisherServiceImpl  implements PublisherService{

	
	@Autowired
	private PublisherDao dao;
	@Override
	public int insert(PublisherVo m) {
		return dao.insert(m);
	}

	@Override
	@Transactional(readOnly = true)
	public int count(boolean _search, String searchField, String searchString, String searchOper) {
		//return dao.count(m);
		Map<String, String> map = new HashMap<String, String>();
		if(_search) {
			String condition = getCondition(searchField, searchString, searchOper);
			map.put("condition", condition);
		}
		return dao.count(map);
		
	}

	@Override
	public List<PublisherVo> listPublisher(boolean _search, int page, int rows,
			String sidx, String sord, String searchField, String searchString,
			String searchOper) {
		//return dao.listPublisher(page, rows);
		Map<String, Object> map = new HashMap<String, Object>();
		
		int start = rows * page - rows;
		map.put("start", start);
		
		int stop = rows * page;
		map.put("stop", stop);
		
		map.put("sidx", sidx);
		map.put("sord", sord);
		
		if(_search) {
			String condition = getCondition(searchField, searchString, searchOper);
			map.put("condition", condition);
		}
		
		return dao.listPublisher(map);
	}

	@Override
	public int goodsUpdate(PublisherVo m) {
		return dao.goodsUpdate(m);
	}

	@Override
	public int update(PublisherVo vo) {
		// TODO Auto-generated method stub
		return dao.update(vo);
	}
	
	private String getCondition(Map<String,Object> searchString,int ca){
		switch (ca) {
		case 1:
			System.out.println("pubCd like '%"+searchString.get("pubCd")+"%'");
			return "pub_Cd like '%"+searchString.get("pubCd")+"%'";

		default:
			break;
		}
		return null;
	}
	
	private String getCondition(String searchField, String searchString, String searchOper) {
		// TODO Auto-generated method stub
		
		// like �����ڿ����� ������ ��� ���� ���ڿ��̵� ���ڵ� Ȭ���ǥ�� ���ξ� �Ѵ�.
		if(searchOper.equals("bw")) {
			return searchField + " like '" + searchString + "%'";
		} else if(searchOper.equals("bn")) {
			return searchField + " not like '" + searchString + "%'";
		} else if(searchOper.equals("ew")) {
			return searchField + " like '%" + searchString + "'";
		} else if(searchOper.equals("en")) {
			return searchField + " not like '%" + searchString + "'";
		} else if(searchOper.equals("cn")) {
			return searchField + " like '%" + searchString + "%'";
		} else if(searchOper.equals("nc")) {
			return searchField + " not like '%" + searchString + "%'";
		}

		try {
			Double.parseDouble(searchString); 	// �������� ������� �������� ���ڿ����� �����ؾ� �Ѵ�.
		} catch(NumberFormatException e) {
			searchString = "'" + searchString + "'";
		}
		
		if(searchOper.equals("eq")) {
			return searchField + " = " + searchString;
		} else if(searchOper.equals("ne")) {
			return searchField + " <> " + searchString;
		} else if(searchOper.equals("lt")) {
			return searchField + " < " + searchString;
		} else if(searchOper.equals("le")) {
			return searchField + " <= " + searchString;
		} else if(searchOper.equals("gt")) {
			return searchField + " > " + searchString;
		} else if(searchOper.equals("ge")) {
			return searchField + " >= " + searchString;
		} else if(searchOper.equals("in")) {
			return searchField + " in (" + searchString + ")";
		} else if(searchOper.equals("ni")) {
			return searchField + " not in (" + searchString + ")";
		}
		
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return dao.count();
	}

	@Override
	public List<PublisherVo> searchList(Map<String,Object> searchString,int ca) {
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<String, Object>();
		String condition = getCondition(searchString, ca);
		map.put("condition",condition);
		System.out.println(map.get("condition"));
		return dao.searchList(map);
	}

}
