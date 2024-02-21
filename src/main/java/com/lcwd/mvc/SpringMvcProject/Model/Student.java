package com.lcwd.mvc.SpringMvcProject.Model;

public class Student 
{
	private String name;
	private int studId;
	private int phoneNumber;
	private String dept;
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", studId=" + studId + ", phoneNumber=" + phoneNumber + ", dept=" + dept + "]";
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
}
