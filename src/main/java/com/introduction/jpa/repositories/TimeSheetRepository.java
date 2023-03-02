package com.introduction.jpa.repositories;

import com.introduction.jpa.entities.TimeSheet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeSheetRepository extends JpaRepository<TimeSheet,Integer> {
}
