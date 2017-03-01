package com.rimi.oa.action;



import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.ActionSupport;
import com.rimi.oa.entity.User;
import com.rimi.oa.serviceImpl.UserServiceImpl;

@ParentPackage(value="struts-default")
@Namespace(value="/")
public class UserAction extends ActionSupport{


	private User paramUser;
	private User resultUser;
	private String errorMessage;
	
	private UserServiceImpl userServiceImpl = new UserServiceImpl();

	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public User getParamUser() {
		return paramUser;
	}
	public void setParamUser(User paramUser) {
		this.paramUser = paramUser;
	}
	public User getResultUser() {
		return resultUser;
	}
	public void setResultUser(User resultUser) {
		this.resultUser = resultUser;
	}
	
	@Action(value="login_page",results={
			@Result(name="success",location="/WEB-INF/jsp/login.jsp")
			})
	public String loginPage(){
		return SUCCESS;
	}
	
	@Action(value="login",results={
			@Result(name="success",location="/WEB-INF/jsp/index.html"),
			@Result(name="error",location="/WEB-INF/jsp/login.jsp")
			})
	public String login(){
		Map<String, Object> result = null;
		if(paramUser !=null){
			result = userServiceImpl.login(paramUser);
			resultUser = result.get("user") == null ? null : (User)result.get("user");
		}
		if(resultUser !=null){
			return "success";
		}else{
			errorMessage = result.get("error") == null ? null : (String)result.get("error");
			return "error";
		}
	}
}
