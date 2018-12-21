package it.finsoft.mylibrary;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import it.finsoft.mylibrary.model.Movie;
import it.finsoft.mylibrary.model.MovieDetail;
import it.finsoft.mylibrary.repository.MovieDetailRepository;
import it.finsoft.mylibrary.repository.MovieRepository;

@SpringBootApplication
public class MovieApplication implements CommandLineRunner {

	@Autowired // what does this do?
	private MovieRepository movieRepository;
	@Autowired
	private MovieDetailRepository moviedetailRepository;

	public static void main(String[] args) {
		SpringApplication.run(MovieApplication.class, args);
	}

	@Override // what does this do?
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		// save a couple of books
		// from 53 to line 57 it is java code to create and array of books
		List<MovieDetail> moviedetails = new ArrayList<>();// we create list in Java
		MovieDetail md1 = new MovieDetail(23);// this is the constructor that we created in BookDetail.java
		MovieDetail md2 = new MovieDetail(34);// so now we create 3 objects(movie) with one attribute
		MovieDetail md3 = new MovieDetail(33);// other attributes we put empty
		// md1.setDuration(60);
		moviedetails.add(md1);// this we need because in this way we put our created objects in our list
								// otherwise list still is empty
		moviedetails.add(md2);
		moviedetails.add(md3);

		List<Movie> movies = new ArrayList<>();
		Movie mv1 = new Movie("Movie A", 12347, "catso", md2);
		Movie mv2 = new Movie("Movie B", 000, null, md1);
		Movie mv3 = new Movie("Movie C", 0, "", md3);
		movies.add(mv1);
		movies.add(mv2);
		movies.add(mv3);
		moviedetailRepository.saveAll(moviedetails);

		// moviedetails.add(new MovieDetail(23, mv2 ));

		movieRepository.saveAll(movies);

		// fetch all authors

	}

}
