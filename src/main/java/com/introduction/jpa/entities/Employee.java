package com.introduction.jpa.entities;


import jakarta.persistence.*;
import lombok.ToString;

import java.util.List;
import java.util.Set;

@Entity
@ToString
public class Employee {

    @Id
    @GeneratedValue
    private int empId;

    private String name;


    @ManyToMany
    @JoinTable(
            name = "emp_project",
            joinColumns = @JoinColumn(name = "emp_id"),
            inverseJoinColumns = @JoinColumn(name = "project_id")
    )
    private Set<Project> assignProjects;

    @OneToMany(mappedBy = "employees")
    private List<TimeSheet> timeSheet;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Set<Project> getAssignProjects() {
        return assignProjects;
    }

    public void setAssignProjects(Set<Project> assignProjects) {
        this.assignProjects = assignProjects;
    }

    public List<TimeSheet> getTimeSheet() {
        return timeSheet;
    }

    public void setTimeSheet(List<TimeSheet> timeSheet) {
        this.timeSheet = timeSheet;
    }
}
