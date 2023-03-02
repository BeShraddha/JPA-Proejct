package com.introduction.jpa.controllers;

import com.introduction.jpa.entities.Employee;
import com.introduction.jpa.dto.Response;
import com.introduction.jpa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/save")
    Employee saveEmployeeData(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }

    @GetMapping("/fetch-name/{name}")
    Response getName(@PathVariable int id) {
        return employeeService.getName(id);
    }

    @PutMapping("{empId}/assignProject/{projectId}")
    Employee AssignProjectToEmployee(@PathVariable int empId, @PathVariable int projectId) {
        return employeeService.AssignProjectToEmployee(empId, projectId);
    }
}
