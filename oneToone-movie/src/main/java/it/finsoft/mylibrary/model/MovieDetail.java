package it.finsoft.mylibrary.model;

import javax.persistence.*;

@Entity
public class MovieDetail 
{
private Integer id;
private Integer duration;

public MovieDetail()
{   }

public MovieDetail(Integer duration)
{  this.duration=duration;   }


@Id
@GeneratedValue(strategy = GenerationType.AUTO)
public Integer getId()
{ return id; }

public void setId(Integer id) 
{ this.id = id; }

public Integer getDuration()
{ return duration; }

public void setDuration(Integer duration) 
{ this.duration = duration; }

}
