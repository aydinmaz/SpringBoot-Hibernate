package it.finsoft.mylibrary.model;

import javax.persistence.*;
@Entity
@Table(name="author")
public class Author 
{
	private int id;
	private String name;
    private String lastname;
    private Book book;
	private Publisher publisher;

   
    public Author()
	{  }
	
	public Author(String name,String lastname,Book book)
	{
		this.name = name;
		this.lastname=lastname;
		this.book = book;
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
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "book_id")
	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
	
	@OneToOne(mappedBy = "author")
	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString()
	{
		return String.format("Author[id=%d,name= '%s',lastname='%s', number of book= '%d']",
				id,name,lastname,book.getId());
	}
	
	
}
