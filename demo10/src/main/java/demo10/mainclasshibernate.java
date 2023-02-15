package demo10;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class mainclasshibernate 
{
	@Id
private String branchlandmark;
private String branchname;
private String branchcourse;
public String getBranchlandmark() {
	return branchlandmark;
}
public void setBranchlandmark(String branchlandmark) {
	this.branchlandmark = branchlandmark;
}
public String getBranchname() {
	return branchname;
}
public void setBranchname(String branchname) {
	this.branchname = branchname;
}
public String getBranchcourse() {
	return branchcourse;
}
public void setBranchcourse(String branchcourse) {
	this.branchcourse = branchcourse;
}
}
