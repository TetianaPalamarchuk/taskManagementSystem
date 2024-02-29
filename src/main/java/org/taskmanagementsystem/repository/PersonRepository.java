package org.taskmanagementsystem.repository;

import org.taskmanagementsystem.entity.Person;

public interface PersonRepository {
        Person findByName(String name);
        Person findByEmail(String name);
}
