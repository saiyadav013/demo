package com.CollegeManagement.Springbootmysql;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class personaldetails {
	@Id
	private int id;
	private String name;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
		
		
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	public void returnName()
	{
		System.out.println("this is  sai");
	}

}
