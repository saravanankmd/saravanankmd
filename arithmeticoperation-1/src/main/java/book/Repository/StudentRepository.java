package book.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import book.Model.Student;
@Repository
public interface StudentRepository extends JpaRepository <Student, Long>
{

}
