package net.javaguides.springboot.student;

import java.time.LocalDate;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
@RequestMapping(path="api/v1/student")

public class studentcontroller

{
	
private final studentservice studentservice;
@Autowired
public studentcontroller(studentservice studentservice) {
	this.studentservice = studentservice;
}
@GetMapping
public  List<student> getstudents()
	{
return studentservice.getstudents();
	} 

}