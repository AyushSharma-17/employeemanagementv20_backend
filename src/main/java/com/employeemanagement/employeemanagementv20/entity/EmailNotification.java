package com.employeemanagement.employeemanagementv20.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class EmailNotification {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long notificationId;

    @OneToOne
    @JoinColumn(name="taskId")
    private Task task;

    @ManyToOne
    @JoinColumn(name="sendTo")
    private employee sendTo;

    private LocalDate sentDate;
    private String subject;
    private String status; // e.g., Sent, Failed
}
