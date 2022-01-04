package com.spring.account;

import java.util.HashMap;

public class Account {

	private String Name;
	private String Age;
	private String Email;
	private String Password;
	private String Department;
	private HashMap<String, String> DepartmentOptions;
	private String Language;
	
	public Account()
	{
		DepartmentOptions=new HashMap<String, String>();
		DepartmentOptions.put("Communication", "COMM");
		DepartmentOptions.put("Civil", "CVL");
		DepartmentOptions.put("Architecture", "ARC");
		DepartmentOptions.put("Power", "PWR");
		
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
		Age = age;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public HashMap<String, String> getDepartmentOptions() {
		return DepartmentOptions;
	}
	public void setDepartmentOptions(HashMap<String, String> departmentOptions) {
		DepartmentOptions = departmentOptions;
	}
	public String getLanguage() {
		return Language;
	}
	public void setLanguage(String language) {
		Language = language;
	}
	
}
