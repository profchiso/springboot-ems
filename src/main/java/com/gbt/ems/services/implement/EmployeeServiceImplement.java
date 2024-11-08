package com.gbt.ems.services.implement;

import com.gbt.ems.dto.EmployeeDto;
import com.gbt.ems.entities.Employee;
import com.gbt.ems.mappers.EmployeeMapper;
import com.gbt.ems.repositories.EmployeeRepository;
import com.gbt.ems.services.EmployeeService;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;

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

  @Override
  public EmployeeDto getEmployee(Long id) {
    Employee employee = employeeRepository
      .findById(id)
      .orElseThrow(() ->
        new ResourceAccessException("Employee with id " + id + " not found")
      );
    return EmployeeMapper.mapToEmployeeDto(employee);
  }

  @Override
  public List<EmployeeDto> getAllEmployees() {
    List<Employee> employees = employeeRepository.findAll();
    return employees
      .stream()
      .map(emp -> EmployeeMapper.mapToEmployeeDto(emp))
      .collect(Collectors.toList());
  }
}
