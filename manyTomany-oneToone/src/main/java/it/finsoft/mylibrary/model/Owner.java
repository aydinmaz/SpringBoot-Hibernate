package it.finsoft.mylibrary.model;
import java.util.List;

import javax.persistence.*;
@Entity 
public class Owner {
	
	private int id;
	private String name;
	private String lastname;
	private List<Car> car;
	
	public Owner() {
		super();
	}
	public Owner(String name) {
		super();
		this.name = name;
	}
	public Owner(String name, String lastname) {
		super();
		this.name = name;
		this.lastname = lastname;
	}
	
	public Owner(String name, String lastname, List<Car> car) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.car = car;
	}
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
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
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	@ManyToMany
	public List<Car> getCar() {
		return car;
	}
	public void setCar(List<Car> car) {
		this.car = car;
	}
	
	public String toString()
	   { return String.format("owner[id=%d,name= '%s', lastname= '%s']",
				id,name,lastname,car); }

}
