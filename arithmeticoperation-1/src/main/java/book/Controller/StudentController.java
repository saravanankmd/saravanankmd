package book.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import book.Model.Student;
import book.Service.StudentService;

@RestController  
public class StudentController {
    
	@Autowired  
	StudentService studentService;  
	//creating a get mapping that retrieves all the books detail from the database   
	@GetMapping("/student")
	public List<Student> getAllStudents()   
	{  
	return studentService.getAllStudents();  
	}  
	//creating a get mapping that retrieves the detail of a specific student  
	@GetMapping("/student/{studentid}")  
	public Student getstudents(@PathVariable("studentid") long studentid)   
	{  
	return studentService.getStudentById(studentid);  
	}  
	//creating a delete mapping that deletes a specified student  
	@DeleteMapping("/student/{studentid}")  
	public void deletestudent(@PathVariable("studentid") long studentid)   
	{  
	studentService.deletestudent(studentid);  
	}  
	//creating post mapping that post the book detail in the database  
	@PostMapping("/students")  
	public Student savestudent(@RequestBody Student students)   
	{  
     return studentService.savestudent(students);  

	}  
	//creating put mapping that updates the student detail   
	@PutMapping("/students/{studentid}")  
	public Student update(@PathVariable("studentid") long studentid,@RequestBody Student students)   
 	{  
	return studentService.update(studentid,students);  
	}  
	}  

