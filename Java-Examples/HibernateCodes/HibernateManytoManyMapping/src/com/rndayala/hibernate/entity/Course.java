package com.rndayala.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course 
{
	@Id
	private Integer cid;
	
	private String cname;
	
	private Integer cost;
	
	public Course() {
		System.out.println("Creating course object using default constructor");
	}

	public Course(Integer cid, String cname, Integer cost) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cost = cost;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Integer getCost() {
		return cost;
	}

	public void setCost(Integer cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + ", cost=" + cost + "]";
	}
	
	

}
