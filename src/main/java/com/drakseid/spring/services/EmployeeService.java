package com.drakseid.spring.services;

import com.drakseid.entities.Employee;

import java.util.List;

public interface EmployeeService {

    void create(Employee employee);
    void edit(Employee employee);
    void remove(Employee employee);

    Employee findByEmpId(int id);

    List<Employee> findAllEmloyees();
}
