package it.finsoft.one_to_many.model;
import javax.persistence.*;

@Entity
public class Book {
 
	int id;
	private String name;
	
	
	
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


	
}
