package tw.springboot.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import tw.springboot.core.Employee;

import java.util.*;


@RestController
@RequestMapping("/employees")
public class EmployeesController {
    static Map<Integer, Employee> employees = Collections.synchronizedMap(new HashMap<>());

    public EmployeesController() {
        employees.put(0, new Employee(0, "小明", 20, "男"));
        employees.put(1, new Employee(1, "小红", 19, "女"));
        employees.put(2, new Employee(2, "小智", 15, "男"));
        employees.put(3, new Employee(3, "小刚", 16, "男"));
        employees.put(4, new Employee(4, "小霞", 15, "女"));
    }

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

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView index(ModelAndView modelAndView) {
        modelAndView.setViewName("/WEB-INF/jsp/index.jsp");
        modelAndView.addObject("employees", employees);
        return modelAndView;
    }
}
