package tw.springboot.controller;

import org.springframework.web.bind.annotation.RestController;
import tw.core.Employee;

import java.util.List;

@RestController
public class Employees {
    private List<Employee> employees;

    public Employees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void deleteEmployee(Integer id) {
        for (int i = 0; i < employees.size(); ++i) {
            if (employees.get(i).getId() == id) {
                employees.remove(i);
                return;
            }
        }
    }

    public Employee getEmployeeByID(Integer id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public void updateEmployee(Integer id, String str) {
        for (int i = 0; i < employees.size(); ++i) {
            if (employees.get(i).getId() == id) {
                if (str == "男性" || str == "女性") {
                    employees.get(i).setGender(str);
                    return;
                }
                employees.get(i).setName(str);
                return;
            }
        }
    }

    public void updateEmployee(Integer id, Integer age) {
        for (int i = 0; i < employees.size(); ++i) {
            if (employees.get(i).getId() == id) {
                employees.get(i).setAge(age);
                return;
            }
        }
    }

}
