package com.example.employee.restfulapi;

import com.example.employee.restfulapi.repository.CompanyRepository;
import com.example.employee.restfulapi.repository.EmployeeRepository;
import org.flywaydb.core.Flyway;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class RestfulApiApplicationTests {
    @Autowired
    private CompanyRepository companyRepository;
    private EmployeeRepository employeeRepository;

    @Before
    public void setUp() {
        Flyway flyway = new Flyway();
        flyway.setDataSource("jdbc:mysql://localhost:3306/employee_db", "root", "root");
        flyway.clean();
        flyway.migrate();
    }
}
