package com.axelor.hibernate;

import javax.annotation.Nonnull;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;



//@Table(name="BIKE") //it is use change the table name


//add Constraint in two column
@Table(
		name="Bikes", uniqueConstraints = { @UniqueConstraint(columnNames = { "Brand","BIKENAME" }) }
		)

@Entity
public class Bike
{
	@Id  //it is for define the primarykey
//	@GeneratedValue(strategy=GenerationType.AUTO) //it generate auto serialno
	private int Serialno;
	
	@Nonnull //it define notnull constraint 
	private String Brand;
	
	@Column(name = "BIKENAME") //it change the column name
	private String Bikename;
	
	
	
	
	public int getSerialno() {
		return Serialno;
	}
	public void setSerialno(int serialno) {
		Serialno = serialno;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getBikename() {
		return Bikename;
	}
	public void setBikename(String bikename) {
		Bikename = bikename;
	}
	
	@Override
	public String toString() {
		return "Bike [Serialno=" + Serialno + ", Brand=" + Brand + ", Bikename=" + Bikename + "]";
	}
	
}
