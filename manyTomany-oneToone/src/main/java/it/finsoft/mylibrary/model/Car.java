package it.finsoft.mylibrary.model;
import java.util.List;

import javax.persistence.*;
@Entity 

public class Car 
{
  private int id;
  private String name;
  private String color;
  private String size;
  private Engine engine;
  private List<Owner> owner;
  //because one car can have different owners so this variable should be the List type
  //also you can use Set instead of List ,but they have some differences.
  
  public Car() 
   { super();  }




public Car( String name, String color, String size, Engine engine)
    {
	super();
	
	this.name = name;
	this.color = color;
	this.size = size;
	this.engine = engine;
    }

@Id 
@GeneratedValue(strategy = GenerationType.AUTO)
public int getId() 
   { return id; }

public void setId(int id) 
   {  this.id = id;  }


public String getName() 
  { return name; }

public void setName(String name) 
  { this.name = name; }

public String getColor() 
  { return color; }

public void setColor(String color) 
  { this.color = color; }

public String getSize() 
  { return size; }

public void setSize(String size) 
  { this.size = size; }

@OneToOne(cascade = CascadeType.ALL)
public Engine getEngine() 
  { return engine; }


public void setEngine(Engine engine) 
  { this.engine = engine; }

@ManyToMany//(cascade = CascadeType.ALL)//hazf in farghi nakard
public List<Owner> getOwner() {
	return owner;
}

public void setOwner(List<Owner> owner) {
	this.owner = owner;
}

  
}
