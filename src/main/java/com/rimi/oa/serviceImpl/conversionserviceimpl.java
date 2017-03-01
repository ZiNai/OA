package com.rimi.oa.serviceImpl;

import org.apache.log4j.Logger;

import com.rimi.oa.service.conversionservice;

public class conversionserviceimpl implements conversionservice{
	private static Logger logger = Logger.getLogger(conversionserviceimpl.class);
	public String conversion(String dollar) {
		String r;
		try {
			double rate = 6.87;
			double d = Double.valueOf(dollar);
			double rmb = d*rate;
			r = String.valueOf(rmb);
		} catch (Exception e) {
			// TODO: handle exception
			
			logger.error("1",e);
			logger.info("123");
			logger.fatal("1234");
			return "!!!!";
		}

		return r;
	}
	
}
