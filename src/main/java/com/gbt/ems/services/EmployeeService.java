package com.gbt.ems.services;

import com.gbt.ems.dto.EmployeeDto;

public interface EmployeeService {
  EmployeeDto createEmployee(EmployeeDto employeeDto);
  EmployeeDto getEmployee(Long id);
}
