package com.burgir.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.burgir.BurgirController;

@RestController
public class EmployeeController extends BurgirController {

  @Autowired
  private EmployeeService employeeService;

  @GetMapping("/employee")
  public List<Employee> index() {
    return this.employeeService.index();
  }

  @PostMapping("/employee")
  public Employee store(@RequestBody Employee employee) {
    return this.employeeService.store(employee);
  }

  @GetMapping("/Employee/{id}")
  public Employee show(@PathVariable("id") Long id) {
    return this.employeeService.show(id);
  }

  @PutMapping("/Employee/{id}")
  public Employee update(
      @PathVariable("id") Long id,
      @RequestParam(required = false) String firstName,
      @RequestParam(required = false) String lastName) {

    return this.employeeService.update(id, firstName, lastName);
  }

  @DeleteMapping("/Employee/{id}")
  public Employee destroy(@PathVariable("id") Long id) {
    return this.employeeService.destroy(id);
  }

}
