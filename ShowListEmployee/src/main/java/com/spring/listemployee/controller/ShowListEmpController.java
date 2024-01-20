package com.spring.listemployee.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.listemployee.model.Emp;
import com.spring.listemployee.model.EmpRepository;

@RestController
@RequestMapping("/employee")
public class ShowListEmpController {
	@Autowired
	EmpRepository edao;

	@GetMapping("/listAll")
	public List<Emp> ListEmps() {
		List<Emp> emps = new ArrayList<>();    
		edao.findAll().forEach(emps::add);    
		return emps;   
		//return new ResponseEntity<>(edao.findAll(), HttpStatus.OK);
	}

	@GetMapping("/list")
	public Emp getEmp(@RequestParam("eid") int eid) {
		return edao.findById(eid).get();
	}


}

