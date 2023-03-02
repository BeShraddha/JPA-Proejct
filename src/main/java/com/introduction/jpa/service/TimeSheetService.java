package com.introduction.jpa.service;

import com.introduction.jpa.entities.Employee;
import com.introduction.jpa.entities.TimeSheet;

public interface TimeSheetService {
    public TimeSheet manageTimeSheet(int empId, int projectId, TimeSheet timeSheet);

}
