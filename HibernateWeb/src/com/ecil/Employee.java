package com.ecil;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="EMP_TBLE",schema="BMS")
public class Employee
{
	
@Id
@Column(name="ENO")
@SequenceGenerator(name="EMP_SEQ",sequenceName="EMP_SEQ",allocationSize=1)
@GeneratedValue(generator="EMP_SEQ",strategy=GenerationType.SEQUENCE)
private Integer eno;
@Column(name="NAME")
private String name;
@Column(name="SALARY")
private Double salary;



public Integer getEno() {
	return eno;
}
public void setEno(Integer eno) {
	this.eno = eno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Double getSalary() {
	return salary;
}
public void setSalary(Double salary) {
	this.salary = salary;
}

}
