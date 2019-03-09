package com.anshuman.usermanagement.user.service;

import com.anshuman.usermanagement.user.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();

        User u1 = new User();
        u1.setUserId(1);
        u1.setTitle(country =="IN" ? "Shri." : "Mr.");
        u1.setFirstName("Anshuman");
        u1.setLastName("Singh");

        User u2 = new User();
        u2.setUserId(2);
        u2.setTitle(country =="IN" ? "Shri." : "Mr.");
        u2.setFirstName("Arora");
        u2.setLastName("Anuj");

        users.add(u1);
        users.add(u2);

        return users;
    }
}
