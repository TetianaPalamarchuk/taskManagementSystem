package org.taskmanagementsystem.service;
import org.taskmanagementsystem.dto.DTO;
import org.taskmanagementsystem.dto.StringDTO;
import org.taskmanagementsystem.entity.Person;
import org.taskmanagementsystem.repository.PersonRepository;
import java.util.ArrayList;
import java.util.List;


public class UserServiceImpl implements UserService {
// Validator validator;
        private PersonRepository persons;
public UserServiceImpl(PersonRepository persons /* ,Validator v */) {
        this.persons = persons;
//        validator = v;
}
@Override
public List<DTO> createPerson(DTO dto) {
//      List<DTO> validationErrors = validator.validate(dto);
        List<DTO> dtoList = new ArrayList<>();
//      if(validationErrors.isEmpty()) {
        Person newPerson = new Person(dto.get("name"), dto.get("email"), dto.get("pass"));
                if (persons.addPerson(newPerson)){
                DTO response = new StringDTO();
                response.set("status", "Ok");
                dtoList.add(response);}
                else {
                DTO response = new StringDTO();
                response.set("status", "Add person to database failed");
                dtoList.add(response);}
//        } return validationErrors;

        return dtoList;
        }
public List<DTO> loginPerson(DTO dto){
//      List<DTO> validationErrors = validator.validate(dto);
        List<DTO> dtoList = new ArrayList<>();
//      if(validationErrors.isEmpty()) {

        DTO response = new StringDTO();
        response.set("status", "Ok");
        dtoList.add(response);
//        } return validationErrors;
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
