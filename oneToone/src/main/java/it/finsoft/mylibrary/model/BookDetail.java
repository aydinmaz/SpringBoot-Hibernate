package it.finsoft.mylibrary.model;

import javax.persistence.*;

@Entity
@Table(name="book_joziat")
public class BookDetail 
{
private Integer id;
private Integer numberOfPages;
private Book book;

public BookDetail()
{   }

public BookDetail(Integer numberOfPages)
{  this.numberOfPages=numberOfPages;   }



@Id
@GeneratedValue(strategy = GenerationType.AUTO)
public Integer getId()
{ return id; }

public void setId(Integer id) 
{ this.id = id; }

@Column(name="tedad_safhe")//faqat esmesh ro avaz mikone
public Integer getNumberOfPages()
{ return numberOfPages; }

public void setNumberOfPages(Integer numberOfPages) 
{ this.numberOfPages = numberOfPages; }

@OneToOne(mappedBy="bookDetail")
public Book getBook() 
{ return book; }

public void setBook(Book book) 
{  this.book = book;  }



}
