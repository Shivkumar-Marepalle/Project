package com.employee.srvices.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.srvices.Model.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
