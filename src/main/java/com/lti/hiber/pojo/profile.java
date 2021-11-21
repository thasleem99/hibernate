package com.lti.hiber.pojo;
//Entity class POJO
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="personaldetails")
public class profile 
{
	@Id
	@Column(name="identityno")
	private int idno;
	@Column(name="firstname")
	private String firstName;
	private String lastName;
	@Column(name="personcity")
	private String city;
	
	
	
	
	@Override
	public String toString() {
		return "profile [idno=" + idno + ", firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + "]";
	}

	public profile() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public profile(int idno, String firstName, String lastName, String city) {
		super();
		this.idno = idno;
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
	}
	public int getIdno() {
		return idno;
	}
	public void setIdno(int idno) {
		this.idno = idno;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	

}
