package it.finsoft.mylibrary.repository;

//import java.util.List;

import org.springframework.data.repository.CrudRepository;

import it.finsoft.mylibrary.model.Publisher;
//import it.finsoft.mylibrary.model.Author;



public interface PublisherRepository extends CrudRepository<Publisher, Integer>
{
}
