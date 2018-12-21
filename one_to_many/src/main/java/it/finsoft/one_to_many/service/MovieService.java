package it.finsoft.one_to_many.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.finsoft.one_to_many.model.Movie;
import it.finsoft.one_to_many.model.MovieDetail;
import it.finsoft.one_to_many.repository.MovieRepository;

@Service
public class MovieService {

	@Autowired
	MovieRepository movierepo;

	public void saveMovie() {
		List<Movie> movies =findMovies(); // (List<Movie>) movierepo.findAll();
		if (movies.isEmpty()) {
			Movie mv1 = new Movie();
			Movie mv2 = new Movie();
			mv1.setName("mov1");
			mv2.setName("mov2");

			MovieDetail mvdetail1 = new MovieDetail("det1", "des1", mv1);
			MovieDetail mvdetail2 = new MovieDetail("det2", "des2", mv1);
			MovieDetail mvdetail3 = new MovieDetail("det3", "des3", mv2);
			MovieDetail mvdetail4 = new MovieDetail("det4", "des4", mv2);

			mv1.getMoviedetails().add(mvdetail1);
			mv1.getMoviedetails().add(mvdetail2);
			mv2.getMoviedetails().add(mvdetail3);
			mv2.getMoviedetails().add(mvdetail4);

			movierepo.save(mv1);
			movierepo.save(mv2);
		}
	}

	public List<Movie> findMovies() {

		return (List<Movie>) movierepo.findAll();
	}
}
