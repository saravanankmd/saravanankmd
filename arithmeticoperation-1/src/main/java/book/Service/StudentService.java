package book.Service;

import java.util.List;

import book.Model.Student;

public interface StudentService {
	public List<Student> getAllStudents();

	public Student getStudentById(long studentid);

	public void deletestudent(long studentid);

	public Student savestudent(Student students);

	public Student update(long studentid,Student students);

}
