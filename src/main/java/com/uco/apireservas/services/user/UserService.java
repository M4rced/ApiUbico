package com.uco.apireservas.services.user;

import com.uco.apireservas.domain.user.UserUbico;
import com.uco.apireservas.controllers.dto.UserRegistrationDto;

import com.uco.apireservas.repository.user.UserRepository;
import com.uco.apireservas.services.user.UserServiceImp.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface UserService {


    UserUbico create(UserUbico userUbico);

    void delete(UserUbico userUbico);

    Optional<UserUbico> findById(Integer id);

    List<UserUbico> getAllUsers();


}
