package com.employeemanagement.employeemanagementv20.Repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employeemanagement.employeemanagementv20.entity.employee;

public interface employeeRepo extends  JpaRepository<employee, Long> {
    
    Optional<employee> findByEmployeenameAndPassword(String employeename, String password);
    // Optional<employee> getAllEmployeename(String employeename,String designature, String department);
}
