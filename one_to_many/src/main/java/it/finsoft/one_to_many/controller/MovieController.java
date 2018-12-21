package it.finsoft.one_to_many.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.finsoft.one_to_many.model.Movie;
import it.finsoft.one_to_many.service.MovieService;

@RestController
@RequestMapping("/rest")
public class MovieController {

	@Autowired
	private MovieService movieservice;

	// @Transactional
	@GetMapping("/movie")
	public List<Movie> qualcosa() {
		movieservice.saveMovie();
		return movieservice.findMovies();
	}
}
