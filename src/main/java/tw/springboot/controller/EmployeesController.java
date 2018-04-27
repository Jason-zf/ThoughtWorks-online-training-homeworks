package tw.springboot.controller;

import org.springframework.web.bind.annotation.*;
import tw.springboot.core.Employee;

import java.util.*;

@RestController
@RequestMapping("/employees")
public class EmployeesController {
    static Map<Integer, Employee> employees = Collections.synchronizedMap(new HashMap<>());

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employees.values());
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Employee getEmployeeById(@PathVariable Integer id) {
        return employees.get(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String addEmployee(@RequestBody Employee employee) {
        employees.put(employee.getId(), employee);
        return "add success";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteEmployee(@PathVariable Integer id) {
        employees.remove(id);
        return "delete success";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String updateEmployee(@PathVariable Integer id, @RequestBody Employee updatedEmployee) {
        Employee employee = employees.get(id);
        employee.setName(updatedEmployee.getName());
        employee.setAge(updatedEmployee.getAge());
        employee.setGender(updatedEmployee.getGender());
        employees.put(id, employee);
        return "update success";
    }

}
