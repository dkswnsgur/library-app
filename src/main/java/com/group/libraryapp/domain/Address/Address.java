package com.group.libraryapp.domain.Address;

import com.group.libraryapp.domain.Person.Person;

import javax.persistence.*;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = null;

    private String city;

    private String street;

    @OneToOne(mappedBy = "address")
    private Person person;

}
