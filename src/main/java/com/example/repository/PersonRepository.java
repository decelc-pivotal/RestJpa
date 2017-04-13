package com.example.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.domain.Person;

public interface PersonRepository extends CrudRepository<Person, String> {

	List<Person> findByLastname(String lastname);
}
