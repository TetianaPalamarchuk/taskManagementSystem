package org.taskmanagementsystem.service;
import org.taskmanagementsystem.dto.DTO;
import org.taskmanagementsystem.dto.StringDTO;
import org.taskmanagementsystem.entity.Person;
import org.taskmanagementsystem.repository.PersonRepository;
import org.taskmanagementsystem.utils.security.StringEncoder;
import org.taskmanagementsystem.validation.EmailValidator;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class UserServiceImpl implements UserService {
        public EmailValidator validator;
        private PersonRepository persons;

        private org.taskmanagementsystem.utils.security.Encoder encoder = new StringEncoder();

public UserServiceImpl(PersonRepository persons ,EmailValidator v) {
        this.persons = persons;
        validator = v;
}
@Override
public List<DTO> createPerson(DTO dto) {
      List<DTO> validationErrors = validator.validate(dto);
        List<DTO> dtoList = new ArrayList<>();
      if(validationErrors.isEmpty()) {
        Person newPerson = new Person(dto.get("name"), dto.get("email"), dto.get("pass"));
                if (persons.addPerson(newPerson)){
                DTO response = new StringDTO();
                response.set("status", "Ok");
                dtoList.add(response);}
                else {
                DTO response = new StringDTO();
                response.set("status", "Add person to database failed");
                dtoList.add(response);}
              return dtoList;
        }

        return validationErrors;
        }
public List<DTO> signIn(DTO dto){
        List<DTO> dtoList = new ArrayList<>();
        Optional<Person> loggedPerson = persons.findByEmail(dto.get("email"));
        String checkedPass = encoder.encode(dto.get("pass"));
        if(loggedPerson.isPresent() && loggedPerson.get().getPasswdHash().equals(checkedPass)){
                DTO response = new StringDTO();
                response.set("status", "Ok");
                dtoList.add(response);
        } else {
        DTO response = new StringDTO();
        response.set("status", "Authorization failed");
        dtoList.add(response);}

        return dtoList;
}
public List<DTO> addPersonToProject(DTO dto){
//      List<DTO> validationErrors = validator.validate(dto);
        List<DTO> dtoList = new ArrayList<>();
//      if(validationErrors.isEmpty()) {

        DTO response = new StringDTO();
        response.set("status", "Ok");
        dtoList.add(response);
//        } return validationErrors;
        return dtoList;
}
public List<DTO> addPersonToTask(DTO dto){
//      List<DTO> validationErrors = validator.validate(dto);
        List<DTO> dtoList = new ArrayList<>();
//      if(validationErrors.isEmpty()) {


        DTO response = new StringDTO();
        response.set("status", "Ok");
        dtoList.add(response);
//        } return validationErrors;
        return dtoList;
}
private List<DTO> findPersonByName(DTO dto){
//      List<DTO> validationErrors = validator.validate(dto);
        List<DTO> dtoList = new ArrayList<>();
//      if(validationErrors.isEmpty()) {


        DTO response = new StringDTO();
        response.set("status", "Ok");
        dtoList.add(response);
//        } return validationErrors;
        return dtoList;

}
private List<DTO> findPersonByID(DTO dto){
//      List<DTO> validationErrors = validator.validate(dto);
        List<DTO> dtoList = new ArrayList<>();
//      if(validationErrors.isEmpty()) {


        DTO response = new StringDTO();
        response.set("status", "Ok");
        dtoList.add(response);
//        } return validationErrors;
        return dtoList;
}
private List<DTO> findPersonByEMail(DTO dto){
//      List<DTO> validationErrors = validator.validate(dto);
        List<DTO> dtoList = new ArrayList<>();
//      if(validationErrors.isEmpty()) {


        DTO response = new StringDTO();
        response.set("status", "Ok");
        dtoList.add(response);
//        } return validationErrors;
        return dtoList;
}

}
