package com.group.libraryapp.domain.Person;

import com.group.libraryapp.domain.Address.Address;

import javax.persistence.*;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id = null;

    private String name;

    @OneToOne
    private Address address;

}
