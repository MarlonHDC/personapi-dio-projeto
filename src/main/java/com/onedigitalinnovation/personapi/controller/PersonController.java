package com.onedigitalinnovation.personapi.controller;

import com.onedigitalinnovation.personapi.dto.MessageResponseDTO;
import com.onedigitalinnovation.personapi.entity.Person;
import com.onedigitalinnovation.personapi.repository.PersonRepository;
import com.onedigitalinnovation.personapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody Person person) {
        return personService.createPerson(person);

    }
}
