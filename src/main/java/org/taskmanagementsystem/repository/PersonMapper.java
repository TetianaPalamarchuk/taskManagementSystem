package org.taskmanagementsystem.repository;

import org.taskmanagementsystem.dto.DTO;
import org.taskmanagementsystem.entity.Person;
import org.taskmanagementsystem.dto.StringDTO;
import org.taskmanagementsystem.storage.Mapper;

import java.util.UUID;

public class PersonMapper implements Mapper<Person> {
@Override
public Person mapToObject(String str)
{
        DTO dto = new StringDTO(str);
        var person = new Person();

        UUID id = dto.getId("id");
        String name = dto.get("name");
        String email = dto.get("email");
        String passwd = dto.get("passwd_hash");

        person.setId(id);
        person.setName(name);
        person.setEmail(email);
        person.setPasswdHash(passwd);

        return person;
}

@Override
public String mapToString(Person person)
{
        DTO dto = new StringDTO();

        dto.set("id", person.getId())
                .set("name", person.getName())
                .set("email", person.getEmail())
                .set("passwd_hash", person.getPasswdHash());

        return dto.toString();
}
}
