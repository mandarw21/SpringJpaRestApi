package com.drakseid.spring.services;

import com.drakseid.entities.Employee;
import com.drakseid.spring.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao dao;

    public void setEmployeeDao(EmployeeDao dao) {
        this.dao=dao;
    }

    @Override
    public void create(Employee employee) {
        // TODO Auto-generated method stub
        dao.save(employee);

    }

    @Override
    public void edit(Employee employee) {
        // TODO Auto-generated method stub
        dao.save(employee);

    }

    @Override
    public void remove(Employee employee) {
        // TODO Auto-generated method stub
        dao.delete(employee);
    }

    @Override
    public Employee findByEmpId(int id) {
        // TODO Auto-generated method stub
        Optional<Employee> optionalEmp = dao.findById(id);
        return optionalEmp.get();
    }

    @Override
    public List<Employee> findAllEmloyees() {
        // TODO Auto-generated method stub
        List<Employee> employees = dao.findAll();
        return employees;
    }
}
