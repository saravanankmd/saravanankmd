package net.javaguides.springboot.student;

import java.time.LocalDate;

public class student {
	private long id;
	private String name;
	private  String email;
	private int age;
	private LocalDate Dob;
public student(Long id,String name,String email,int age,LocalDate Dob)
{
	this.id=id;
	this.age=age;
	this.name=name;
	this.email=email;
	this.Dob=Dob;
	
}
public student(String name, String email, int age, LocalDate dob) 
{
	this.name = name;
	this.email = email;
	this.age = age;
	this.Dob = dob;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public LocalDate getDob() {
	return Dob;
}
public void setDob(LocalDate dob) {
	Dob = dob;
}
@Override
public String toString() {
	return "student ["
			+ "id=" + id + 
			", name=" + name + '/'+
			", email=" + email + '/'+
			", age=" + age + 
			", Dob=" + Dob + "]";
}

}
