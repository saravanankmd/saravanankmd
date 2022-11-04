package net.javaguides.springboot.Service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.Model.Employee;
import net.javaguides.springboot.Repository.EmployeeRepository;
import net.javaguides.springboot.Service.EmployeeService;

@Service
public class EmployeeImpl implements EmployeeService {

@Autowired
private EmployeeRepository employeeRepositor;
public List<Employee> getAllEmployees()
{
	return employeeRepositor.findAll();
}

public void saveEmployee(Employee employee)
{
this.employeeRepositor.save(employee);
}
public Employee getEmployeeById(int id)
{
	Optional<Employee> optional=employeeRepositor.findById(id);
Employee employee= null;
if(optional.isPresent())
{
	employee=optional.get();
}
else
{
	throw new RuntimeException("Employee Not Found");
}
return employee;	
}
public void DeleteEmployeeById(int id)
{
this.employeeRepositor.deleteById(id);	
}
}