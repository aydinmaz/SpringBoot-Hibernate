package it.finsoft.one_to_many.repository;

import org.springframework.data.repository.CrudRepository;

import it.finsoft.one_to_many.model.MovieDetail;

public interface MoviedetailRepository extends CrudRepository<MovieDetail, Integer> {

}
