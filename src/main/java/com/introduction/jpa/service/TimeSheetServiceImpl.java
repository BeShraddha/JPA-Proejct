package com.introduction.jpa.service;

import com.introduction.jpa.entities.Employee;
import com.introduction.jpa.entities.Project;
import com.introduction.jpa.entities.TimeSheet;
import com.introduction.jpa.repositories.EmployeeRepository;
import com.introduction.jpa.repositories.ProjectRepository;
import com.introduction.jpa.repositories.TimeSheetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class TimeSheetServiceImpl implements TimeSheetService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private TimeSheetRepository timeSheetRepository;

    @Override
    public TimeSheet manageTimeSheet(int empId, int projectId, TimeSheet timeSheet) {
        Employee employee = employeeRepository.findById(empId).get();
        Project project = projectRepository.findById(projectId).get();
        int i =0;
        timeSheet.setEmployees(employee);
        timeSheet.setProjects(project);
        return timeSheetRepository.save(timeSheet);
    }
}
