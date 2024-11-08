package com.gbt.ems.controllers;

import com.gbt.ems.dto.EmployeeDto;
import com.gbt.ems.services.EmployeeService;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

  @GetMapping("{id}")
  public ResponseEntity<EmployeeDto> getEmployee(@PathVariable("id") Long id) {
    EmployeeDto employee = employeeService.getEmployee(id);
    return ResponseEntity.ok(employee);
  }

  @GetMapping
  public ResponseEntity<List<EmployeeDto>> getAllEmployees() {
    List<EmployeeDto> employees = employeeService.getAllEmployees();
    return ResponseEntity.ok(employees);
  }
}
