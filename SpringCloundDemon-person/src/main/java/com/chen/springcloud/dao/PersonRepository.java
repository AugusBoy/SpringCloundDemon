package com.chen.springcloud.dao;

import com.chen.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @decription
 * @atuhor:陈红卫
 * @create : 2017-06-10-10:28
 */
public interface PersonRepository extends JpaRepository<Person,Long> {

    //
    List<Person> findByAddress(String name);

    Person findByNameAndAddress(String name, String address);
}
