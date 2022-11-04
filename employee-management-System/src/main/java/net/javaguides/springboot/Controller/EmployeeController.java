package net.javaguides.springboot.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import net.javaguides.springboot.Model.Employee;
import net.javaguides.springboot.Service.EmployeeService;

@Controller

public class EmployeeController {
	@Autowired
private EmployeeService employeeService;
@GetMapping("/")
public String ViewHomePage(Model Model)
{
Model.addAttribute("ListEmployees",employeeService.getAllEmployees() );
return "index";

}
@GetMapping("/shownewEmployeeForm")
public String shownewEmployeeForm(Model Model)
{
Employee employee=new Employee();
Model.addAttribute("Employee", employee);
return "new_form";
}
@PostMapping("/saveEmployee")
public String saveEmployee(@ModelAttribute("employee")Employee employee)
{
	employeeService.saveEmployee(employee);
	return "redirect:/";
}
@GetMapping("/updateEmployee/{id}")
public String updateEmployee(@PathVariable (value= "id")int id, Model Model)
{
	Employee employee=employeeService.getEmployeeById(id);
	Model.addAttribute("Employee", employee);
return "new_form";
}
@GetMapping("/DeleteEmployee/{id}")
public String DeleteEmployee(@PathVariable (value= "id")int id, Model Model)
{
	employeeService.DeleteEmployeeById(id);
	return  "redirect:/";
}

}