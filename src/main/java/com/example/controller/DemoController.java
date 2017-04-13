package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Person;
import com.example.repository.PersonRepository;

@Configuration
@EnableAutoConfiguration
@RestController
public class DemoController {

	@Autowired
	PersonRepository repository;

	@RequestMapping("/all")
	public Iterable<Person> content() {
		return repository.findAll();
	}

	@RequestMapping("/person")
	public Iterable<Person> dailyContent(@RequestParam(value = "lastname", defaultValue = "0") String lastname) {
		return repository.findByLastname(lastname);
	}

}