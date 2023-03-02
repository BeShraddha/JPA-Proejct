package com.introduction.jpa.service;

import com.introduction.jpa.dto.Response;
import com.introduction.jpa.entities.Employee;
import com.introduction.jpa.entities.Project;
import com.introduction.jpa.repositories.EmployeeRepository;
import com.introduction.jpa.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ProjectRepository projectRepository;
    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Response getName(int id) {
        return new Response(employeeRepository.getName(id).get(0).getName());
    }

    @Override
    public Employee AssignProjectToEmployee(int empId, int projectId) {
        Set<Project> set = null;
        Project project = projectRepository.findById(projectId).get();
        Employee employee = employeeRepository.findById(empId).get();
        set = employee.getAssignProjects();
        set.add(project);
        employee.setAssignProjects(set);
        return employeeRepository.save(employee);
    }
}
