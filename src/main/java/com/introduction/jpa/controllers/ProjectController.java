package com.introduction.jpa.controllers;

import com.introduction.jpa.entities.Project;
import com.introduction.jpa.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @PostMapping("/save")
    Project save(@RequestBody Project project) {
        return projectService.save(project);
    }
}
