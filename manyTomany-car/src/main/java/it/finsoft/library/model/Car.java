package it.finsoft.library.model;

import java.util.List;

import javax.persistence.*;

@Entity
public class Car {
	
	private int id;
	private String name;
	private Integer model;
	private List<Person> person;
	
	
	
	public Car() {
		super();
	}

	public Car(String name, Integer model, List<Person> person) {
		super();
		this.name = name;
		this.model = model;
		this.person = person;
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


	public Integer getModel() {
		return model;
	}
	public void setModel(Integer model) {
		this.model = model;
	}



	@ManyToMany//(cascade= CascadeType.ALL)
	//@JoinTable(name = "kosesher")//lozumi be inha nist 
	public List<Person> getPerson() {
		return person;
	}

	public void setPerson(List<Person> person) {
		this.person = person;
	}

	
	
	

	
/*	@Override
	public String toString(){
		return String.format(
				"Book[id=%d,name='%s',number of pages='%d']",
				id,name,bookDetail.getNumberOfPages());
	}*/
	
	

}

