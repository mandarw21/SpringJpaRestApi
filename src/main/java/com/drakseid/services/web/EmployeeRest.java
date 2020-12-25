package com.drakseid.services.web;

import com.drakseid.entities.Employee;
import com.drakseid.spring.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeRest {

    @Autowired
    private EmployeeService service;

    public void setEmployeeService(EmployeeService service) {
        this.service = service;
    }

    @PostMapping
    public String createEmployee(@RequestBody Employee employee) {

        System.out.println(employee);
        service.create(employee);


        return "Employee created successfully";
    }

    @PutMapping
    public String editEmployee(@RequestBody Employee employee) {

        service.edit(employee);

        return "Employee edited successfully";
    }

    @DeleteMapping
    public String removeEmployee(@RequestBody Employee employee) {

        service.remove(employee);

        return "Product deleted successfully";
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable("id") int id) {

        return service.findByEmpId(id);
    }

    @GetMapping
    public List<Employee> getAllEmployees(){
        return service.findAllEmloyees();
    }
}
