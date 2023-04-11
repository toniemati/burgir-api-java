package com.burgir.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class EmployeeService {

  @Autowired
  private EmployeeRepository employeeRepository;

  public List<Employee> index() {
    return this.employeeRepository.findAll();
  }

  public Employee store(Employee employee) {
    return this.employeeRepository.save(employee);
  }

  public Employee show(Long id) {
    boolean exists = this.employeeRepository.existsById(id);

    if (!exists) {
      throw new IllegalStateException("employee with ID: " + id + " does not exist!");
    }

    return this.employeeRepository.findById(id).get();
  }

  @Transactional
  public Employee update(Long id, String firstName, String lastName) {
    Employee employee = this.employeeRepository.findById(id)
        .orElseThrow(() -> new IllegalStateException("Employee with ID: " + id + " does not exist!"));

    if (firstName != null) {
      employee.setfirstName(firstName);
    }

    if (lastName != null) {
      employee.setlastName(lastName);
    }

    return employee;
  }

  public Employee destroy(Long id) {
    boolean exists = this.employeeRepository.existsById(id);

    if (!exists) {
      new IllegalStateException("Employee with ID: " + id + " does not exist!");
    }

    Employee employee = this.employeeRepository.findById(id).get();

    this.employeeRepository.deleteById(id);

    return employee;
  }

}
