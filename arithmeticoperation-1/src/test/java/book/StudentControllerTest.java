package book;

import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import book.Controller.StudentController;
import book.Model.Student;
import book.Repository.StudentRepository;
@DataJpaTest
@AutoConfigureTestDatabase(replace=Replace.NONE)
public class StudentControllerTest {
@Autowired
StudentRepository strep;
@Test
	public void testgetAllstudents()
	{
		  Student student=new Student();
		/*student.setName("Ajith");
		student.setDepartment("Mech");
		student.setDob("4.1.1984");
		student.setStudentid(1);*/
		Assertions.assertFalse(strep.findAll().isEmpty());
		Assertions.assertNotNull(student);
	}
@Test
public void testgetstudent()
{
long id=25;
Optional<Student> student1= strep.findById(id);
Assertions.assertEquals(id,student1.get().getStudentid());
}
@Test

public void teststudentsaved()
{
	 Student student=new Student();
	student.setName("Ajith");
	student.setDepartment("Mech");
	student.setDob("10.10.1984");
	student.setStudentid(25);
	Student SaveStudent=strep.save(student);
	Assertions.assertNotNull(SaveStudent);
}

@Test

public void teststudentUpdate()
{
	 Student student=new Student();
	
	long id=25;
	Optional<Student> student1= strep.findById(id);
	Assertions.assertEquals(id,student1.get().getStudentid());
	student=student1.get();
	student.setName("vimal");
	student.setDepartment("ECE");
	student.setDob("10.10.1998");	
	Student UpdateStudent=strep.save(student);
	Assertions.assertNotNull(UpdateStudent);
}
@Test
@Rollback(false)
public void teststudentDelete()
{
	 Student student=new Student();
	
	long id=25;
	Optional<Student> student1= strep.findById(id);
	Assertions.assertEquals(id,student1.get().getStudentid());	
	strep.deleteById(id);
	Assertions.assertNull( student1.get().getStudentid());
}

}
