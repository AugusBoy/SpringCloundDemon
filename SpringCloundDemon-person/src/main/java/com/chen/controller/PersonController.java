package com.chen.controller;

import com.chen.domain.Person;
import com.chen.springcloud.dao.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * @decription
 * @atuhor:陈红卫
 * @create : 2017-06-13-10:32
 */
@RestController
public class PersonController {

    @Autowired
    private PersonRepository personRepository;



    @RequestMapping(value="/save" ,method = RequestMethod.POST)
    public List<Person> savePerson(@RequestBody String personName){
        Person p = new Person(personName);
        personRepository.save(p);
        List<Person> people =personRepository.findAll(new PageRequest(0,10)).getContent();
        return people;
    }
}
