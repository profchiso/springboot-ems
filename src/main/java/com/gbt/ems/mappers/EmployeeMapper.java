package com.gbt.ems.mappers;

import com.gbt.ems.dto.EmployeeDto;
import com.gbt.ems.entities.Employee;

public class EmployeeMapper {

  public static EmployeeDto mapToEmployeeDto(Employee employee) {
    return new EmployeeDto(
      employee.getId(),
      employee.getLastName(),
      employee.getFirstName(),
      employee.getEmail()
    );
  }

  public static Employee mapToEmployee(EmployeeDto employeeDto) {
    return new Employee(
      employeeDto.getId(),
      employeeDto.getLastName(),
      employeeDto.getFirstName(),
      employeeDto.getEmail()
    );
  }
}
