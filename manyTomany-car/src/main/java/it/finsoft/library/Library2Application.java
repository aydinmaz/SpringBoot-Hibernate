package it.finsoft.library;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;
import org.springframework.transaction.annotation.Transactional;

import it.finsoft.library.model.Car;
import it.finsoft.library.model.Person;
import it.finsoft.library.repository.CarRepository;
import it.finsoft.library.repository.PersonRepository;

@SpringBootApplication
@EnableAutoConfiguration(exclude=ErrorMvcAutoConfiguration.class)
public class Library2Application implements CommandLineRunner{

	
	@Autowired// what does this do?makes connection with database
    private PersonRepository personRepository;
	
	@Autowired
	private CarRepository carRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Library2Application.class, args);
	}
	

	
	
	

	@Override//what does this do?
	@Transactional 
	public void run(String... arg0) throws Exception {
	

		List<Person> person = new ArrayList<>();
	    Person  p1 = new Person("majid","jon",null);//this is the constructor that we created in BookDetail.java
	    Person  p2 = new Person("Guisepe","caldera",null);//so now we create 3 objects(movie) with one attribute
	    Person  p3 = new Person("Lorenzo","massini",null);//other attributes we put empty 
        //md1.setDuration(60);
        person.add(p1);//this we need because in this way we put our created objects in  our list otherwise list still is empty
        person.add(p2);
        person.add(p3);
		
		List<Car> cars = new ArrayList<>();//we create list in Java
       Car c1 = new Car("benz",1980,Arrays.asList(p1,p3));
       Car c2 = new Car("bmw",1943,Arrays.asList(p2,p3));
       Car c3 = new Car("ferari",2017,person);
       cars.add(c1);//this we need because in this way we put our created objects in  our list otherwise list still is empty
       cars.add(c2);
       cars.add(c3);
		
       
       //hamunjur ke dar bala mibinim,dar hengam tarif person nemitunim list car ro behesh ezafe konim
       //chon hanuz object car ijad nashode pas lajeram null rad mikonim va badan ba set behesh ezafe mikonim
       //ama dar hengam ijad object car mitunim behesh list person ro ezafe konim chon object person ghablan ijad kardim
     /*  p1.setName("majid");
       p1.setLastname("maza");
       p2.setName("hasan");
       p2.setLastname("jabr");
       p3.setName("ma");
       p3.setLastname("majan");*/
	   p1.setCar(cars);
	   p2.setCar(Arrays.asList(c1,c2));
	   p3.setCar(Arrays.asList(c3));
	 /*  c1.setPerson(person);
	   c2.setPerson(Arrays.asList(p1,p3));
	   c3.setPerson(Arrays.asList(p2,p3));*/
	   System.out.println(c3.getPerson());
		
		
		
        //other attributes we put empty 
        //md1.setDuration(60);
       carRepository.save(cars); 
       personRepository.save(person);
       
       

	}
	
	
	
	
}
