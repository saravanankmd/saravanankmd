package student;

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
	public  List<student> getstudents()
	{
		return List.of(new student(10L,
				"saran",
				"saran@gmail.com",
				35,
				LocalDate.of(2000,9,5)
				));
	} 
	

//private final studentservice studentservice;
/*@Autowired
public studentcontroller(studentservice studentservice) {
	this.studentservice = studentservice;
}
@GetMapping
public  List<student> getstudents()
	{
return studentservice.getstudents();
	}*/ 

}