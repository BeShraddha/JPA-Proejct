package com.introduction.jpa.repositories;

import com.introduction.jpa.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Integer> {
}
