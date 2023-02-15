package demo10;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class hibernate
{
	@Id
private int pincode;
private String address;
private int branches;
// get the relation between class and  




public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getBranches() {
	return branches;
}
public void setBranches(int branches) {
	this.branches = branches;
}

}
