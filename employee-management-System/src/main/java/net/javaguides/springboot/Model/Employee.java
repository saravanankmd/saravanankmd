package net.javaguides.springboot.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Employee")
@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column
	private String Lname;
	@Column
	private String Fname;
	@Column
	private String email;
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getLname() {
		return Lname;
	}
	
	
	public void setLname(String lname) {
		Lname = lname;
	}
	
	@Column
	public String getFname() {
		return Fname;
	}
	
	
	public void setFname(String fname) {
		Fname = fname;
	}
@Column
	public String getEmail() {
		return email;
	}
	

public void setEmail(String email) {
		this.email = email;
	}
	
}
