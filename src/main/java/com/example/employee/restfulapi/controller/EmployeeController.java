package com.example.employee.restfulapi.controller;

import com.example.employee.restfulapi.entity.Company;
import com.example.employee.restfulapi.entity.Employee;
import com.example.employee.restfulapi.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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

    @RequestMapping(value = "/page/{pageNumber}/pageSize/{pageSize}", method = RequestMethod.GET)
    public Page<Employee> findAllByPages(@PathVariable Integer pageNumber, @PathVariable Integer pageSize) {
        return employeeRepository.findAll(new PageRequest(pageNumber - 1, pageSize, Sort.Direction.ASC, "id"));
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
    public String addOne(@RequestBody Employee employee) {
        employeeRepository.saveAndFlush(employee);
        return "add " + employee.getName() + " success!";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String updateOne(@PathVariable Long id, @RequestBody Employee employee) {
        Employee employee1 = employeeRepository.findOne(id);
        String res = "update " + employee1.getName() + " success!";
        employee1.setName(employee.getName());
        employee1.setAge(employee.getAge());
        employee1.setGender(employee.getGender());
        employee1.setCompanyId(employee.getCompanyId());
        employee1.setSalary(employee.getSalary());
        employeeRepository.saveAndFlush(employee1);
        return res;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteOne(@PathVariable Long id) {
        String res = "delete " + employeeRepository.findOne(id).getName() + " success!";
        employeeRepository.delete(id);
        return res;
    }

}
