package com.gbt.ems.services.implement;

import com.gbt.ems.dto.EmployeeDto;
import com.gbt.ems.entities.Employee;
import com.gbt.ems.mappers.EmployeeMapper;
import com.gbt.ems.repositories.EmployeeRepository;
import com.gbt.ems.services.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceImplement implements EmployeeService {

  private EmployeeRepository employeeRepository;

  @Override
  public EmployeeDto createEmployee(EmployeeDto employeeDto) {
    Employee employee = EmployeeMapper.mapToEmployee(employeeDto);

    Employee createdEmployee = employeeRepository.save(employee);
    return EmployeeMapper.mapToEmployeeDto(createdEmployee);
  }
}