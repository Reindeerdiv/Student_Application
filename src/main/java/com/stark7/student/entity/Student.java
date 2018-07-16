package com.stark7.student.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "info")
public class Student {
	@Id
	@Column(name = "rollnumber")
	private Integer rollnumber;

	@Column(name = "firstname")
	private String firstname;

	@Column(name = "lastname")
	private String lastname;

	@Column(name = "college")
	private String college;

	@Column(name = "city")
	private String city;

	public Student(Integer rollnumber, String firstname, String lastname, String college, String city) {
		super();
		this.rollnumber = rollnumber;
		this.firstname = firstname;
		this.lastname = lastname;
		this.college = college;
		this.city = city;
	}

	public Student() {
		super();
	}

	public Integer getRollnumber() {
		return rollnumber;
	}

	public void setRollnumber(Integer rollnumber) {
		this.rollnumber = rollnumber;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [rollnumber=" + rollnumber + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", college=" + college + ", city=" + city + "]";
	}

}
