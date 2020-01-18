package com.accp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Department;
import com.accp.domain.DepartmentExample;
import com.accp.domain.Dimission;
import com.accp.domain.Staff;
import com.accp.service.departmentService;
import com.accp.service.dimissionService;
import com.accp.service.staffService;

//离职登记Controller
@RestController
@RequestMapping("/exitRegistration")
public class exitRegistrationController {

	@Autowired
	dimissionService ds;
	@Autowired
	departmentService dms;
	@Autowired
	staffService ss;
	
	@RequestMapping("/queryDimissionInfo")
	public List<Dimission> queryDimissionInfo(){
		List<Dimission> list=ds.queryDimissionInfo();
		for(int i=0;i<list.size();i++) {
			if(i==0) {
				list.get(i).setCheck(true);
			}else {
				list.get(i).setCheck(false);	
			}
		}
		return list;
	}
	
	@RequestMapping("/selectAllDepartment")
	public List<Department> selectAllDepartment(){
		List<Department> list=dms.selectAllDepartment();
		return list;
	}
	
	@RequestMapping("/selectStaffByCondition")
	public List<Staff> selectStaffByCondition(String departmentname){
		List<Staff> list=ss.selectStaffByCondition(departmentname);
		for(int i=0;i<list.size();i++) {
			if(i==0) {
				list.get(i).setCheck(true);
			}else {
				list.get(i).setCheck(false);	
			}
		}
		return list;
	}
}
