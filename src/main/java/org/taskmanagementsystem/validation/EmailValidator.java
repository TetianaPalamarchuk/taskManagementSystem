package org.taskmanagementsystem.validation;


import org.taskmanagementsystem.dto.StringDTO;
import java.util.regex.Pattern;

public class EmailValidator extends Validator {
static public final String EMAIL_RE = "^[A-Za-z0-9+_.-]+@(.+)$";

public EmailValidator()
{
        add(request ->
        {
                var status = new StringDTO();
                var email = request.get("email");
                var pattern = Pattern.compile(EMAIL_RE);
                var matcher = pattern.matcher(email);

                status.set("status", "OK");

                if(!matcher.matches()) {
                        status.set("status", "ERROR");
                        status.set("message", "e-mail `" + email + "'"
                                + " is malformed");
                }

                return status;
        });
}

public static void main(String[] args)
{
        Validator emailValidator = new EmailValidator();

//        dto.get("name"), dto.get("email"), dto.get("pass")
        String email = "";
        String name = "";
        String pass = "";

        var request = new StringDTO();

        request.set("email", "test@test.cloud");
//        request.set("email", "test-test.cloud");
        request.set("name", "John");
        request.set("pass", "12edadad");

        var result = emailValidator.validate(request);

        System.out.println(request);
        System.out.println(result);
        System.out.println("Is OK? " + Validator.isOk(result));
}
}
