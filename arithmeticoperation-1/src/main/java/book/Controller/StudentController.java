package book.Controller;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity <List<Student>> getAllStudents()   
	{ 
		List<Student> Ls=studentService.getAllStudents(); 
		return new ResponseEntity <List<Student>>(Ls,HttpStatus.OK);
	}  
	//creating a get mapping that retrieves the detail of a specific student  
	@GetMapping("/student/{studentid}")  
	public ResponseEntity <?> getstudents(@PathVariable("studentid") long studentid)   
	{  
		
	Student Sid= studentService.getStudentById(studentid);
	return new ResponseEntity <Student>(Sid,HttpStatus.OK);
	}  
	//creating a delete mapping that deletes a specified student  
	@DeleteMapping("/student/{studentid}")  
	public String deletestudent(@PathVariable("studentid") long studentid)   
	{ 
	studentService.deletestudent(studentid);
	return studentid  +"Id is deleted Sucessfully";
	}  
	//creating post mapping that post the book detail in the database  
	@PostMapping("/students")  
	public ResponseEntity<?> savestudent(@RequestBody Student students)   
	{  
      Student SS=studentService.savestudent(students);  
     return new ResponseEntity<Student>(HttpStatus.CREATED);
	}  
	//creating put mapping that updates the student detail   
	@PutMapping("/students/{studentid}")  
	public ResponseEntity <?>  update(@PathVariable("studentid") long studentid,@RequestBody Student students)   
 	{  
	Student US= studentService.update(studentid,students);
	return new ResponseEntity<Student>(US,HttpStatus.ACCEPTED);
	}  
	}  
 
