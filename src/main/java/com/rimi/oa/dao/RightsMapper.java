package com.rimi.oa.dao;

import java.util.List;

import com.rimi.oa.entity.Function;
import com.rimi.oa.entity.Rights;

public interface RightsMapper {
	
	public Rights createRights(Rights rights,List<Function> functions);
	
	public Rights changeRights(Rights rights,List<Function> functions);
	
	public boolean deleteRights(Integer id);
}
