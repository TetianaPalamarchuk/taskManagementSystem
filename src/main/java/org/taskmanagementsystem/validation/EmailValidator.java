package org.taskmanagementsystem.validation;

import org.taskmanagementsystem.dto.DTO;
import org.taskmanagementsystem.dto.StringDTO;

import java.util.List;

public class EmailValidator extends Validator {
public EmailValidator()
{
        addConstraint(request ->
        {
                var status = new StringDTO();
                // email=test@domain.com
                var email = request.get("email");

                status.set("status", "OK");

//                if(email.matches("[a-zA-Z0-9]+@[a-zA-Z0-9.]+"))
                // a@b
                if(email.length() < 3) {
                        status.set("error", "e-mail `" + email + "'"
                                + " too short. The length must be > 3");

                        status.set("status", "ERROR");
                }

               return status;
        });

        addConstraint(request ->
        {
                var status = new StringDTO();
                // email=test@domain.com
                var email = request.get("email");

                status.set("status", "OK");
                // a@b
                var idx = email.indexOf('@');

                if(idx == -1) {
                        status.set("error", "e-mail `" + email + "'"
                                + " is malformed");

                        status.set("status", "ERROR");
                }

                return status;
        });
}

public static void main(String[] args)
{
        Validator emailValidator = new EmailValidator();

        var request = new StringDTO();
//        dto.get("name"), dto.get("email"), dto.get("pass")
        request.set("email", "test@test.cloud");
        request.set("name", "John");
        request.set("pass", "John");




        var result = emailValidator.validate(request);

        System.out.println(result);
}
}
