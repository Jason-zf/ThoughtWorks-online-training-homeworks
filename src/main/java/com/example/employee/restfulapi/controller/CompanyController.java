package com.example.employee.restfulapi.controller;

import com.example.employee.restfulapi.entity.Company;
import com.example.employee.restfulapi.entity.Employee;
import com.example.employee.restfulapi.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping(value = "/companies")
public class CompanyController {
    @Autowired
    private CompanyRepository companyRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Company> findAll() {
        return companyRepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Company findById(@PathVariable Long id) {
        return companyRepository.findOne(id);
    }

    @RequestMapping(value = "/{id}/employees", method = RequestMethod.GET)
    public Set<Employee> findEmployeesByCompanyId(@PathVariable Long id) {
        return companyRepository.findOne(id).getEmployees();
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public void addOne(@RequestBody Company company) {
        companyRepository.saveAndFlush(company);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public void updataOne(@PathVariable Long id, @RequestBody Company company) {
        Company company1 = companyRepository.findOne(id);
        company1.setCompanyName(company.getCompanyName());
        company1.setEmployeesNumber(company.getEmployeesNumber());
        companyRepository.saveAndFlush(company1);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteOne(@PathVariable Long id) {
        companyRepository.delete(id);
    }


}
