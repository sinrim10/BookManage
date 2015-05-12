package com.buch.common;

import java.util.List;

import com.buch.publisher.model.PublisherVo;

public class JsonObjectVO {
	private int total;
	private int page;
	private int records;
//	private List<Map<Object, Object>> rows = null;
	private List<PublisherVo> rows = null;
	
	public JsonObjectVO() {
		// TODO Auto-generated constructor stub
	}
	public JsonObjectVO(int total, int page, int records, List<PublisherVo> rows){
		this.total = total;
		this.page = page;
		this.records = records;
		this.rows = rows;
	}
	
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getRecords() {
		return records;
	}
	public void setRecords(int records) {
		this.records = records;
	}
	public List<PublisherVo> getRows() {
		return rows;
	}
	public void setRows(List<PublisherVo> rows) {
		this.rows = rows;
	}
}
