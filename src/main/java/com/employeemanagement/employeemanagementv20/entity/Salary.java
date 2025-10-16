package com.employeemanagement.employeemanagementv20.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Salary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long salaryId;

    @ManyToOne
    @JoinColumn(name = "employeeId")
    private employee employees;

    private Double baseSalary;
    private Double bonus;
    private Double deductions;
    private LocalDate payDate;
    private String paymentStatus;

}
