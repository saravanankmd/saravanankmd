package hashmap;

public class contact {
	
private String Id;
private String name;
private String phone;
public String getId() {
	return Id;
}
public void setId(String id) {
	Id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
@Override
public String toString() {
	return "contact [Id=" + Id + ", name=" + name + ", phone=" + phone + "]";
}


}
