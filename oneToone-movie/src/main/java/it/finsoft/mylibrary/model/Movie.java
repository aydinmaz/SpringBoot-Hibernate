package it.finsoft.mylibrary.model;

import javax.persistence.*;
@Entity 
public class Movie
{
	private int id;
	private String title;
	private Integer year;
	private String type;
	private MovieDetail moviedetail;

	public Movie()
			{  }
	
	
	//lozumi nadare in hame costructor dorost koni,yeki kamel drst kon va parametri ro ke nemikhay pass koni null rad kon
	public Movie(String title,int year,String type,MovieDetail moviedetail)
			{
				this.title = title;
				this.year =year;
				this.type=type;
				this.moviedetail=moviedetail;
			}
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getId() 
		{  return id;  }
	public void setId(int id)
	    {  this.id = id; }

	public String getTitle() 
	    {return title;  }
	public void setTitle(String title) 
	    {  this.title = title; }
	
	public int getYear()
	    { return year;  }
	public void setYear(int year)
	    { this.year = year;  }

	public String getType() 
	    { return type;  }
	public void setType(String type) 
	    { this.type = type;  }
	
	@OneToOne//(cascade = CascadeType.ALL)
	public MovieDetail getMoviedetail() 
	    { return moviedetail; }
	public void setMoviedetail(MovieDetail moviedetail)
	    {  this.moviedetail = moviedetail; }
	
	//kollan in bakhsho nazari ham chizi nemishe
	@Override//what does do this all objects in java needs this method,dont think to that
	public String toString()
	{
		return String.format("Movie[id=%d,title= '%s', year= '%d',type='%s']",
				id,title,year,type,moviedetail.getDuration());
	}
	
	
	
	
	
	
}
