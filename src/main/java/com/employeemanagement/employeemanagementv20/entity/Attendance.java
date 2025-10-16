package com.employeemanagement.employeemanagementv20.entity;
import java.time.LocalDate;
import java.time.LocalTime;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Attendance {
    
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long attendanceId;

    @ManyToOne
    @JoinColumn(name="employeeId")
    private employee employee;

    private LocalDate date;
    private LocalTime checkInTime;
    private LocalTime checkOutTime;
    private String status; // e.g., Present, Absent, On Leave
}
