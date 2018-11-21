package com.atguigu.springcloud.entity;

import java.io.Serializable;

public class Dept implements Serializable {
	private Long deptno;//主鍵
	private String dname;//部門名稱
	private String db_source;//來自那個數據庫,因爲微服務框架可以一個服務對應一個數據庫,同一個信息被存儲到不同數據庫
	
	public Long getDeptno() {
		return deptno;
	}
	public void setDeptno(Long deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDb_source() {
		return db_source;
	}
	public void setDb_source(String db_source) {
		this.db_source = db_source;
	}
	
	
}
