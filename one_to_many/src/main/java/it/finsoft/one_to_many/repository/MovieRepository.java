package it.finsoft.one_to_many.repository;

import org.springframework.data.repository.CrudRepository;

import it.finsoft.one_to_many.model.Movie;

public interface MovieRepository extends CrudRepository<Movie, Integer>{

}
