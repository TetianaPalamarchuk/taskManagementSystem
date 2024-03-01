package org.taskmanagementsystem.service;
import org.taskmanagementsystem.dto.DTO;
import org.taskmanagementsystem.dto.StringDTO;
import org.taskmanagementsystem.entity.Person;
import org.taskmanagementsystem.repository.PersonRepository;
import org.taskmanagementsystem.repository.PersonRepositoryImpl;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {
// Validator validator;
        private PersonRepository persons;


public UserServiceImpl(PersonRepository persons /* Validator v */) {
        this.persons = persons;
//        validator = v;
}

@Override
public List<DTO> createPerson(DTO dto) {

//        List<> rc = validator.validate(dto)
//        if(rc.size() == 0) ...

        Person newPerson = new Person(dto.get("name"), dto.get("email"), dto.get("pass"));
        persons.addPerson(newPerson);
        DTO response = new StringDTO();

        response.set("status", "Ok");
        List<DTO> dtoList = new ArrayList<>();
        dtoList.add(response);


        return dtoList;
}
}
