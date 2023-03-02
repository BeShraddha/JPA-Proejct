package com.introduction.jpa.service;

import com.introduction.jpa.entities.Project;
import com.introduction.jpa.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService{

    @Autowired
    private ProjectRepository projectRepository;
    @Override
    public Project save(Project project) {
        return projectRepository.save(project);
    }
}
