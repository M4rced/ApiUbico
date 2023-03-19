package com.uco.apireservas.services.user;

import com.uco.apireservas.domain.user.User;

import java.util.List;
public interface UserService {
    List<User> getAllUsers();
    void saveUser(User user);
}
