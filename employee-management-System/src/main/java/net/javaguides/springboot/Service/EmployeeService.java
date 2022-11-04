package net.javaguides.springboot.Service;

import java.util.List;

import net.javaguides.springboot.Model.Employee;

public interface EmployeeService {
List<Employee> getAllEmployees();
void saveEmployee(Employee employee);
Employee getEmployeeById(int id);
void DeleteEmployeeById(int id);
}
