package it.finsoft.mylibrary.model;

import javax.persistence.*;

@Entity
public class Publisher 
{
	private int id;
	private String name;
    private String address;
    private Book book;
    private Author author;
   
  
   

	public Publisher()
	{  }
	
	        // public Publisher(String name) {
			    //  super();
			     // this.name = name;
		           //  }
                  // mishe injoori yek constructor singular ijaad kard ama in,practic khubi nist,rahattare yek yek constructor
	              //kolli ijad koni va baadan null pass koni
	public Publisher(String name,String address,Book book,Author author)
	{
		this.name = name;
		this.address=address;
		this.book = book;
		this.author=author;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@OneToOne//(cascade = CascadeType.ALL)
	@JoinColumn(name = "author_id")
	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "book_id")
	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
	
	@Override
	public String toString()
	{
		return String.format("Publisher[id=%d,name= '%s',address='%s', number of book= '%d',number of author= '%d']",
				id,name,address,book,author.getId());
	}
	
	
}
