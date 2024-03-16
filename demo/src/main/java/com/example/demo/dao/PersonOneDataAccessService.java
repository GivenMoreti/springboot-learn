package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Person;

@Repository("fakeperson")
public class PersonOneDataAccessService implements PersonDao {
    private static List<Person> db = new ArrayList<>();

    @Override
    public int insertPerson(UUID id, Person person) {
        db.add(new Person(id, person.getName()));
        return 0;

        
    }

    @Override
    public List<Person> selectAllPeople() {
   
      return db;
    }
}
