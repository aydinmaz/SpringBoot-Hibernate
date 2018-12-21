package it.finsoft.mylibrary;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import it.finsoft.mylibrary.model.Car;
import it.finsoft.mylibrary.model.Engine;
import it.finsoft.mylibrary.model.Owner;
import it.finsoft.mylibrary.repository.CarRepository;
import it.finsoft.mylibrary.repository.EngineRepository;
import it.finsoft.mylibrary.repository.OwnerRepository;

@SpringBootApplication
public class CarApplication implements CommandLineRunner {

	@Autowired // what does this do?makes connection with database
	private CarRepository carRepository;
	@Autowired
	private EngineRepository engineRepository;
	@Autowired
	private OwnerRepository ownerRepository;

	public static void main(String[] args) {
		SpringApplication.run(CarApplication.class, args);
	}

	@Override // what does this do?
	@Transactional
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		// save a couple of books
		// from 45 to line 70 it is java code to create an array of books
		List<Engine> engines = new ArrayList<>();// we create list in Java
		Engine en1 = new Engine();// this is the constructor that we created in BookDetail.java
		Engine en2 = new Engine("high",null);// so now we create 3 objects(movie) with one attribute
		Engine en3 = new Engine("low", "high");
		Engine en4 = new Engine("high", "high");// other attributes we put empty
		// md1.setDuration(60);
		engines.add(en1);// this we need because in this way we put our created objects in our list
							// otherwise list still is empty
		engines.add(en2);
		engines.add(en3);
		engines.add(en4);

		List<Car> cars = new ArrayList<>();
		Car ca1 = new Car("benz", "yellow", "grand", en1);
		Car ca2 = new Car("bmw", "red", "small", en2);
		Car ca3 = new Car("porche", "green", "medio", en4);
		cars.add(ca1);
		cars.add(ca2);
		cars.add(ca3);

		List<Owner> owners = new ArrayList<>();
		Owner ow1 = new Owner("majid", "mz", cars);
		Owner ow2 = new Owner("georgia", "", cars);
		owners.add(ow1);
		owners.add(ow2);

		ca1.setOwner(owners);// this I forget again and again

		engineRepository.saveAll(engines);// u should be carefull of order of this 2 otherwise error "transient unsaved"
											// will appear
											// later I understood that by using transaction annotation this problem is
											// solved.
		carRepository.saveAll(cars);
		ownerRepository.saveAll(owners);
		// create the name of database in applicationproperties

	}

}
