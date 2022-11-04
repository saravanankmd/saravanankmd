/**
 * 
 */
package net.javaguides.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.Model.Employee;

/**
 * @author hai
 *
 */
@Repository

public interface EmployeeRepository extends JpaRepository <Employee, Integer>{

}
