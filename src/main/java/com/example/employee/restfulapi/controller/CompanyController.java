package com.example.employee.restfulapi.controller;

import com.example.employee.restfulapi.entity.Company;
import com.example.employee.restfulapi.entity.Employee;
import com.example.employee.restfulapi.repository.CompanyRepository;
import com.sun.jndi.toolkit.dir.SearchFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
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

    @RequestMapping(value = "/page/{pageNumber}/pageSize/{pageSize}", method = RequestMethod.GET)
    public Page<Company> findAllByPages(@PathVariable Integer pageNumber, @PathVariable Integer pageSize) {
        return companyRepository.findAll(new PageRequest(pageNumber - 1, pageSize, Sort.Direction.ASC, "id"));
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String addOne(@RequestBody Company company) {
        companyRepository.saveAndFlush(company);
        return "add " + company.getCompanyName() + " success!";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String updataOne(@PathVariable Long id, @RequestBody Company company) {
        Company company1 = companyRepository.findOne(id);
        String res = "update " + company1.getCompanyName() + " success!";
        company1.setCompanyName(company.getCompanyName());
        company1.setEmployeesNumber(company.getEmployeesNumber());
        companyRepository.saveAndFlush(company1);
        return res;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteOne(@PathVariable Long id) {
        String res = "delete " + companyRepository.findOne(id).getCompanyName() + " success!";
        companyRepository.delete(id);
        return res;
    }

}
