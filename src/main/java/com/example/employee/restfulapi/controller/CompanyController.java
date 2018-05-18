package com.example.employee.restfulapi.controller;

import com.example.employee.restfulapi.entity.Company;
import com.example.employee.restfulapi.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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


}
