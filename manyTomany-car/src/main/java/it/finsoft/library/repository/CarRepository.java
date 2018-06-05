package it.finsoft.library.repository;

import org.springframework.data.repository.CrudRepository;

import it.finsoft.library.model.Car;

public interface CarRepository extends CrudRepository<Car,Integer>{

}
