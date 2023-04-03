package com.JavaGuides.springBootBackEnd.repository;

import com.JavaGuides.springBootBackEnd.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    //all crud databse methods
}
