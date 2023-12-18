package com.rndayala.hibernate.datetime.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name="Implementers")
public class Implementers 
{
	@Id
	@Column(name="id")
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="join_date")
	@Temporal(TemporalType.DATE)
	private Date date;
	
	@Column(name="join_time")
	@Temporal(TemporalType.TIME)
	private Date time;
	
	@Column(name="join_dateAndTime")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateAndTime;
	
	public Implementers() {
		System.out.println("Implementers class object created using default constructor");
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date  getTime() {
		return time;
	}

	public void setTime(Date  localTime) {
		this.time = localTime;
	}

	public Date getDateAndTime() {
		return dateAndTime;
	}

	public void setDateAndTime(Date dateAndTime) {
		this.dateAndTime = dateAndTime;
	}

	@Override
	public String toString() {
		return "Implementers [id=" + id + ", name=" + name + ", date=" + date + ", time=" + time + ", dateAndTime="
				+ dateAndTime + "]";
	}

}
