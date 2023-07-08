package com.employee.srvices.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employee.srvices.Model.Employee;
import com.employee.srvices.Service.Employee_Service;

@RestController
@RequestMapping("EmployeeInfo")
public class Employee_Controller {

	@Autowired
	private Employee_Service empservice;
	
	@PostMapping("/save")
	public Employee SaveEmployee(@RequestBody Employee employee) {
		return empservice.SaveEmployee(employee);
	}
	
	@GetMapping("/FindAll")
	public List<Employee>getAllEmployee(){
		return empservice.getAllEmployee();
	}
	
	@GetMapping("/getByid/{id}")
	public Optional<Employee> getByEmployeeId(@PathVariable("id") Integer id) {
		return empservice.getByEmployeeId(id);
	}
	
	@PutMapping("/update/{id}")
	public Employee UpdateEmployee(@RequestBody Employee employee,@PathVariable("id") Integer id) {
		return empservice.UpdateEmployee(employee,id);
		
	}
	@DeleteMapping("/delete/{id}")
	public void DeleteEmployee(@PathVariable("id") Integer id) {
		empservice.DeleteEmployee(id);
	}
}
