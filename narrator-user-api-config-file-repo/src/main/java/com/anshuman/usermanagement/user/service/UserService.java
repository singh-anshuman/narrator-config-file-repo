package com.anshuman.usermanagement.user.service;

import com.anshuman.usermanagement.user.model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    @Value("${privacy.enabled}")
    private String privacyEnabled;

    public String getPrivacyEnabled() {
        return privacyEnabled;
    }

    public void setPrivacyEnabled(String privacyEnabled) {
        this.privacyEnabled = privacyEnabled;
    }

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();

        User u1 = new User();
        u1.setUserId(1);
        u1.setTitle("Mr.");
        u1.setFirstName("Anshuman");
        u1.setLastName("Singh");
        u1.setZipCode("y".equals(privacyEnabled) ? null : "123456");

        User u2 = new User();
        u2.setUserId(2);
        u2.setTitle("Mr.");
        u2.setFirstName("Arora");
        u2.setLastName("Anuj");
        u2.setZipCode("y".equals(privacyEnabled) ? null : "313131");

        User u3 = new User();
        u3.setUserId(2);
        u3.setTitle("Mrs.");
        u3.setFirstName("Neha");
        u3.setLastName("Upadhyay");
        u3.setZipCode("y".equals(privacyEnabled) ? null : "302033");

        users.add(u1);
        users.add(u2);
        users.add(u3);

        return users;
    }
}
