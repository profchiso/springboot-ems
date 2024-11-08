package com.gbt.ems.services;

import com.gbt.ems.dto.EmployeeDto;
import java.util.List;

public interface EmployeeService {
  EmployeeDto createEmployee(EmployeeDto employeeDto);
  EmployeeDto getEmployee(Long id);
  List<EmployeeDto> getAllEmployees();
  EmployeeDto updateEmployee(Long id, EmployeeDto employeeDto);
}
