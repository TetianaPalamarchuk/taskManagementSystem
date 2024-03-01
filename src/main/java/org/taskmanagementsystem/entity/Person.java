package org.taskmanagementsystem.entity;

import org.taskmanagementsystem.utils.security.StringEncoder;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Person {
private UUID id;
private String name;
private String email;
private String  passwdHash;
private String role;
private List<Task> tasks;

public Person() {
}
public Person(String name, String email, String pass) {
        utils.security.Encoder encoder = new StringEncoder();
        this.id = new UUID(100,1);
        this.name = name;
        this.email = email;
        this.passwdHash = encoder.encode(pass);
        this.role = "User";
        this.tasks = new ArrayList<>();
}
public UUID getId() {
        return id;
}
public String getName() {
        return name;
}
public String getLogin() {
        return email;
}
public String getPasswdHash() {
        return passwdHash;
}
        public String getRole() {
                return role;
        }
        public List<Task> getTasks() {
                return tasks;
        }

        public void setRole(String role) {
                this.role = role;
        }
}
