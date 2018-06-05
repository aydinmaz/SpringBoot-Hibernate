package it.finsoft.mylibrary.repository;

//import java.util.List;

import org.springframework.data.repository.CrudRepository;

import it.finsoft.mylibrary.model.Author;
//import it.finsoft.mylibrary.model.Author;



public interface AuthorRepository extends CrudRepository<Author, Integer>
{
}
