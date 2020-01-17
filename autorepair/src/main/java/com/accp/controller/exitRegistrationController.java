package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Dimission;
import com.accp.service.dimissionService;

//离职登记Controller
@RestController
@RequestMapping("/exitRegistration")
public class exitRegistrationController {

	@Autowired
	dimissionService ds;
	
	@RequestMapping("/queryDimissionInfo")
	public List<Dimission> queryDimissionInfo(){
		List<Dimission> list=ds.queryDimissionInfo();
		return list;
	}
}
