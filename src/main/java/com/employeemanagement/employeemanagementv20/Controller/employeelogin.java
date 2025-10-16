package com.employeemanagement.employeemanagementv20.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employeemanagement.employeemanagementv20.Repository.employeeRepo;
import com.employeemanagement.employeemanagementv20.entity.employee;


@RestController
@RequestMapping("/api")
@CrossOrigin (origins="*")
public class employeelogin {
    // @Autowired
    // private employeeRepo employeerepo;
         // Login endpoint
  // @PostMapping("/login")
  //  public String login(@RequestBody employee employees) {
    // String username = employees.getEmployeename();
    // String password = employees.getPassword();

    // if (username != null && password != null) {
      // return employeerepo.findByEmployeenameAndPassword(username, password)
          // .map(e -> "Login successful")
          // .orElse("Invalid credentials");
    // } else {
      // return "Username and password must not be null";
    // }
 
  // }

        //get all employeename,designature,department



}
    


  

