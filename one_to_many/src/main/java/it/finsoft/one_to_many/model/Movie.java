package it.finsoft.one_to_many.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "movies")
public class Movie {

	int id;
	private String name;

	private Set<MovieDetail> moviedetails = new HashSet<>();

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// be khater Rest pi , jacson recursive error midad ke ba in halesh kardm
	@JsonManagedReference
	@OneToMany(mappedBy = "movie", cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	public Set<MovieDetail> getMoviedetails() {
		return moviedetails;
	}

	public void setMoviedetails(Set<MovieDetail> moviedetails) {
		this.moviedetails = moviedetails;
	}

}
