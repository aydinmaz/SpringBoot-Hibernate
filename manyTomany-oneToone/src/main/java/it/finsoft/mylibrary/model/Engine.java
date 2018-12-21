package it.finsoft.mylibrary.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Engine 
{
private int id;
private String power;
private String voice;

public Engine() {
	super();
}

public Engine( String power, String voice) {
	super();
	
	this.power = power;
	this.voice = voice;
}
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPower() {
	return power;
}
public void setPower(String power) {
	this.power = power;
}
public String getVoice() {
	return voice;
}
public void setVoice(String voice) {
	this.voice = voice;
}











}
