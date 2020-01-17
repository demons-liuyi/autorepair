package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Dimission;
import com.accp.mapper.DimissionMapper;


@Service
@Transactional
public class dimissionService {

	@Autowired
	DimissionMapper dm;
	
	public List<Dimission> queryDimissionInfo(){
		List<Dimission> list=dm.selectDimissionInfo();
		return list;
	}
}
