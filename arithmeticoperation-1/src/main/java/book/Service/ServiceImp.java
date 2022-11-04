package book.Service;

import java.util.List;
import java.util.Optional;
import org.hibernate.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import book.Model.Student;
import book.Repository.StudentRepository;
@Service
public class ServiceImp implements StudentService{
@Autowired
StudentRepository studentRepository;
@Override
public List<Student> getAllStudents()
{
	return studentRepository.findAll();
}
@Override
public Student getStudentById(long studentid)
{
return studentRepository.findById(studentid).get();
}
@Override
public void deletestudent(long studentid)
{
	studentRepository.deleteById(studentid);
}

public Student savestudent(Student students)
{
return studentRepository.save(students);
}


public Student update(long studentid,Student students)
{    
	Student student=null;
	Optional<Student> opt=studentRepository.findById(studentid);
	if(opt.isPresent())
	{
		student=opt.get();
		student.setStudentid(studentid);
		student.setDepartment(students.getDepartment());
		student.setDob(students.getDob());
		student.setName(students.getName());
	
	}
	

return  studentRepository.save(student);
}

}

