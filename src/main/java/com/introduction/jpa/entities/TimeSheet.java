package com.introduction.jpa.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.ToString;

import java.util.List;
import java.util.Set;

@Entity
@ToString
public class TimeSheet {

    @Id
    @GeneratedValue
    private long timeSheetId;

    private String startTime;

    private String endTime;

    @JsonIgnore
    @ManyToOne(targetEntity = Project.class)
    @JoinColumn(name = "timesheet_to_project")
    private Project projects;

    @JsonIgnore
    @ManyToOne(targetEntity = Employee.class)
    @JoinColumn(name = "emp_to_timesheet")
    private Employee employees;

    public long getTimeSheetId() {
        return timeSheetId;
    }

    public void setTimeSheetId(long timeSheetId) {
        this.timeSheetId = timeSheetId;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Project getProjects() {
        return projects;
    }

    public void setProjects(Project projects) {
        this.projects = projects;
    }

    public Employee getEmployees() {
        return employees;
    }

    public void setEmployees(Employee employees) {
        this.employees = employees;
    }

}
