package it.finsoft.library.model;

import java.util.List;

import javax.persistence.*;

@Entity
public class Person {
	
	private int id;
	private String name;
	private String lastname;
	private List<Car> car;
	
	
	
	public Person() {
		super();
	}


	public Person(String name, String lastname, List<Car> car) {
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



	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}


	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}




	@ManyToMany//(cascade= CascadeType.ALL)
	//@JoinTable(name = "mikhak")//inha lozum nadaran
	public List<Car> getCar() {
		return car;
	}
	public void setCar(List<Car> car) {
		this.car = car;
		
	}


	
/*	@Override
	public String toString(){
		return String.format(
				"Book[id=%d,name='%s',number of pages='%d']",
				id,name,bookDetail.getNumberOfPages());
	}*/
	
	

}
