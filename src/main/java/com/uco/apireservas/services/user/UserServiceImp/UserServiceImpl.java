package com.uco.apireservas.services.user.UserServiceImp;

import com.uco.apireservas.domain.user.UserUbico;
import com.uco.apireservas.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Component

@Service
public class UserServiceImpl {
    @Autowired
    private UserRepository userRepository;

    public UserUbico create(UserUbico userUbico) {
        return userRepository.save(userUbico);
    }

    public List<UserUbico> getAllUsers() {
        return userRepository.findAll();
    }

    public void delete(UserUbico userUbico) {
        userRepository.delete(userUbico);
    }

    public Optional<UserUbico> create(Integer id) {
        return userRepository.findById(id);
    }
}
