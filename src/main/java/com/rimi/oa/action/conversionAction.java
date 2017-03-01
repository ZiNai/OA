package com.rimi.oa.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.rimi.oa.service.conversionservice;
import com.rimi.oa.serviceImpl.conversionserviceimpl;

@Namespace("/")
public class conversionAction {
	private String dollar;
	private String RMB;
	
	
	public String getDollar() {
		return dollar;
	}


	public void setDollar(String dollar) {
		this.dollar = dollar;
	}


	public String getRMB() {
		return RMB;
	}


	public void setRMB(String rMB) {
		RMB = rMB;
	}


	@Action(value="show",results={@Result(name="success",location="/show.jsp")})
	public String goshow(){
		conversionservice conversionservice = new conversionserviceimpl();
		
		RMB = conversionservice.conversion(dollar);
		
		return "success";
	}
}
