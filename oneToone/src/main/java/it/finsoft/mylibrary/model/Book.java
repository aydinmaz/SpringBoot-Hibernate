package it.finsoft.mylibrary.model;

import javax.persistence.*;
@Entity 
//@Table(name="book")//boodan ya naboodanesh hich farqi nemikone,faghat baray namgozarist
public class Book 
{
	private int id;
	private String name;
	private BookDetail bookDetail;
	private Author author;
	private Publisher publisher;

	public Book()
	{  }
	
	public Book(String name,BookDetail bookDetail)
	{
		this.name = name;
		this.bookDetail = bookDetail;
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
	
	@OneToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name = "book_detail_id")//hazf in tasiri nagzasht,in ham vase namgozarist
	public BookDetail getBookDetail() {
		return bookDetail;
	}
	public void setBookDetail(BookDetail bookDetail) {
		this.bookDetail = bookDetail;
	}
	
	
	@OneToOne(mappedBy = "book")
	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}
	
	
	@OneToOne(mappedBy = "book")
	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString()
	{
		return String.format("Book[id=%d,name= '%s', number of pages= '%d']",
				id,name,bookDetail.getNumberOfPages());
	}
	
	
	
	
	
	
}
