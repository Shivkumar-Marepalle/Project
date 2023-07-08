package com.employee.srvices.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.srvices.Model.Employee;
import com.employee.srvices.Repository.EmployeeRepository;

@Service
public class Employee_Service {

	@Autowired 
	private EmployeeRepository emprepo;

	public Employee SaveEmployee(Employee employee) {
		return emprepo.save(employee);
	}

	public List<Employee> getAllEmployee() {
		return emprepo.findAll();
	}

	public Optional<Employee> getByEmployeeId(Integer id) {
		return emprepo.findById(id);
	}

	public Employee UpdateEmployee(Employee newentity, Integer id) {
		Employee oldentity=emprepo.findById(id).get();
		if(oldentity !=null) {
			if(newentity.getFirst_Name() !=null) {
				oldentity.setFirst_Name(newentity.getFirst_Name());
			}
			if(newentity.getLast_Name() !=null) {
				oldentity.setLast_Name(newentity.getLast_Name());
			}
			if(newentity.getEmail() !=null) {
				oldentity.setEmail(newentity.getEmail());
			}
			oldentity.setAge(newentity.getAge());
			
			emprepo.save(oldentity);
		}
		return oldentity;
	}

	public void DeleteEmployee(Integer id) {
      Employee oldentity=emprepo.findById(id).get();
      if(oldentity !=null) {
    	  emprepo.delete(oldentity);
      }
	}

	
	
	
}
