package demo10;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class test10 
{
	@Id
private int id;
private String name;
private String age;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "test10 [id=" + id + ", name=" + name + ", age=" + age + "]";
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
}
