package com.employeemanagement.employeemanagementv20.entity;


import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class employee {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String employeename;
  private String password;
  private String designature;
  

  private String firstName;
  private String lastName;
  private String email;
  private String phone;
  private LocalDate dateOfJoining;
  private String status;

  @ManyToOne
  @JoinColumn(name="departmentId")
  private Department department;

  @ManyToOne
  @JoinColumn(name="roleId")
  private Role role;


}
