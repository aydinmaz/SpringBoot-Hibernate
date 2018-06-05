package it.finsoft.one_to_many.model;
import javax.persistence.*;

@Entity
public class Bookdetail {
	
	int id;
	private String name;
	private String description;
	private Book book;
	
	
	public Bookdetail(String name, String description) {
		super();
		this.name = name;
		this.description = description;
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@ManyToOne()
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	
	
	

}
