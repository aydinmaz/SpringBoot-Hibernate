package it.finsoft.mylibrary.repository;

//import java.util.List;

import org.springframework.data.repository.CrudRepository;

//import it.finsoft.mylibrary.model.Author;
import it.finsoft.mylibrary.model.MovieDetail;


public interface MovieDetailRepository extends CrudRepository<MovieDetail, Integer>
{
}