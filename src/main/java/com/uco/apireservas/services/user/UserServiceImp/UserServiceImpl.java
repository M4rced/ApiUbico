package com.uco.apireservas.services.user.UserServiceImp;

import com.uco.apireservas.domain.user.UserUbico;
import com.uco.apireservas.repository.user.UserRepository;
import com.uco.apireservas.services.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Component

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserUbico create(UserUbico userUbico) {
        return userRepository.save(userUbico);
    }
    @Override
    public void delete(UserUbico userUbico) {
        userRepository.delete(userUbico);
    }

    @Override
    public Optional<UserUbico> findById(Integer id) {
        return userRepository.findById(id);
    }
    @Override
    public List<UserUbico> getAllUsers() {
        return userRepository.findAll();
    }




}
