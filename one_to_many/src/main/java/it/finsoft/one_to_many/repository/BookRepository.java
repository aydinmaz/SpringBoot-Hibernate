package it.finsoft.one_to_many.repository;

import org.springframework.data.repository.CrudRepository;

import it.finsoft.one_to_many.model.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{

}
