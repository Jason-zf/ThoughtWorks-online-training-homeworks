package com.example.employee.restfulapi.controller;

import com.example.employee.restfulapi.entity.Employee;
import com.example.employee.restfulapi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Employee findById(@PathVariable Long id) {
        return employeeRepository.findOne(id);
    }

    @RequestMapping(value = "/male", method = RequestMethod.GET)
    public List<Employee> findAllMale() {
        return employeeRepository.findAllByGender("male");
    }

    @RequestMapping(value = "/female", method = RequestMethod.GET)
    public List<Employee> findAllFemale() {
        return employeeRepository.findAllByGender("female");
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public void addOne(@RequestBody Employee employee) {
        employeeRepository.saveAndFlush(employee);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void updateOne(@PathVariable Long id, @RequestBody Employee employee) {
        Employee employee1 = employeeRepository.findOne(id);
        employee1.setName(employee.getName());
        employee1.setAge(employee.getAge());
        employee1.setGender(employee.getGender());
        employee1.setCompanyId(employee.getCompanyId());
        employee1.setSalary(employee.getSalary());
        employeeRepository.saveAndFlush(employee1);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteOne(@PathVariable Long id) {
        employeeRepository.delete(id);
    }

}
