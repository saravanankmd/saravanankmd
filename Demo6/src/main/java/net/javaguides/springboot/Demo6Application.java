package net.javaguides.springboot;


import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import student.studentcontroller;
import student.student;

@SpringBootApplication
@RestController
public class Demo6Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo6Application.class, args);
	}

	/*@GetMapping
	public  List<student> getstudents()
		{

			return List.of(new student(10L,
					"saran",
					"saran@gmail.com",
					35,
					LocalDate.of(2000,9,5)
					));
		}
*/
	}
	
