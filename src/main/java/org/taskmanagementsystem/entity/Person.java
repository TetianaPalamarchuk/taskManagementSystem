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
private boolean isManager;
private List<Task> tasks;

public Person() {
}

public boolean isManager()
{
        return isManager;
}

public void setManager(boolean manager)
{
        isManager = manager;
}

public Person(String name, String email, String pass) {
        org.taskmanagementsystem.utils.security.Encoder encoder = new StringEncoder();
        this.id = UUID.randomUUID();
        this.name = name;
        this.email = email;
        this.passwdHash = encoder.encode(pass);
        this.isManager = false;
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

        public List<Task> getTasks() {
                return tasks;
        }
        public String getEmail() { return email; }

        public void setId(UUID id) {
                this.id = id;
        }
        public void setName(String name) {
                this.name = name;
        }
        public void setEmail(String email) {
                this.email = email;
        }
        public void setPasswdHash(String passwdHash) {
                this.passwdHash = passwdHash;
        }
}
