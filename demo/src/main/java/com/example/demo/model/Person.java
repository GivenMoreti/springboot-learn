package com.example.demo.model;

import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {
    private final UUID Id;
    private final String name;

    //define @json to enable thunder client to create a java class with the data im sending
    public Person(@JsonProperty("id") UUID id, @JsonProperty("name") String name) {
        Id = id;
        this.name = name;
    }

    public UUID getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

}
