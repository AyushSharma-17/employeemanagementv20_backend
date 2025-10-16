package com.employeemanagement.employeemanagementv20.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Department {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long departmentId;
    private String departmentName;

    @OneToOne
    @JoinColumn(name="managerId")
    private employee manager;
}
