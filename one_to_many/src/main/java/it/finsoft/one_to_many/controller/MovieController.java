package it.finsoft.one_to_many.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import it.finsoft.one_to_many.model.Movie;
import it.finsoft.one_to_many.model.MovieDetail;
import it.finsoft.one_to_many.repository.MovieRepository;
import it.finsoft.one_to_many.repository.MoviedetailRepository;

@RestController
@RequestMapping("/rest")
public class MovieController {

	@Autowired
	MovieRepository movierepo;
	@Autowired
	MoviedetailRepository detailrepo;
	
	//@Transactional
	@GetMapping("/movie")
	public Iterable<Movie> qualcosa()
	{
		Movie mv1=new Movie();
		Movie mv2=new Movie();
		mv1.setName("mov1");
		mv2.setName("mov2");
		
		MovieDetail mvdetail1 = new MovieDetail("det1", "des1",mv1);
		MovieDetail mvdetail2 = new MovieDetail("det2", "des2", mv1);
		MovieDetail mvdetail3 = new MovieDetail("det3", "des3", mv2);
		MovieDetail mvdetail4 = new MovieDetail("det4", "des4", mv2);
		
		mv1.getMoviedetails().add(mvdetail1);
		mv1.getMoviedetails().add(mvdetail2);
		mv2.getMoviedetails().add(mvdetail3);
		mv2.getMoviedetails().add(mvdetail4);
/*		mvdetail1.setMovie(mv1);
		mvdetail2.setMovie(mv1);
		mvdetail3.setMovie(mv2);
		mvdetail4.setMovie(mv2);*/
		

		movierepo.save(mv1);
		movierepo.save(mv2);
		return movierepo.findAll();
	}
}
