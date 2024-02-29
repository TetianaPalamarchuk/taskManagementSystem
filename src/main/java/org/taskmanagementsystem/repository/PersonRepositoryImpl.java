package org.taskmanagementsystem.repository;

import org.taskmanagementsystem.entity.Person;
import org.taskmanagementsystem.storage.Storage;

import java.util.ArrayList;
import java.util.List;

public class PersonRepositoryImpl extends Storage<Person> implements PersonRepository{
private List<Person> persons;
private String fileName;

public PersonRepositoryImpl()
{
        this.persons = new ArrayList<>();
}

public PersonRepositoryImpl(String fileName)
{
        this.fileName = fileName;
        this.persons = new ArrayList<>();
}

@Override
public Person findByName(String name)
{
        return null;
}

@Override
public Person findByEmail(String name)
{
        return null;
}

@Override
public boolean addPerson(Person person)
{
        return false;
}
}
