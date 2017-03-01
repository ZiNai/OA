package com.rimi.oa.entity;

import java.util.List;

public class User {
	private Integer id;
	private String name;
	private String passWord;
	private Integer sex;
	private Integer age;
	private Integer telephone;
	private String email;
	private Integer rightsId;
	
	private Rights rights;
	private List<Function> functions;
	
	public List<Function> getFunctions() {
		return functions;
	}
	public void setFunctions(List<Function> functions) {
		this.functions = functions;
	}
	public Rights getRights() {
		return rights;
	}
	public void setRights(Rights rights) {
		this.rights = rights;
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
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getTelephone() {
		return telephone;
	}
	public void setTelephone(Integer telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getRightsId() {
		return rightsId;
	}
	public void setRightsId(Integer rightsId) {
		this.rightsId = rightsId;
	}
	
}
