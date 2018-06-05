package it.finsoft.library.repository;

import org.springframework.data.repository.CrudRepository;

import it.finsoft.library.model.Person;

public interface PersonRepository extends CrudRepository<Person,Integer> {

}
