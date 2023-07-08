package com.employee.srvices.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	private String First_Name;
	private String Last_Name;
	private String Email;
	private int Age;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String first_Name, String last_Name, String email, int age) {
		super();
		First_Name = first_Name;
		Last_Name = last_Name;
		Email = email;
		Age = age;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirst_Name() {
		return First_Name;
	}
	public void setFirst_Name(String first_Name) {
		First_Name = first_Name;
	}
	public String getLast_Name() {
		return Last_Name;
	}
	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", First_Name=" + First_Name + ", Last_Name=" + Last_Name + ", Email=" + Email
				+ ", Age=" + Age + "]";
	}
	
}
