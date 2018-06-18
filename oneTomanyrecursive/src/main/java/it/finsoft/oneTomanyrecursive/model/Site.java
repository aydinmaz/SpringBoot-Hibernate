package it.finsoft.oneTomanyrecursive.model;

import java.util.Set;

import javax.persistence.*;

@Entity 
public class Site {

	int id;
	private String name;
	private String description;
	private String parent;
	private Set<Site> items;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@ManyToOne
	public String getParent() {
		return parent;
	}
	public void setParent(String parent) {
		this.parent = parent;
	}
	@OneToMany(mappedBy = "parent",cascade={CascadeType.ALL})
	public Set<Site> getItems() {
		return items;
	}
	public void setItems(Set<Site> items) {
		this.items = items;
	}
	
	
	
}
