package com.gbt.ems.controllers;

import com.gbt.ems.dto.EmployeeDto;
import com.gbt.ems.services.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

  private EmployeeService employeeService;

  @PostMapping
  public ResponseEntity<EmployeeDto> createEmployee(
    @RequestBody EmployeeDto employeeDto
  ) {
    EmployeeDto createdEmployee = employeeService.createEmployee(employeeDto);

    return new ResponseEntity<>(createdEmployee, HttpStatus.CREATED);
  }
}