package org.taskmanagementsystem.service;

import org.taskmanagementsystem.dto.DTO;
import org.taskmanagementsystem.entity.Person;
import org.taskmanagementsystem.repository.PersonRepository;

import java.util.List;

public class UserServiceImpl implements UserService {
private PersonRepository persons;
// Validator validator;


public UserServiceImpl(PersonRepository persons /* Validator v */)
{
        this.persons = persons;
//        validator = v;
}

@Override
public List<DTO> createPerson(DTO dto)
{
        Person p = new Person();
//        List<> rc = validator.validate(dto)
//        if(rc.size() == 0) ...

        return null;
}
}
