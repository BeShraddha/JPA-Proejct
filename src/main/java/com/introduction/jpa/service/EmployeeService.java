package com.introduction.jpa.service;

import com.introduction.jpa.entities.Employee;
import com.introduction.jpa.dto.Response;
import com.introduction.jpa.entities.TimeSheet;

import java.util.List;

public interface EmployeeService {

    public Employee save(Employee employee);
    public Response getName(int id);

    public Employee AssignProjectToEmployee(int empId, int projectId);

}
