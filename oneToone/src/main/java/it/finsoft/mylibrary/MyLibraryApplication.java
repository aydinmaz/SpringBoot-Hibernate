package it.finsoft.mylibrary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import it.finsoft.mylibrary.model.Author;
import it.finsoft.mylibrary.model.Book;
import it.finsoft.mylibrary.model.BookDetail;
//import it.finsoft.mylibrary.model.Person;
import it.finsoft.mylibrary.model.Publisher;
import it.finsoft.mylibrary.repository.AuthorRepository;
import it.finsoft.mylibrary.repository.PublisherRepository;
//import it.finsoft.mylibrary.repository.AuthorRepository;

@SpringBootApplication
public class MyLibraryApplication implements CommandLineRunner {
	private static final Logger logger = LoggerFactory.getLogger(MyLibraryApplication.class);

	@Autowired
	private AuthorRepository authorRepository;
	@Autowired
	private PublisherRepository publisherRepository;

	public static void main(String[] args) {
		SpringApplication.run(MyLibraryApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		// save a couple of books

		BookDetail bd1 = new BookDetail();// this is the constructor that we created in BookDetail.java
		BookDetail bd2 = new BookDetail();
		BookDetail bd3 = new BookDetail();
		bd1.setNumberOfPages(59);

		// List<Book> books = new ArrayList<>();//from 53 to line 57 it is java code to
		// create and array of books
		Book b1 = new Book("Book A", bd1);
		Book b2 = new Book("Book B", bd2);
		Book b3 = new Book("Book C", bd3);

		// books.add(b1);
		// books.add(b2);
		// books.add(b3);

		// matlab jaalebi bood,az guseppe porsidam . bala ,satr "List" va 3 satr
		// "book.add" ro hazf kardam va taghiri dar table "book" dar mysql rokh nadad
		// tozih Gueseppe ine ke ,in list rabti be sql nadare ,in ye chize dakheli
		// hast vase java ke be farz age bekhay sarii az list ye ketab peyda koni be
		// dard mikhore
		// bookRepository.save(books);// here it converts java array to mysql table

		// TODO Auto-generated method stub
		// save a couple of authors
		List<Author> authors = new ArrayList<>();

		Author a1 = new Author("A", "A2", b1,null);
		Author a2 = new Author("", "A2", null,null);
		Author a3 = new Author("A1", "A3", b3,null);


		
		List<Publisher> publishers = new ArrayList<>();

		// publishers.add(new Publisher("ABC", "street" , b1,a1));
	
		Publisher p1=new Publisher();
		Publisher p2=(new Publisher("ABC2", "street2", b2, a2));
		Publisher p3=new Publisher("", "street3", null, a1);
		Publisher p4=new Publisher("abc4", null, null, a3);
		publishers.addAll(Arrays.asList(p1,p2,p3,p4));
	
		// publishers.add(new Publisher("street3"));
		a1.setPublisher(p3);
		a2.setPublisher(p2);
		a3.setPublisher(p4);
		authors.add(a1);
		authors.add(a2);
		authors.add(a3);
       
		
		// agar in autorrepository ro comment konam az table e author faqat unjayish ke
		// dar ye table dige ertebat dare neshun mide
		// fetch all authors
		// nokte dovvom inke agar in ro comment kardi bayad ebarat "cascade .." dar yeki
		// az jadval ha ke autor be on rabt dade shode ham comment koni
		publisherRepository.saveAll(publishers);
		authorRepository.saveAll(authors);
		// fetch all authors

	}

}
