package com.introduction.jpa.repositories;

import com.introduction.jpa.dto.ResponseInterface;
import com.introduction.jpa.entities.Employee;
import com.introduction.jpa.dto.Response;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    public List<ResponseInterface> getName(int id);
}
