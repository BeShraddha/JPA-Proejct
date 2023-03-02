package com.introduction.jpa.controllers;

import com.introduction.jpa.entities.TimeSheet;
import com.introduction.jpa.service.TimeSheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/timesheet")
public class TimeSheetController {

    @Autowired
    private TimeSheetService timeSheetService;

    @PostMapping("{empId}/fill/{projectId}")
    TimeSheet addTimeSheet(@PathVariable int empId, @PathVariable int projectId, @RequestBody TimeSheet timeSheet) {
        return timeSheetService.manageTimeSheet(empId, projectId, timeSheet);
    }
}
