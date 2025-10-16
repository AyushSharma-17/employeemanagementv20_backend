package com.employeemanagement.employeemanagementv20.entity;

import java.time.LocalDate;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class LeaveRequest {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long leaveId;

    @ManyToOne
    @JoinColumn(name="employeeId")
    private employee employee;
    private LocalDate startDate;
    private LocalDate endDate;
    private String leaveType;
    private String status; // e.g., Pending, Approved, Rejected
}
