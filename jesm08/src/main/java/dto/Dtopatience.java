package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dtopatience
{
	@Id
private  int pid;
private String  pname;
private String pblood;
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public String getPblood() {
	return pblood;
}
public void setPblood(String pblood) {
	this.pblood = pblood;
}

}
