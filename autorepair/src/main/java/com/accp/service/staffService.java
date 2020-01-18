package com.accp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.domain.Department;
import com.accp.domain.Staff;
import com.accp.domain.StaffExample;
import com.accp.mapper.StaffMapper;

@Service
@Transactional
public class staffService {

	@Autowired
	StaffMapper sm;
	
	public List<Staff> selectStaffByCondition(String departmentname){
		List<Staff> list=sm.selectStaffByCondition(departmentname);
		return list;
	}
}
