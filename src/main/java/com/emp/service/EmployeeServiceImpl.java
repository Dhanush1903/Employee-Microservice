package com.emp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.emp.entity.Employee;
@Service
public class EmployeeServiceImpl implements IEmployeeService{

	//Dummy Employee list
	
	List<Employee> list= List.of(new Employee(1234L,"Tony","99784325"),
			new Employee(1334L,"Tony","99784325"),
			new Employee(1564L,"Sam","9978432785"),
			new Employee(12787L,"Max","99784534325"),
			new Employee(1239874L,"Peter","99784378625"),
			new Employee(1234234L,"Will","99756784325"),
			new Employee(127734L,"Bruce","909884325"),
			new Employee(6578L,"Sofia","99786784325"));
	
	
			
	@Override
	public Employee getEmployee(Long id) {
		// TODO Auto-generated method stub
		return list.stream().filter(employee-> employee.geteId().equals(id)).findAny().orElse(null);
	}

}
