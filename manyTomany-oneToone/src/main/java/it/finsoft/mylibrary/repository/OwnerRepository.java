package it.finsoft.mylibrary.repository;

//import java.util.List;

import org.springframework.data.repository.CrudRepository;

//import it.finsoft.mylibrary.model.Author;
import it.finsoft.mylibrary.model.Owner;


public interface OwnerRepository extends CrudRepository<Owner, Integer>
{
}